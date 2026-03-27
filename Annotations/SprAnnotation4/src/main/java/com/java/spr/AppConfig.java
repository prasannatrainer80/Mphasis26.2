package com.java.spr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	 // Equivalent to <bean id="beanJobChennai">
    @Bean
    public JobDetails beanJobChennai() {
        return new JobDetails(
                "Software Engineer",
                "Mphasis",
                "Chennai"
        );
    }

    @Bean
    public Person personRupesh() {
        return new Person(
                1,
                "Rupesh",
                beanJobChennai(),   // SAME bean reused
                new Family("Patna", "Bihar")
        );
    }

    @Bean
    public Person personArvind() {
        return new Person(
                2,
                "Arvind",
                beanJobChennai(),   // SAME bean reused
                new Family("Kadaloor", "TamilNadu")
        );
    }

    @Bean
    public Person personSelvi() {
        return new Person(
                3,
                "Selvi",
                beanJobChennai(),   // SAME bean reused
                new Family("Madhurai", "TamilNadu")
        );
    }

}
