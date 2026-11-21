
public class Timer {
    private int hour;
    private int minutes;
    private int seconds;

    // Constructor
    public Timer(int x, int y, int z) {
        setHour(x);
        setMinutes(y);
        setSeconds(z);
    }

    // Setters
    public void setHour(int x) {
        if (x < 0 || x > 23) {
            throw new IllegalArgumentException("Invalid hour value");
        }
        this.hour = x;
    }

    public void setMinutes(int x) {
        if (x < 0 || x > 59) {
            throw new IllegalArgumentException("Invalid minutes value");
        }
        this.minutes = x;
    }

    public void setSeconds(int x) {
        if (x < 0 || x > 59) {
            throw new IllegalArgumentException("Invalid seconds value");
        }
        this.seconds = x;
    }

    // Getters
    public int getHour() {
        return this.hour;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    // Display all values
    public void getAll() {
        System.out.println("The current time is: " + this);
    }

    // Convert time to string HH:MM:SS
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",
                this.hour, this.minutes, this.seconds);
    }

    // Convert time to total seconds
    public int convertToSeconds() {
        return (this.hour * 3600) + (this.minutes * 60) + this.seconds;
    }

    // Add two timers
    public Timer addTimer(Timer t) {
        int total = this.convertToSeconds() + t.convertToSeconds();

        total = total % 86400;

        int h = total / 3600;
        int m = (total % 3600) / 60;
        int s = total % 60;

        return new Timer(h, m, s);
    }

    // Convert 24-hour format to 12-hour format
    public String toAMPM() {
        int h = this.hour;
        String period = (h >= 12) ? "PM" : "AM";

        h = h % 12;

        if (h == 0) {
            h = 12;
        }

        return String.format("%02d:%02d:%02d %s",
                h, this.minutes, this.seconds, period);
    }

    // Compare two timers
    public int compare(Timer t) {
        return this.convertToSeconds() - t.convertToSeconds();
    }

    // Decrement seconds
    public void decrementSecond() {
        if (this.seconds > 0) {
            this.seconds--;
        } else {
            this.seconds = 59;
            decrementMinute();
        }
    }

    // Decrement minutes
    public void decrementMinute() {
        if (this.minutes > 0) {
            this.minutes--;
        } else {
            this.minutes = 59;

            if (this.hour > 0) {
                this.hour--;
            } else {
                this.hour = 23;
                System.out.println("This time is on the previous day.");
            }
        }
    }

    // Decrement hours
    public void decrementHour() {
        if (this.hour > 0) {
            this.hour--;
        } else {
            this.hour = 23;
            System.out.println("This time is on the previous day.");
        }
    }

    // Increase time by given hours, minutes and seconds
    public void increaseTime(int h, int m, int s) {
        if (h < 0 || m < 0 || s < 0) {
            throw new IllegalArgumentException("Values cannot be negative");
        }

        int total = convertToSeconds() + (h * 3600) + (m * 60) + s;

        total = total % 86400;

        this.hour = total / 3600;
        this.minutes = (total % 3600) / 60;
        this.seconds = total % 60;
    }
}
