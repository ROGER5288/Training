package OOP.Abstraction;

public class Test2 {
    public static void main(String[] args) {

        OnlinePaidCourse opc = new OnlinePaidCourse("Java Full Stack", 1000, 4000);


        opc.courseInfo();
        System.out.println("Platform Charge: " + opc.platformCharge);
        System.out.println("Course Price: " + opc.courseFee);
        System.out.println("Total Course Price: " + opc.coursePrice());
    }
}