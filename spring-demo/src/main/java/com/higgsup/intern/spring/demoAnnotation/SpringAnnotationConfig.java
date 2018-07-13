package com.higgsup.intern.spring.demoAnnotation;

import com.higgsup.intern.spring.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationConfig {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-beans-annotation.xml");
        Person p = applicationContext.getBean(Person.class);
        p.showInfo();
    }

}
