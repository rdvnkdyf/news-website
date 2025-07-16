package com.newswebsite.domain.security;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority{
	
	private final String _authority;
	
	public Authority(String authority) {
		this._authority = authority;
		
	}

	@Override
	public String getAuthority() {
		return _authority;
		
	}

}
