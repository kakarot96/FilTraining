package com.fil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDILogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mybeans.xml");
//		LoginChecker loginChecker= applicationContext.getBean("loginChecker",LoginChecker.class);
//		System.out.println(loginChecker);
//		LoginChecker loginChecker2=applicationContext.getBean("loginChecker",LoginChecker.class);
//		System.out.println(loginChecker2);
//		if(loginChecker==loginChecker2)System.out.println("true");
//		else System.out.println("false");
		
		
//		OuterClass outer1= applicationContext.getBean("outer",OuterClass.class);
//		OuterClass outer2=applicationContext.getBean("outer",OuterClass.class);
//		System.out.println(outer1);
//		System.out.println(outer2);
//		System.out.println(outer1.getInner()==outer2.getInner());
		
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(BeansConfiguration.class);
		context.refresh();
		LoginService obj=context.getBean(LoginService.class);
		System.out.println(obj.checkValidation("kunal", "kunal")+obj.getClass().toString());
		System.out.println(obj);
		
		
		
	}

}
