package com.in28minutes.spring.basics.springin10steps;

import com.in28minutes.spring.basics.springin10steps.xml.XmlJdbcConnection;
import com.in28minutes.spring.basics.springin10steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn10StepsXmlApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn10StepsXmlApplication.class);

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Classpath value is "+ classPathXmlApplicationContext);

        LOGGER.info("Beans Loaded --> {}", (Object) classPathXmlApplicationContext.getBeanDefinitionNames());

        XmlPersonDAO xmlPersonDAO= classPathXmlApplicationContext.getBean(XmlPersonDAO.class);
        System.out.println("XmlPersonDAO value is "+ xmlPersonDAO);

        XmlJdbcConnection xmlJdbcConnection= classPathXmlApplicationContext.getBean(XmlJdbcConnection.class);
        System.out.println("XmlJdbcConnection value is "+ xmlJdbcConnection);

        LOGGER.info("{}", xmlPersonDAO);
        LOGGER.info("{}", xmlPersonDAO.getXmlJdbcConnection());

        LOGGER.info("{}", xmlJdbcConnection);
    }

}
