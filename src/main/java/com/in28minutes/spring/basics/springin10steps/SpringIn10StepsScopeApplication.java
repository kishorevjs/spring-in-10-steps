package com.in28minutes.spring.basics.springin10steps;

import com.in28minutes.spring.basics.springin10steps.scope.PersonDOA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn10StepsScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsScopeApplication.class);
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsScopeApplication.class);
        System.out.println("Application Context value = " + applicationContext);

        PersonDOA personDoa = applicationContext.getBean(PersonDOA.class);
        System.out.println(personDoa);
        PersonDOA personDoa1 = applicationContext.getBean(PersonDOA.class);
        System.out.println(personDoa1);

        LOGGER.info("{}", personDoa);
        LOGGER.info("{}", personDoa.getJdbcConnection());

        LOGGER.info("{}", personDoa1);
        LOGGER.info("{}", personDoa1.getJdbcConnection());
    }
}
