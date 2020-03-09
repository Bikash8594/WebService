package in.nit.test;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Test {

	public static void main(String[] args) {
		
		String sec="Nit";
	String token=	Jwts.builder()
		.setId("525256")
		.setSubject("Biscuit")
		.setIssuer("Paytm")	
		.setIssuedAt(new Date(
				System.currentTimeMillis()))
		.setExpiration(new Date(
				System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(1)
				))
		.signWith(SignatureAlgorithm.HS256,Base64.getEncoder().encode(sec.getBytes()))
		.compact();
		System.out.println(token);
		
	}

}
