package com.ak4.auth.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constants {

	@Value("${access.token.validity.seconds}")
	public String accessTokenValidity;
	
	@Value("${access.token.signing.key}")
	public String accessTokenSigningKey;
	
	@Value("${auth.app.issuer.name}")
	public String appIssuerName;

    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    
	public String getAccessTokenValidity() {
		return accessTokenValidity;
	}
	public String getAccessTokenSigningKey() {
		return accessTokenSigningKey;
	}
	public String getAppIssuerName() {
		return appIssuerName;
	}
    
    
    
    
}
