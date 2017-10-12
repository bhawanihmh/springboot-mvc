package com.springbootmvc.config;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author bhawani.singh
 *
 */

@SpringBootApplication
@ComponentScan("com.springbootmvc")
public class SpringbootMVCApp  extends SpringBootServletInitializer {
	
	private static final Logger LOGGER = Logger.getLogger(SpringbootMVCApp.class.getName());
	
	/*@Bean
	public ViewResolver configureViewResolver() {
		LOGGER.info("configureViewResolver is called ");
		InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
		viewResolve.setPrefix("/WEB-INF/jsp/");
		viewResolve.setSuffix(".jsp");
		viewResolve.setOrder(2);
		viewResolve.setViewClass(JstlView.class);
		return viewResolve;
	}*/
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootMVCApp.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringbootMVCApp.class, args);
	}
}
