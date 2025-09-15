package kr.co.ch02;


import kr.co.ch02.config.AppConfig;
import kr.co.ch02.sub1.Hello;
import kr.co.ch02.sub1.Welcome;
import kr.co.ch02.sub2.Computer;
import kr.co.ch02.sub3.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    날짜 : 2025.09.15
    이름 : 이민준
    내용 : Spring IoC/DI 실습
 */
public class App {
    public static void main(String[] args) {
        // 기존 객체 제어 방식
        Hello hello = new Hello();
        Welcome welcome = new Welcome();

        hello.show();
        welcome.show();

        /// ////////////////////////////////////////////
        // IoC(제어의 역전)
        /// ////////////////////////////////////////////

        // 스프링 컨테이너 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 객체 가져오기
        Hello hellobean = context.getBean(Hello.class);
        hellobean.show();

        Welcome welcomebean = (Welcome) context.getBean("wc");
        welcomebean.show();

        Computer com = (Computer) context.getBean("computer"); // 클래스 이름의 소문자로.
        com.show();


        /// ////////////////////////////////////////////
        // Spring AOP 실습
        /// ////////////////////////////////////////////

        Service service = (Service) context.getBean("service");
        service.findById();
        service.register();
        service.modify();
        service.remove();
    }
}
