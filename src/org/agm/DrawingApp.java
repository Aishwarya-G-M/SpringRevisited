package org.agm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DrawingApp {
    public static void main(String[] args) {
        // The next 2 lines is not using Spring
        Triangle triangle = new Triangle();
        System.out.println("Triangle without using spring:");
        triangle.draw();

        // Now using Spring will look like:
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        Triangle triangle2 = (Triangle) bf.getBean("triangle");
        triangle2.draw();

        // Same logic as above but using Application Context instead of BeanFactory
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle3 = (Triangle) applicationContext.getBean("triangle");
        triangle3.draw();

        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle4 = (Triangle) applicationContext2.getBean("triangle");
        triangle4.draw();

        ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("spring.xml");
        TriangleWithPoint triangleWithPoint = (TriangleWithPoint) applicationContext3.getBean("triangleWithPoint");
        triangleWithPoint.draw();
    }
}
