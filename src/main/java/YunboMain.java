import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.JsonObject;

public class YunboMain {

	/**
	 * 服务器地址
	 */
	public static final String baseUrl = "http://183.86.218.83:8080/";
	/**
	 * 本地地址
	 */
//	 public static final String baseUrl = "http://localhost:8080/yunbo/";

	public static Map<String, String> entityParemeter_map = new HashMap<String, String>();

	public static final String login_name = "machaohua";
	public static final String login_key = "6193c1a39e9b9b579336150c";
	public static final String userpwd = "123456";

	public static final Integer client_type_xml = 1;
	public static final Integer client_type_json = 2;

	public static void main(String[] args) throws Exception {
		// 简洁登录
//		 String login_simple = login_simple();
//		 System.out.println(login_simple);
		 //获取用户的基础信息
//		 String getUserInfo = getUserInfo();
//		 System.out.println(getUserInfo);
		// 更新用户的基础信息
//		 String updateSelf = updateSelf();
//		 System.out.println(updateSelf);
		 //发布视频首页获取视频分类
//		 String list_movie_pubConlumn = list_movie_pubConlumn();
//		 System.out.println(list_movie_pubConlumn);
		 //发布视频资源
//		 String publish_movie_resouce = publish_movie_resouce();
//		 System.out.println(publish_movie_resouce);
		 //我发布视频资源
//		 String list_my_movieResouce = list_my_movieResouce();
//		 System.out.println(list_my_movieResouce);
		 //更新我发布视频资源
//		 String update_movie_resouce = update_movie_resouce();
//		 System.out.println(update_movie_resouce);
		 //删除
//		 String delete_movie_resouce = delete_movie_resouce();
//		 System.out.println(delete_movie_resouce);
  		//搜索视频资源
//		 String list_movieResouce = list_movieResouce();
//		 System.out.println(list_movieResouce);
  		//搜索视频资源
//		 String list_hot_search = list_hot_search();
//		 System.out.println(list_hot_search);
  		//电影风云棒
//		 String list_fengyun = list_fengyun();
//		 System.out.println(list_fengyun);
		//获取下载链接
		 String movie_resouce_get_downloadLink = movie_resouce_get_downloadLink();
		 System.out.println(movie_resouce_get_downloadLink);
	}
	/**
	 * 获取下载链接
	 * 
	 * @return
	 * @throws Exception
	 */
	private static String movie_resouce_get_downloadLink() throws Exception {
		String urlString = baseUrl + "face/user/movie_resouce_get_downloadLink.do";
		 
		JsonObject jsonObject = new JsonObject();
		
		jsonObject.addProperty("movieResouce_id", "5849ff1d7ea6a975d9df7df3");//视频资源的系统编号
		String send_user_data = send_user_data(urlString, jsonObject.toString());
		return send_user_data;
	}
	/**
	 * 电影风云棒
	 * 
	 * @return
	 * @throws Exception
	 */
	private static String list_fengyun() throws Exception {
		entityParemeter_map.put("pubConlumnId", "58291373ef722c0a6501fa8c");//类别 固定 电影风云棒
		String listPub = listPub();
		return listPub;
	}
	/**
	 * 今日热搜
	 * 
	 * @return
	 * @throws Exception
	 */
	private static String list_hot_search() throws Exception {
		entityParemeter_map.put("pubConlumnId", "582916afef722c0d49434196");//类别 固定 今日热搜
		String listPub = listPub();
		return listPub;
	}
	/**
	 * 搜索视频资源
	 * 
	 * @return
	 * @throws Exception
	 */
	private static String list_movieResouce() throws Exception {
		entityParemeter_map.put("rootPubConlumnId", "5822890fef722c27e2824f23");//影视根目录 必传
//		entityParemeter_map.put("pubConlumnId", "58228ecdef722c27e2824f29");//视频资源的分类与 list_movie_pubConlumn接口的分类对应 动态
//		entityParemeter_map.put("name", "23");//视频资源的名称		支持模糊搜索
//		entityParemeter_map.put("tag_string", "");//视频资源的标签搜索
		String listPub = listPub();
		return listPub;
	}
	    /**
		 * 发布视频资源删除
		 * 
		 * @return
		 * @throws Exception
		 */
		private static String delete_movie_resouce() throws Exception {

			String urlString = baseUrl + "face/user/delete_movie_resouce.do";
			 
			
			JsonObject jsonObject = new JsonObject();
			
			jsonObject.addProperty("pubId", "5829c7237ea6a971e11cd4e8");//视频资源的系统编号

			String send_user_data = send_user_data(urlString, jsonObject.toString());

			return send_user_data;
		}   
	/**
	 * 发布视频资源
	 * 
	 * @return
	 * @throws Exception
	 */
	private static String update_movie_resouce() throws Exception {

		String urlString = baseUrl + "face/user/update_movie_resouce.do";
		/**
		 * 正常共享资源
		 */
		Integer state_nomal = 			1;
		/**
		 * 下架资源
		 */
		Integer state_false = 			2;
		
		JsonObject jsonObject = new JsonObject();
		
		jsonObject.addProperty("pubId", "5829c7237ea6a971e11cd4e8");//视频资源的系统编号
		jsonObject.addProperty("name", "资1源2名3称123");
		jsonObject.addProperty("state", state_false+"");//资源大小-字节
		jsonObject.addProperty("intro", "资源类型-mp4_rmvb 等");
		String send_user_data = send_user_data(urlString, jsonObject.toString());

		return send_user_data;
	}
	 /**
	 * 我发布的视频资源
	 * 
	 * @return
	 * @throws Exception
	 */
	private static String list_my_movieResouce() throws Exception {
		//影视的根资源
		String urlString = baseUrl + "face/user/list_movieResouce.do";
		
		JsonObject jsonObject = new JsonObject();
		//影视的根资源的根栏目
		jsonObject.addProperty("rootPubConlumnId", "5822890fef722c27e2824f23");
		//详情见 发布视频首页获取视频分类.js
//		jsonObject.addProperty("pubConlumnId", "5822890fef722c27e2824f23");

		String send_user_data = send_user_data(urlString, jsonObject.toString());

		return send_user_data;
	}
	 /**
		 * 发布视频资源
		 * 
		 * @return
		 * @throws Exception
		 */
		private static String publish_movie_resouce() throws Exception {

			String urlString = baseUrl + "face/user/publish_movie_resouce.do";
			
			String filePath = "/home/lymava/下载/首页.jpg";
			
			JsonObject jsonObject = new JsonObject();
			
			jsonObject.addProperty("name", "新的");
			jsonObject.addProperty("file_size", "2012321564737");//资源大小-字节
			jsonObject.addProperty("file_type", "mp4");
			jsonObject.addProperty("price_fen", "1");
			jsonObject.addProperty("hash", Md5Util.md5File(filePath));
			jsonObject.addProperty("intro", "视频资源简介");
			jsonObject.addProperty("pubConlumnId", "58228ed2ef722c27e2824f2a");//list_movie_pubConlumn 获取的
			
			byte[] readByte = IOUtil.readByte("/home/lymava/workhome/program/云播/云播 -10.21/logo/1024 拷贝.png");
			
			String encodeHexString = HexM.encodeHexString(readByte);
			
			jsonObject.addProperty("pic","<file>"+encodeHexString+"</file>");

			String send_user_data = send_user_data(urlString, jsonObject.toString());

			return send_user_data;
		}
	
		
			/**
			 * 获取内容列表
			 * 
			 * @return
			 * @throws Exception
			 */
			private static String listPub() throws Exception {

				String urlString = baseUrl + "front/list_pub.do";

				HttpPost hp = new HttpPost(new URL(urlString));
				
				Set<Entry<String, String>> entrySet = entityParemeter_map.entrySet();
				for (Entry<String, String> entityKeyValue : entrySet) {
					hp.addParemeter(entityKeyValue.getKey(), entityKeyValue.getValue()+"");
				}
				
				hp.addParemeter("page", "1");
				hp.addParemeter("pageSize", "15");
				String result = hp.getResult();

				return result;
			}
	 /**
	 * 发布视频首页获取视频分类
	 * 
	 * @return
	 * @throws Exception
	 */
	private static String list_movie_pubConlumn() throws Exception {
		//这个固定的
		entityParemeter_map.put("father_pubConlumnId", "5822890fef722c27e2824f23");
		return list_pubConlumn();
	}
	 /**
		 * 获取内容列表
		 * 
		 * @return
		 * @throws Exception
		 */
		private static String list_pubConlumn() throws Exception {

			String urlString = baseUrl + "front/list_pubConlumn.do";

			HttpPost hp = new HttpPost(new URL(urlString));
			
			Set<Entry<String, String>> entrySet = entityParemeter_map.entrySet();
			for (Entry<String, String> entityKeyValue : entrySet) {
				hp.addParemeter(entityKeyValue.getKey(), entityKeyValue.getValue()+"");
			}
			
			hp.addParemeter("page", "1");
			hp.addParemeter("pageSize", "15");
			String result = hp.getResult();

			return result;
		}
	 /**
	 * 更新用户的基础信息
	 * 
	 * @return
	 * @throws Exception
	 */
	private static String updateSelf() throws Exception {

		String urlString = baseUrl + "face/user/updateSelf.do";
		
		JsonObject jsonObject = new JsonObject();
		
		jsonObject.addProperty("realname", "豆豆");
		jsonObject.addProperty("nickname", "潘潘");
		jsonObject.addProperty("phone", "联系电话");
		jsonObject.addProperty("addr", "地址");
		jsonObject.addProperty("sheng", "省");
		jsonObject.addProperty("shi", "市");
		jsonObject.addProperty("birthDate", "出生日期");
		
		byte[] readByte = IOUtil.readByte("/home/lymava/workhome/program/云播/云播 -10.21/赚钱/发布.png");
		
		String encodeHexString = HexM.encodeHexString(readByte);
		
		jsonObject.addProperty("pic", encodeHexString);
		jsonObject.addProperty("idCard", "证件号码");

		String send_user_data = send_user_data(urlString, jsonObject.toString());

		return send_user_data;
	}
	 /**
		 * 简洁登录
		 * 
		 * @return
		 * @throws Exception
		 */
		private static String login_simple() throws Exception {
			
			 String randCode = System.currentTimeMillis()+"";
			 
			String md5Final  = Md5Util.MD5Normal(userpwd);
			String userpwd_final = Md5Util.MD5Normal(md5Final+randCode.toLowerCase());
			
			 entityParemeter_map.put("username", login_name);
			 entityParemeter_map.put("randCode", randCode);
			 entityParemeter_map.put("userpwd", userpwd_final);

			String urlString = baseUrl + "front/login_simple.do";

			HttpPost hp = new HttpPost(new URL(urlString));
			
			Set<Entry<String, String>> entrySet = entityParemeter_map.entrySet();
			for (Entry<String, String> entityKeyValue : entrySet) {
				hp.addParemeter(entityKeyValue.getKey(), entityKeyValue.getValue()+"");
			}
			
			String result = hp.getResult();

			return result;
		}

