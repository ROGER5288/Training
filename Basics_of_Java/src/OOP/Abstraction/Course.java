package OOP.Abstraction;

abstract class Course {

    String name;

    Course(String name) {
        this.name = name;
    }

    // concrete method
    void courseInfo() {
        System.out.println("Course Name: " + name);
    }

    // abstract method
    abstract double coursePrice();
}