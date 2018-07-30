package com.fil;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LibLogAspect {

	
	@Before ("execution(* com.fil.Lib*.get*(..))")
	public void logBeforeLibService(JoinPoint joinPoint){
		System.out.println("before  "+ joinPoint.getSignature().getName() );
	}
	
	
	@After ("within(com.fil.LibServiceImp)")
	public void logAfterLibService(JoinPoint joinPoint){
		System.out.println("After   "+ joinPoint.getSignature().getName());
		Object[] args= joinPoint.getArgs();
		System.out.println("Method called with args "+ Arrays.toString(args));
	}
	
}
