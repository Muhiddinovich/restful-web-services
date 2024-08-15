package com.in28minutes.rest.webservices.restful_web_services.securiy;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
	
	@Bean
	public SecurityFilterChain filterChaind(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				auth-> auth.anyRequest().authenticated()
				);
		
		http.httpBasic(withDefaults());
		
		http.csrf().disable();
		return http.build();
		
	}

}
