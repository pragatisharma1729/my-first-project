/**
 * 
 */
package com.study.app.config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.study.app.manager.AppManager;
import com.study.app.repository.AppRepo;

/**
 * @author Pragati Sharma
 *
 */
@Configuration
public class AppConfig {

	@Bean
	public AppManager appManager() {
		return new AppManager();
	}

	@Bean
	public AppRepo appRepo() {
		return new AppRepo();
	}

	@Bean
	public Mapper mapper() {
		return new DozerBeanMapper();
	}

}
