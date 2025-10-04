package org.example;


//just add spring core and spring context maeven dependecy

import org.example.bean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {


        //creating first bean
        ApplicationContext context=
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyBean myBean= (MyBean) context.getBean("myBean");
        System.out.println(myBean);
    }
}