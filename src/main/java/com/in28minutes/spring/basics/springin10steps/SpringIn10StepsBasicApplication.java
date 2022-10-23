package com.in28minutes.spring.basics.springin10steps;

import com.in28minutes.spring.basics.springin10steps.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn10StepsBasicApplication {

//	What are the BEANS?
//	What are the DEPENDENCIES?
//	Where to search for BEANS?
	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

		try(AnnotationConfigApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsBasicApplication.class)){
			System.out.println("Application Context value = " + configurableApplicationContext);

			BinarySearchImpl binarySearch = configurableApplicationContext.getBean(BinarySearchImpl.class);
			System.out.println("Binary Search value = " + binarySearch);

			BinarySearchImpl binarySearch1 = configurableApplicationContext.getBean(BinarySearchImpl.class);
			System.out.println("Binary Search value = " + binarySearch1);

			int result = binarySearch.binarySearch(new int[] {12, 4, 5, 1}, 3);
			System.out.println(result);
		}
	}
}
