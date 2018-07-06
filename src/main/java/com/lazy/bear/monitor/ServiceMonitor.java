package com.lazy.bear.monitor;

import com.lazy.bear.dao.UserMapper;
import com.lazy.bear.domain.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceMonitor {

    @AfterReturning("execution(* com..*Service.*(..))")
    public void logServiceAccess(JoinPoint joinPoint) {
        System.out.println("Completed: " + joinPoint);
    }

}
