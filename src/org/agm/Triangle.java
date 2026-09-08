package org.agm;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
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
}
