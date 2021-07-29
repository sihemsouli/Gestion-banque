package tn.grp3DL1.banque.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import tn.grp3DL1.banque.config.Performance;


@Component
@Aspect
public class Performance {

	private static final Logger l = LogManager.getLogger(Performance.class);
	@Around("execution(* tn.grp3DL1.banque.service.*.*(..))")
    public Object profile(ProceedingJoinPoint xyz) throws Throwable {
            long start = System.currentTimeMillis();
         //  xyz.proceed();
           Object ret= xyz.proceed();
            long elapsedTime = System.currentTimeMillis() - start;
            l.info("Method execution time: " + elapsedTime + " milliseconds.");
           return ret;

}
}