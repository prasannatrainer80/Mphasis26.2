package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		  ApplicationContext ctx =
	                new AnnotationConfigApplicationContext(AppConfig.class);

	        Trainer trainer = ctx.getBean("trainer", Trainer.class);

	        trainer.showInfo();

	}
}
