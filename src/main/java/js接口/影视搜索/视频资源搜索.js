/**
 * 搜索视频资源
 */
// 地址 	{站点根目录}front/list_pub.do
// 请求方式 get/post 
/**
 * 参数说明
 * 
 * page  						页码
 * pageSize						每页数量
 * rootPubConlumnId 			5822890fef722c27e2824f23	//影视资源类别根目录 固定
 * pubConlumnId					58228ecdef722c27e2824f29
 * name							视频资源的名称		支持模糊搜索
 * tag_string					视频资源的标签搜索	
 */ 
// 返回样例 {"statusCode":"300","message":"错误原因！"}//错误
// 返回结果
var result = {
		"data" : [ {
			"id" : "582886fdef70d147f68d219f",
			"pub_id" : "582886fdef70d147f68d219f",
			"name" : "资源名称2",
			"intro" : "6LWE5rqQ57G75Z6LLW1wNF9ybXZiIOetiQ==",
			"state" : "1",
			"pic" : "attachFiles/20161109/5822c12fef722c0e3720f1cf/5822c12fef722c0e3720f1d0_file",
			"showTime" : "2016-11-13 23:30:05",
			"rootPubConlumnId" : "5822890fef722c27e2824f23",
			"rootPubConlumnName" : "影视资源",
			"secondPubConlumnId" : "58228ecdef722c27e2824f29",
			"secondPubConlumnName" : "教程",
			"comment_list" : []
		} ],
		"page" : "1",
		"lastPage" : "1",
		"pageSize" : "15",
		"count" : "1",
		"statusCode" : "200",
		"message" : "返回成功!"
	}