// Job: Calculate and display the circumference of two circles using constructors.

class Circle {
    double radius;

    Circle() {
        radius = 1;
    }

    Circle(double radius, double unused) {
        this.radius = radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5, 0);

        System.out.println("Circumference of Circle 1: " + c1.circumference());
        System.out.println("Circumference of Circle 2: " + c2.circumference());
    }
}
