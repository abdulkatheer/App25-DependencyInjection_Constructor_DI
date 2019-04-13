package org.katheer.test;

import org.katheer.bean.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        Injecting resources through constructor is Constructor DI
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("org/ka" +
                "theer/resource/applicationContext.xml");

        Course course1 = (Course) context.getBean("course1");
        course1.getCourseDetails();

        Course course2 = (Course) context.getBean("course2");
        course2.getCourseDetails();

        Course course3 = (Course) context.getBean("course3");
        course3.getCourseDetails();

        Course course4 = (Course) context.getBean("course4");
        course4.getCourseDetails();
    }
}
