package com.sc.SpringbootWebProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.sc.SpringbootWebProj.impl.*;

@SpringBootApplication
public class SpringbootWebProjApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringbootWebProjApplication.class, args);
		SearchService service = appContext.getBean(SearchService.class);
		service.search(7);
	}
 
}
