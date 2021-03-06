/**
 * @author: Sly Kint A. Bacalso
 * @date: Nov 10, 2021
 * @description: This class is used to create a cylinder object.
 * @github: github.com/slyg3nius
 */

package oop;

class MyPoint{
    private int x;
    private int y;
    public MyPoint(){}
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}

class Circle {
    private MyPoint center;
    private float radius;

    // default constructor
    public Circle(){
        this.center = new MyPoint();
        this.radius = .0F;
    }
    
    // constructor that takes center and radius
    public Circle(MyPoint center, float radius){
        this.center = center;
        this.radius = radius;
    }

    public Circle(int x, int y, float radius){
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    /**
     * Setter for radius
     * @param radius
     */
    public void setRadius(float radius){
        this.radius = radius;
    }

    /**
     * Setter for center
     * @param center
     */
    public void setCenter(int x, int y){
        this.center = new MyPoint(x,y);
    }

    /**
     * Getter for radius
     * @return radius
     */
    public float getRadius(){
        return radius;
    }

    /**
     * Getter for center
     * @return center
     */
    public MyPoint getCenter(){
        return center;
    }

    /**
     * Calculates the area of the circle
     * @return area
     */
    public float getArea(){
        return (float) (Math.PI * radius * radius);
    }

    /**
     * Calculates the circumference of the circle
     * @return circumference
     */
    public float getCircumference(){
        return (float) (2 * Math.PI * radius);
    }

    public String toString(){
        return "Radius: " +String.format("%.2f",this.radius)+ "\nPoint: "+center;
    }

    public boolean equals(Object o){
        if(o instanceof Circle ){
            Circle c = (Circle) o;
            return this.center == c.center && this.radius == c.radius;
        }
        return false;
    }
}

public class Cylinder {
    private Circle base;
    private float height;
    
    public Cylinder(){}

    public Cylinder(Circle base, float height) {
        this.base = base;
        this.height = height;
    }

    public void setCircle(int x, int y, float radius){
        base = new Circle(x, y, radius);
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Circle getCircle() {
        return base;
    }

    public float getHeight() {
        return height;
    }
    
    public String getVolume(){
        float volume = (float) (Math.PI * Math.pow(base.getRadius(), 2) * height);
        return String.format("%.2f", volume);
    }

    public String getArea() {
        float area = 2 * (float) Math.PI * base.getRadius() * (height + base.getRadius());
        return String.format("%.2f", area);
    }

    public String toString() {;
        return base+"\nHeight: "+ String.format("%.2f", height);
    }

    public boolean equals(Object o) {
        if(o instanceof Cylinder){
            Cylinder c = (Cylinder) o;
            return this.base.getArea() == c.base.getArea() && this.height == c.height;
        }
        return false;
    }
}