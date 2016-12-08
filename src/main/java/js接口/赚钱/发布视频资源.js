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
 * name 资源名称 
 * file_size 字节数 
 * file_type 文件类型 
 * price_fen 资源价格 单位分 
 * hash 资源的hash值 目前暂定md5编码 
 * pubConlumnId 详见 发布视频首页获取视频分类 的返回的4个分类 
 * pic <file>图片的16进制</file> 图片的16进制两边加标签
 * intro	简介
 */
// 返回样例 {"statusCode":"300","message":"错误原因！"}//错误
// 返回结果
var result = {
		"data" : {
			"upload_token" : "EUn-dgIW2NU8-Idg9PdgxIKX6VRQhTFdxeFU4Ub-:L7h1K_mzYN62EXfO3UhTxTAFMnY=:eyJzY29wZSI6Inl1bmJvIiwiY2FsbGJhY2tVcmwiOiIvcWluaXVfdXBsb2FkX2NhbGxfYmFjay5qc3AiLCJkZWFkbGluZSI6MTQ4MTIxNTMyMSwiY2FsbGJhY2tCb2R5IjoibW92aWVSZXNvdWNlX2lkXHUwMDNkNTg0OTdmNDllZjcwZDExOWIyNWRlMTQ5In0=",//文件上传的token
			"upload_name" : "5feb4be117e1ff6430fd947585a35e17"//文件上传的名称
		},
		"statusCode" : "200",
		"message" : "资源发布成功！"
	}