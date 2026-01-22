package OOP.Abstraction;

class OnlineCourse extends Course {

    double platformCharge;

    OnlineCourse(String name, double platformCharge) {
        super(name);
        this.platformCharge = platformCharge;
    }

    @Override
    double coursePrice() {
        return platformCharge;
    }
}