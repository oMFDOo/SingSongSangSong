package com.ssafy.singsongsangsong.security.oauth2;

import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;

import com.ssafy.singsongsangsong.constants.Role;

import lombok.Getter;

@Getter
public class CustomOAuth2User extends DefaultOAuth2User {

	private String email;
	private Role role;

	public CustomOAuth2User(Collection<? extends GrantedAuthority> authorities,
		Map<String, Object> attributes, String nameAttributeKey,
		String email, Role role) {
		super(authorities, attributes, nameAttributeKey);
		this.email = email;
		this.role = role;
	}
}