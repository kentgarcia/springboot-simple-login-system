package com.garcia.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation") // NoOpPasswordEncoder is deprecated, but we are using it for simplicity (Remove if gusto nyo naka-hash)
@Configuration
public class AuthenticationConfig {

	@Autowired
	private UserDetailsService customUserDetailsService;
	
	// Remove the comments if gusto nyo naka-hash
	// @Bean
    // public PasswordEncoder passwordEncoder() {
    //     return new BCryptPasswordEncoder();
    // }

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.userDetailsService(customUserDetailsService)
			.passwordEncoder(NoOpPasswordEncoder.getInstance()) // Comment
			//.passwordEncoder(passwordEncoder()) // Remove comments
			;
	}


}