	/**
	 * 获取用户自己信息
	 * 
	 * @return
	 * @throws Exception
	 */
	private static String getUserInfo() throws Exception {

		String urlString = baseUrl + "face/user/getUserInfo.do";

		JsonObject jsonObject = new JsonObject();

		String send_user_data = send_user_data(urlString, jsonObject.toString());

		return send_user_data;
	}

	public static String send_user_data(String url, String json) throws Exception {
		String request_data = request_data(url, login_key, login_name, json);
		return request_data;
	}

	public static String request_data(String url, String key, String name, String json) throws Exception {

		String randCode = System.currentTimeMillis() + "";

		HttpPost hp = null;

		String tempKey = Md5Util.MD5Normal(key + randCode);

		try {

			hp = new HttpPost(new URL(url));

			hp.addParemeter("name", name);
			hp.addParemeter("randCode", randCode);
			hp.addParemeter("encrpt", "enAes");
			hp.addParemeter("sign_only", "true");
			hp.addParemeter("mode", "" + client_type_json);

			hp.addParemeter("data", json);
			String mac = Md5Util.MD5Normal(tempKey + HexM.StringToHex(name) + json);
			hp.addParemeter("mac", mac);

		} catch (Exception e) {
			// 缴费或查询失败 如果是缴费 这个当缴费失败处理
			e.printStackTrace();
		}

		String result = null;
		try {
			result = hp.getResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
