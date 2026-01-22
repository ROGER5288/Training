package OOP.Abstraction;

class OnlinePaidCourse extends OnlineCourse {

    double courseFee;

    OnlinePaidCourse(String name, double platformCharge, double courseFee) {
        super(name, platformCharge);
        this.courseFee = courseFee;
    }

    @Override
    double coursePrice() {
        return platformCharge + courseFee;
    }
}