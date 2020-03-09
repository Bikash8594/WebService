package in.nit.util;

import org.apache.commons.codec.binary.Base64;

public class SecureUtil {
	public static String convert(String un,String pwd) {
		//1.concatination
		String auth=new StringBuffer().append(un).append(":").append(pwd).toString();
		//2.Encode data
		byte[]arr=Base64.encodeBase64(auth.getBytes());
		auth=new String(arr);
		//3.add prefix basic<space>
		auth=new StringBuffer().append("Basic").append(auth).toString();
		
		return auth;
		
	}

}
