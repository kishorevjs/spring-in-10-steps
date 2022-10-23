package com.in28minutes.spring.basics.springin10steps;

import com.in28minutes.spring.basics.springin10steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn10StepsCDIApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsCDIApplication.class);
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsCDIApplication.class);
        System.out.println("Application Context value = " + applicationContext);

        SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);

        LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
    }
}
