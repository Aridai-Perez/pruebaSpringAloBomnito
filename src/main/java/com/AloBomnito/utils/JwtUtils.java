package com.AloBomnito.utils;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtUtils {
	@Value("${app.jwtSecret}")
	private String jwtSecret;
	
	@Value("${app.jwtExpirationMs}")
	private int jwtExpirationMs;
	
	public String generateJwtToken(Authentication authentication) {
		String username = authentication.getName();
		SecretKey key = Jwts.SIG.HS256.key().build();
		return Jwts.builder().subject(username).issuedAt(new Date())
				.expiration(new Date((new Date()).getTime() + jwtExpirationMs))
						.signWith(key).compact();
	}
	
	@Deprecated
	public String getUserNameFromtJwtToken(String token) {
		Claims claims = Jwts.parser().setSigningKey(token).build().parseClaimsJws(token).getBody();
		return claims.getSubject();
	}
	
	@Deprecated
	public boolean validateJwtToken(String authToken) {
		try {
			Jwts.parser().setSigningKey(jwtSecret).build().parseClaimsJws(authToken);
			return true;
		} catch(Exception e) {
			
		}
		return false;
	}
	
}
