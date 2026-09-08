package org.agm;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

// Demonstrating one of the ways to exhibit lifecycel callbacks
public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {
    private String type;
    private String color;
    ApplicationContext context = null;
    String beanName;

    public Triangle() {
    }

    public Triangle(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw(){
        System.out.println(getType()+" Triangle Drawn with color "+getColor());
    }

    public void showBeanName(){
        System.out.println("The class bean is called = "+this.beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(" Cleanup of Triangle Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" Pre initialisation step of Triangle Bean");
    }
}
