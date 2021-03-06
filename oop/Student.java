package oop;

public class Student {
    // default value is null for objects and 0 numbers
    private int id;
    private String name;
    private String course;
    private int year;
    private double tuitionFee;

    //if there is no constructor in the class this will automatically provided by java

    //default constructor
    public Student(){
        this(1, "Charmaine Resma", "BSIT", 2, 28000);
    }

    // constructor
    public Student(int id, String name, String course, int year, double tuitionFee){
        this.id = id;
        this.name = name;
        this.course = course;
        this.year = year;
        this.tuitionFee = tuitionFee;
    }

    public void display(){
        System.out.println(id+" "+name+" "+course+" "+year+" "+tuitionFee);
    }

    // overide equals method to compare all the fields
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student s = (Student) obj;
            return this.id == s.id && this.name.equals(s.name) && this.course.equals(s.course) && this.year == s.year && this.tuitionFee == s.tuitionFee;
        }
        return false;
    }
}
