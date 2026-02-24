package com.java.spr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
    public Person personRupesh() {
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("Rupesh");
		JobDetails jd = new JobDetails();
		jd.setJob("Software Engineer");
		jd.setCompany("Mphasis");
		jd.setLocation("Chennai");
		Family family = new Family();
		family.setCity("Patna");
		family.setState("Bihar");
		p1.setJobDetails(jd);
		p1.setFamily(family);
		return p1;
    }

    @Bean
    public Person personArvind() {
    	Person p1 = new Person();
    	p1.setId(2);
		p1.setName("Arvind");
		JobDetails jd = new JobDetails();
		jd.setJob("Software Engineer");
		jd.setCompany("Mphasis");
		jd.setLocation("Chennai");
		Family family = new Family();
		family.setCity("Villupuram");
		family.setState("TN");
		p1.setJobDetails(jd);
		p1.setFamily(family);
		return p1;
       
    }

    @Bean
    public Person personSelvi() {
    	Person p1 = new Person();
    	p1.setId(3);
		p1.setName("Selvi");
		JobDetails jd = new JobDetails();
		jd.setJob("Software Engineer");
		jd.setCompany("Mphasis");
		jd.setLocation("Chennai");
		Family family = new Family();
		family.setCity("Madhurai");
		family.setState("Tamilnadu");
		p1.setJobDetails(jd);
		p1.setFamily(family);
		return p1;
    }

}
