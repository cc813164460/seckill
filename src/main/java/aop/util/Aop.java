package aop.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import aop.pojo.Person;

@Component
@Aspect		//指定当前类为切面类
public class Aop {
	//指定切入点表达式：拦截哪些方法：即为哪些类生成代理
	@Pointcut("execution(* aop.*.*(..))")
	public void pointCut_() {
		
	}
	
	//前置通知：在执行目标方法之前执行
	@Before("pointCut_()")
	public void begin() {
		System.out.println("开始事务/异常");
	}
	
	//后置/最终通知：在执行目标方法之后执行
	@After("pointCut_()")
	public void after() {
		System.out.println("提交事务/关闭");
	}
	
	//返回后通知：在调用目标方法结束后执行【出现异常不执行】
	@AfterReturning("pointCut_()")
	public void afterReturning() {
		System.out.println("afterReturning()");
	}
	
	//异常通知：当目标方法执行异常时候执行
	@AfterThrowing("pointCut_()")
	public void afterThrowing() {
		System.out.println("afterThrowing()");
	}
	
	//环绕通知：环绕目标方式执行
	@Around("pointCut_()")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		Object[] objs = pjp.getArgs();
		Person p = (Person)objs[0];
		System.out.println(p.getName());
		System.out.println("环绕前");
		pjp.proceed();
		System.out.println("环绕后");
	}
}
