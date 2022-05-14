package com.lym.business.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LymAspect {

	/**
	 * 用表达式指定切入的方法
	 */
	@Pointcut("execution(public * com.lym.business.service.AopService.*(..))")
	public void lymApsect(){
		System.out.println("pointcut执行了\t"+"------------------");
	}

	/**
	 * 方法前  执行
	 * @param joinPoint
	 */
	@Before("lymApsect()")
	public void doBefore(JoinPoint joinPoint){
		System.out.println(joinPoint.getSignature().getName()+"\t"+"doBefore执行了\t"+"------------------");
	}

	/**
	 * 方法后 执行
	 * joinPoint 表示用来获取方法何请求参数列表
	 * @param joinPoint
	 */
	@After("lymApsect()")
	public void doAfter(JoinPoint joinPoint){
		System.out.println(joinPoint.getSignature().getName()+"\t"+"doAfter执行了\t"+"--------------------");
	}

	/**
	 * 方法正常返回 执行
	 * @param joinPoint
	 * @param result
	 */
	//使用Object类型result来接收返回值
	//joinpot必须写在前面
	@AfterReturning(value = "lymApsect()",returning = "result")
	public void doAfterReturning(JoinPoint joinPoint,Object result){
		System.out.println(joinPoint.getSignature().getName()+"\t"+"doAfterReturning执行了\t"+result+"----------------");
	}

	/**
	 * 方法异常 执行
	 * @param joinPoint
	 * @param exception
	 */
	//exception用来接收异常的
	@AfterThrowing(value = "lymApsect()",throwing = "exception")
	public void doAfterThrowing(JoinPoint joinPoint,Exception exception){
		System.out.println(joinPoint.getSignature().getName()+"\t"+"doAfterThrowing执行了\t"+exception+"----------------");
	}

	/**
	 * 环绕通知 也是最强大的通知 需要手动调用 在方法执行前何方法执行后都会执行
	 * @param proceedingJoinPoint
	 * @return
	 */
	@Around(value = "lymApsect()")
	public Object doAroud(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println(proceedingJoinPoint.getSignature().getName()+"\t"+"doAroud第一次执行了\t"+"----------------------");
		Object obj = null;
		try {
			//obj之前可以写目标方法执行前的逻辑
			obj = proceedingJoinPoint.proceed();
			System.out.println(proceedingJoinPoint.getSignature().getName()+"\t"+"doAroud第二次执行了\t"+"----------------------");
			return obj;
		}catch(Throwable e) {
			System.out.println("异常信息\t"+e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
	}
}
