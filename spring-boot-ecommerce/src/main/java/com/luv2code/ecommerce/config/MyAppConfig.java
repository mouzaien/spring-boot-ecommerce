package com.luv2code.ecommerce.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

	@Value("${allowed.origins}")
	String[] allowedOrigins;

	@Value("${spring.data.rest.base-path}")
	String basepath;

	@Override
	public void addCorsMappings(CorsRegistry cors) {
		// TODO Auto-generated method stub
		cors.addMapping(basepath + "/**").allowedOriginPatterns(allowedOrigins);
	}

}
