package com.springcore.annotations.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/springcore/annotations/autowired/autoConfig.xml");
		Emp1 emp1 = context.getBean("Emp1", Emp1.class);
		System.out.println(emp1);

	}

}
