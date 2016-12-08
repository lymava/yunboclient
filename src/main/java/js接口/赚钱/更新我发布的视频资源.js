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
 * pubId 被更新的资源编号 
 * name  资源名称
 * Integer state_nomal = 			1;//正常共享资源
 * state_false = 			2;//下架资源
 * state 状态
 * intro  资源接扫
 */
// 返回样例 {"statusCode":"300","message":"错误原因！"}//错误
// 返回结果
var result = {
		"statusCode" : "200",
		"message" : "资源更新成功！"
	}
