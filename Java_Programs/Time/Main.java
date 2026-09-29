// Job: Store, validate, and display time in hours, minutes, and seconds.

class Time {
    int hr;
    int min;
    int seconds;

    Time() {
        hr = 0;
        min = 0;
        seconds = 0;
    }

    Time(int hr, int min, int seconds) {
        if (hr >= 0 && hr <= 23 &&
            min >= 0 && min <= 59 &&
            seconds >= 0 && seconds <= 59) {
            this.hr = hr;
            this.min = min;
            this.seconds = seconds;
        } else {
            System.out.println("Invalid time!");
            this.hr = 0;
            this.min = 0;
            this.seconds = 0;
        }
    }

    void display() {
        System.out.println("Time: " + hr + ":" + min + ":" + seconds);
    }
}

public class Main {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time(10, 30, 45);
        Time t3 = new Time(25, 70, 80);

        System.out.println("Time 1:");
        t1.display();

        System.out.println("Time 2:");
        t2.display();

        System.out.println("Time 3:");
        t3.display();
    }
}
