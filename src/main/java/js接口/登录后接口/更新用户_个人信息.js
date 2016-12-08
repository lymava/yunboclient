/**
 * 登录后框架
 * 
 * 更新用户_个人信息
 */
// 地址 	{站点根目录}face/user/updateSelf.do
// 请求方式 get/post 
/**
 * 请求参数
 * realname	真实姓名
 * nickname	昵称
 * phone	手机号码
 * addr		联系地址
 * sheng	省
 * shi		市
 * birthDate生日
 * pic		头像(先将图片读入二进制数组/然后再base64)
 * idCard	证件号码
 */
// 返回样例 {"statusCode":"300","message":"错误原因！"}//错误
// 返回结果
var result = {
		"statusCode" : "200",
		"message" : "操作成功"
	}
