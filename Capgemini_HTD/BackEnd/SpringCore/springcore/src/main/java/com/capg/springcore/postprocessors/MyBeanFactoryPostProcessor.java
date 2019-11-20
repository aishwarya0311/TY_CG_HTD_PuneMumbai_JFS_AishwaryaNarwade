package com.capg.springcore.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Inside My bean Factory...");
		BeanDefinition beandefinition = beanFactory.getBeanDefinition("messageBean2");
		MutablePropertyValues propertyValues = beandefinition.getPropertyValues();
		System.out.println("message via xml - " + propertyValues.getPropertyValue("message").getValue());
		propertyValues.addPropertyValue("message", "Welcome to spring-5");
	}

}//end of class
