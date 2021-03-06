package com.zensar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan({ "com.zensar" })
public class DispatcherConfig {

	@Bean
	public UrlBasedViewResolver viewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}

	@Bean
	public InternalResourceViewResolver viewResolver1() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB_INF/jsp/");
		vr.setSuffix(".jsp");
		vr.setViewClass(JstlView.class);
		return vr;
	}
}