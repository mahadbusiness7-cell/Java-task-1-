// Job: Store and display distances in feet and inches using constructors.

class Distance {
    int feet;
    int inches;

    Distance() {
        feet = 0;
        inches = 0;
    }

    Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}

public class Main {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance(5, 8);

        System.out.println("Distance 1:");
        d1.display();

        System.out.println("\nDistance 2:");
        d2.display();
    }
}
