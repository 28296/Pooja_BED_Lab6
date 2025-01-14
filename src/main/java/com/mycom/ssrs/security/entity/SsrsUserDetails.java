package com.mycom.ssrs.security.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SsrsUserDetails implements UserDetails {

	private User user;

	public SsrsUserDetails(User user) {
		this.user = user;
	}

	 @Override
	  public Collection<? extends GrantedAuthority> getAuthorities() {
	    List<Role> roles = user.getRoles();
	    List<SimpleGrantedAuthority> authorities = new ArrayList<>();

	    for (Role role : roles) {
	      authorities.add(new SimpleGrantedAuthority(role.getName()));
	    }

	    return authorities;
	  }  


	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
