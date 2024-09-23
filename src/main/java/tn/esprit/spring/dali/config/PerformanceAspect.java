package tn.esprit.spring.dali.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class PerformanceAspect {
    @Around("execution(* tn.esprit.spring.dali.services.*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis(); Object out=pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start; log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return out;
    }


}
