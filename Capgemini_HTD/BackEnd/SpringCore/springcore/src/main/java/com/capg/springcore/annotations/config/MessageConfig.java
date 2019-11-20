package com.capg.springcore.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.capg.springcore.annotations.beans.MessageBean;

@Configuration                                  //@configuration meansconfiguring the class
public class MessageConfig {

	@Bean                                     //annotaion @bean for managing the object as spring bean
	@Scope("prototype")
	public MessageBean getMessageBean( ) {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("Hello World...");
		return messageBean;
	} //end of getMessageBean()
}//end of class
