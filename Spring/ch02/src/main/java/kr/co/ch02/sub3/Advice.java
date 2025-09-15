package kr.co.ch02.sub3;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect // 관심사 모듈
@Component
public class Advice { // Advice : 관심사(부가기능)를 정의해 놓은 모듈

    // 포인트 컷 : 핵심 기능에 삽입하는 내용이 없는 참조 메서드
    @Pointcut("execution(void kr.co.ch02.sub3.Service.register())") // "반환타입 경로"
    public void insert() {}

    @Pointcut("execution(void kr.co.ch02.sub3.Service.findById())") // "반환타입 경로"
    public void select() {}

    @Before("insert() || select()") // kr.co.ch02.sub3.Service.*()가 실행되기 전에 실행될 부분
    public void before()
    {
        System.out.println("before...");
    }

    @After("insert() || select()") // kr.co.ch02.sub3.Service.*()가 실행된 후에 실행될 부분
    public void after()
    {
        System.out.println("after...");
    }

    @Around("select()")
    public void around(ProceedingJoinPoint pjp) throws Throwable
    {
        System.out.println("around before...");

        // 핵심 기능 실행
        pjp.proceed();

        System.out.println("around after...");
    }
}
