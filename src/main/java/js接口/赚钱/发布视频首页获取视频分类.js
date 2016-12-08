/**
 * 登录后框架
 * 
 * 发布视频首页获取视频分类
 */
// 地址 	{站点根目录}front/list_pubConlumn.do
// 请求方式 get/post 
/**
 * 参数说明
 * 
 * page  						页码
 * pageSize						每页数量
 * father_pubConlumnId 			5822890fef722c27e2824f23	//影视资源类别根目录
 */ 
// 返回样例 {"statusCode":"300","message":"错误原因！"}//错误
// 返回结果
var result = {
		"data" : [ {
			"id" : "58228933ef722c27e2824f27",
			"name" : "视频直播"
		}, {
			"id" : "58228ec8ef722c27e2824f28",
			"name" : "录播"
		}, {
			"id" : "58228ecdef722c27e2824f29",
			"name" : "教程"
		}, {
			"id" : "58228ed2ef722c27e2824f2a",
			"name" : "影视"
		} ],
		"page" : "1",
		"lastPage" : "1",
		"pageSize" : "15",
		"count" : "4",
		"statusCode" : "200",
		"message" : "返回成功!"
	}