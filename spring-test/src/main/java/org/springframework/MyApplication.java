package org.springframework;

import org.springframework.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：RealGang
 * @description：TODO
 * @date ： 2022/11/22 10:06
 */
public class MyApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("classpath*:application.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println("test my person name:"+person.getName());
	}
}
