package com.hsbc.aspects;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTracker {
	
	@Before(
		"execution(* com.hsbc.model.service.UserService.*(..))"
	)
	public void trackFetch() {
		LocalDateTime time = LocalDateTime.now();
		System.out.println("____fetch user is called on "+time+"_____");
	}
	// try to create advice that executes after fetchUser(int id)
}
