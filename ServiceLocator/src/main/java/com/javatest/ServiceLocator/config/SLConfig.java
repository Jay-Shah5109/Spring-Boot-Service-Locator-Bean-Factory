package com.javatest.ServiceLocator.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.javatest.ServiceLocator.service.PaymentRegistry;

@Configuration
public class SLConfig {
	
	@Bean
	public FactoryBean<?> getBean(){
		ServiceLocatorFactoryBean bean=new ServiceLocatorFactoryBean();
		bean.setServiceLocatorInterface(PaymentRegistry.class);
		return bean;
		
	}

}
