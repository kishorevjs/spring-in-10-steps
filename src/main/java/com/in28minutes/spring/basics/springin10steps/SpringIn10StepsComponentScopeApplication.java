package com.in28minutes.spring.basics.springin10steps;

import com.in28minutes.spring.basics.componentscan.ComponentDOA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn10StepsComponentScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsComponentScopeApplication.class);
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsComponentScopeApplication.class);
        System.out.println("Application Context value = " + applicationContext);

        ComponentDOA personDoa = applicationContext.getBean(ComponentDOA.class);
        System.out.println(personDoa);

        LOGGER.info("{}", personDoa);

    }
}
