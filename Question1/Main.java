
public class Main {
    public static void main(String[] args) {

        // Creating two timer objects
        Timer t1 = new Timer(11, 45, 30);
        Timer t2 = new Timer(2, 30, 12);

        System.out.println("Timer 1: " + t1);
        System.out.println("Timer 2: " + t2);

        // Convert to seconds
        System.out.println("\nTotal seconds: " + t1.convertToSeconds());

        // Add two timers
        Timer t3 = t1.addTimer(t2);
        System.out.println("Added timers: " + t3);

        // Convert to AM/PM
        System.out.println("AM/PM: " + t1.toAMPM());

        // Compare timers
        System.out.println("Comparison: " + t1.compare(t2));

        // Increase time
        t1.increaseTime(2, 30, 12);
        System.out.println("After increasing: " + t1);

        // Decrement 100 seconds
        Timer t4 = new Timer(1, 5, 0);

        System.out.println("\nDecrementing 100 seconds:");

        for (int i = 0; i < 100; i++) {
            System.out.print(t4 + "\t");
            t4.decrementSecond();
        }

        System.out.println("\nFinal time: " + t4);
    }
}
