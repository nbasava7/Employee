package com.basu;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
     ModelMapper modelMapper() {
        return new ModelMapper();
    }
    
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception { http
	 * .authorizeRequests() .antMatchers("/swagger-ui/**", "/v3/api-docs/**",
	 * "/swagger-ui.html").permitAll() // Allow access to Swagger UI
	 * .anyRequest().authenticated(); // Secure other APIs }
	 */
}
