package com.domaci;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionHandlingAspect {

    @Pointcut("execution(* *(..)) && within(com.domaci..*)")
    private void allMethods() {}

    @Before("allMethods()")
    public void beforeAdvice() {
        System.out.println("Before advice executed");
    }

    @After("allMethods()")
    public void afterAdvice() {
        System.out.println("After advice executed");
    }

    @AfterThrowing(pointcut = "allMethods()", throwing = "ex")
    public void afterThrowingAdvice(Exception ex) {
        System.out.println("After throwing advice executed: " + ex.getMessage());
    }

    @AfterReturning("allMethods()")
    public void afterReturningAdvice() {
        System.out.println("After returning advice executed");
    }

    @Around("allMethods()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around advice: Before method execution");
        Object result = null;
        try {
            result = joinPoint.proceed();
            System.out.println("Around advice: After method execution (successful)");
        } catch (Exception ex) {
            System.out.println("Around advice: After method execution (exception occurred)");
            throw ex;
        }
        return result;
    }
}

