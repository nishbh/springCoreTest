package com.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =  new AnnotationConfigApplicationContext(SpringConfigure.class);
	    BeanComp bean = (BeanComp)context.getBean("BeanComp");
		System.out.println("test bean is " + bean);
		
	}

}
