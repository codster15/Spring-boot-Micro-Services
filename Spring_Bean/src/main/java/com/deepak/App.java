

package com.deepak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext ac =  new ClassPathXmlApplicationContext("src/main/Bean.xml");

                car bean = ac.getBean(car.class);

                bean.processEng();


    }
}

