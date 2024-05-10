package com.mycom.ssrs.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mycom.ssrs.security.entity.SsrsUserDetails;
import com.mycom.ssrs.security.entity.User;
import com.mycom.ssrs.security.repository.UserRepository;

public class SsrsUserDetailsServiceImpl implements UserDetailsService{

	 @Autowired
	    private UserRepository userRepository;

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

	      User user = userRepository.getUserByUsername(username);

	      if (user == null) {
	        throw new UsernameNotFoundException("Could not find user");
	      }

	      return new SsrsUserDetails(user);
	    }

	    
}
