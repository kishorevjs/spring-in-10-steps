package com.in28minutes.spring.basics.springin10steps;

import com.in28minutes.spring.basics.springin10steps.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn10StepsPropertiesApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsPropertiesApplication.class);

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsPropertiesApplication.class);
        System.out.println("annotationConfigApplicationContext value is "+ annotationConfigApplicationContext);

        SomeExternalService someExternalService = annotationConfigApplicationContext.getBean(SomeExternalService.class);
        System.out.println("someExternalService value is "+someExternalService);

        LOGGER.info("{}", someExternalService);
        LOGGER.info("{}", someExternalService.returnServiceURl());

    }
}
