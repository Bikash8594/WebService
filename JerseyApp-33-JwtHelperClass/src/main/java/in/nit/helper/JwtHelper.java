package in.nit.helper;

import java.util.Base64;
import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JwtHelper {
	public String issueToken(String id,String subject) {
		Date now=new Date(System.currentTimeMillis());
		Date exp=new Date(System.currentTimeMillis()+
				JwtConst.tokenExpTime);
		return Jwts.builder()
				.setId(id)
				.setSubject(subject)
				.setIssuer(JwtConst.issuer)
				.setIssuedAt(now)
				.setExpiration(exp)
				.signWith(JwtConst.alg,Base64.getEncoder()
						.encode(JwtConst.secret.getBytes())
						).compact();
	}
		public Claims ValidateToken(String token) {
			return Jwts.parser().setSigningKey(
					Base64.getEncoder().encode(JwtConst.secret.getBytes())
					).parseClaimsJws(token).getBody();
		}
		public String readSub(String token) {
			Claims c=ValidateToken(token);
			return c.getSubject();
		}
		
		public String readId(String token) {
			Claims c=ValidateToken(token);
			return c.getId();
			
		}
			
}
	


