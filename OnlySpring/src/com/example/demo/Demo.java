package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac =
		        new ClassPathXmlApplicationContext("com/example/demo/applicationContext.xml");
		Employee e = (Employee) ac.getBean("emp");
		
		System.out.println("Employee id: "+e.getId());
		System.out.println("Employee name: "+e.getName());
		System.out.println("Employee salary: "+e.getSalary());
	}

}
