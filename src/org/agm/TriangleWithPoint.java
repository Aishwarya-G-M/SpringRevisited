package org.agm;

public class TriangleWithPoint {

    Point pointA;
    Point pointB;
    Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Point based triangle");
        System.out.println("PointA ( "+pointA.getX()+","+pointA.getY()+" )");
        System.out.println("PointB ( "+pointB.getX()+","+pointB.getY()+" )");
        System.out.println("PointC ( "+pointC.getX()+","+pointC.getY()+" )");
    }

    public void defaultInit(){
        System.out.println("From default initialisation of TriangleWithPoint bean.");
    }

    public void defaultCleanUp(){
        System.out.println("From default cleaup method of TriangleWithPoint bean.");
    }
}
