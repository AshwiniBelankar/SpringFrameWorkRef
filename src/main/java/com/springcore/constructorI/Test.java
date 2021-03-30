package com.springcore.constructorI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/springcore/constructorI/constConfig.xml");
		Employee emp1 = (Employee)context.getBean("e");
		System.out.println(emp1);

	}

}
