/**
 * 
 * 登录后框架
 * 
 * 资源播放地址
 */
// 地址 	{站点根目录}face/user/movie_resouce_get_downloadLink.do
// 请求方式 get/post 
/**
 * data 参数说明
 * 
 * movieResouce_id 资源系统编号
 */
// 返回样例 {"statusCode":"300","message":"错误原因！"}//错误
// 返回结果
var result = {
	"data" : {
		"get_download_link" : "http://oe3qreqh4.bkt.clouddn.com/5feb4be117e1ff6430fd947585a35e17?e=1481217131&token=EUn-dgIW2NU8-Idg9PdgxIKX6VRQhTFdxeFU4Ub-:SzRsmRWx_QIx3So2ajgvH6TSS4k="//資源下載地址
	},
	"statusCode" : "200",
	"message" : "成功！"
}
