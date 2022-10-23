package com.in28minutes.spring.basics.springin10steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("quick")
    //creating a private instance
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor){

        //Implement Sorting Logic
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        //Search the array
        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("preDestroy");
    }
}