package org.agm;

public class Triangle {
    private String type;
    private String color;

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
}
