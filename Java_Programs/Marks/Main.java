// Job: Calculate and display the sum of three marks using constructors.

class Marks {
    int mark1;
    int mark2;
    int mark3;

    Marks() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    Marks(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    int calculateSum() {
        return mark1 + mark2 + mark3;
    }
}

public class Main {
    public static void main(String[] args) {
        Marks m1 = new Marks();
        Marks m2 = new Marks(80, 75, 90);

        System.out.println("Sum of Marks 1: " + m1.calculateSum());
        System.out.println("Sum of Marks 2: " + m2.calculateSum());
    }
}
