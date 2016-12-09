/**
 * 
 * 登录后框架
 * 
 * 发布视频资源
 */
// 地址 	{站点根目录}face/user/publish_movie_resouce.do
// 请求方式 get/post 
/**
 * data 参数说明
 * 
 * rootPubConlumnId	5822890fef722c27e2824f23 //固定 视频根目录类别编号
 * pubConlumnId		视频分类别编号
 * 
 * 	//正常
	public static final Integer state_nomal = 						1;
	//异常
	public static final Integer state_false = 						2;
	//回收站
	public static final Integer state_huishouzhan = 				3;
	//删除
	public static final Integer state_delete_ondisk = 				4;
	//上传资源
	public static final Integer state_shangchuanziyuan = 			11;
 * 
 */
// 返回样例 {"statusCode":"300","message":"错误原因！"}//错误
// 返回结果
var result = {
		"data" : [ {
			"id" : "5822c12fef722c0e3720f1cf",
			"pub_id" : "5822c12fef722c0e3720f1cf",
			"name" : "资源名称",
			"intro" : "6LWE5rqQ57G75Z6LLW1wNF9ybXZiIOetiQ==",
			"state" : "2",
			"pic" : "attachFiles/20161109/5822c12fef722c0e3720f1cf/5822c12fef722c0e3720f1d0_file",
			"showTime" : "2016-11-09 14:24:47",
			"rootPubConlumnId" : "5822890fef722c27e2824f23",
			"rootPubConlumnName" : "影视资源",
			"secondPubConlumnId" : "58228ed2ef722c27e2824f2a",
			"secondPubConlumnName" : "影视",
			"comment_list" : [],
			"file_type" : "资源类型-mp4_rmvb 等",
			"user_huiyuan_id" : "582287baef722c27e2824f21",
			"price_fen" : "0",
			"hash" : "资源散列"
		} ],
		"page" : "1",
		"lastPage" : "1",
		"pageSize" : "15",
		"count" : "1",
		"statusCode" : "200"
	}