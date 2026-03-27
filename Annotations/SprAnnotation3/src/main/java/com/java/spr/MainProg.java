package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProg {
	public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Person p1 = ctx.getBean("personRupesh", Person.class);
        Person p2 = ctx.getBean("personArvind", Person.class);
        Person p3 = ctx.getBean("personSelvi", Person.class);

        p1.showAllInfo();
        p2.showAllInfo();
        p3.showAllInfo();

	}
}
