package in.nit.helper;

import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.SignatureAlgorithm;

public interface JwtConst {
	String secret="NIT";
	String issuer="paytm";
	SignatureAlgorithm alg=SignatureAlgorithm.ES256;
	int tokenExpTime=(int) TimeUnit.MINUTES.toMillis(1);
	

}
