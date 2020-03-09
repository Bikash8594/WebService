package in.nit;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TestJwt {

	public static void main(String[] args) {
		String sec="Nit";
		String token=Jwts.builder().setId("2020").setSubject("Bms").setIssuer("Paytm")
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()
				+ TimeUnit.MINUTES.toMillis(2)))
				.signWith(SignatureAlgorithm.HS256,
						Base64.getEncoder().encode(
								sec.getBytes())
				).compact();
		System.out.println(token);
		//----------------------------------
		Claims c=Jwts.parser()
				.setSigningKey(Base64.getEncoder().encode(sec.getBytes()))
				.parseClaimsJws(token).getBody();
		
		System.out.println(c.getId());
		System.out.println(c.getSubject());
		System.out.println(c.getIssuer());
		System.out.println(c.getIssuedAt());
		System.out.println(c.getExpiration());
	}

}
