/**
 *  String key = "用户登录后服务器返回的密钥";
 * 	String tempKey =  MD5Normal(key+randCode);//标准md5方法 结果小写
 *  String mac = Md5Util.MD5Normal(tempKey+ StringToHex(name)+ data);
 *  	
 *  StringToHex 说明
 *  	将字符串转换为16进制字符串
		例  字符串  "abc"
		二进制byte数组是 97, 98, 99
		将97  98 99 转换成16进制数字 然后字符串拼接(不能要0x)
		最终结果的字符串是"616263"
 * 
 * 	name		用户登录名
	randCode	随机码(可取当前时间戳)
	encrpt		enAes(固定)
	sign_only	true(固定)
	mode		1(xml)/2(json)
	data		具体的报文(json格式或xml格式 必须urlencode)
	mac			具体的签名/签名规则是 
 * 
 */
