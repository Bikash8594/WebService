package in.nit;

import org.apache.commons.codec.binary.Base64;

public class TestCode {

	public static void main(String[] args) {
		//encoded system
		String s1="Welcome";
		//String to byte Array
		byte[] b1=s1.getBytes();
		//encoded byte array
		byte[] b2=Base64.encodeBase64(b1);
		//byte array to String
		String s2=new String (b2);
		System.out.println(s2);
		//Decoded Step
		byte[] b3=s2.getBytes();
		byte[] b4=Base64.decodeBase64(b3);
		String s3=new String(b4);
		System.out.println(s3);
		

	}

}
