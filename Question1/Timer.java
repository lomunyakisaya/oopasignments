
public class Timer {
    private int hour;
    private int minutes;
    private int seconds;
    private int dayOffset;

    // Constructor
    public Timer(int x, int y, int z) {
        if (x < 0 || x > 23) {
            throw new IllegalArgumentException("Invalid hour");
        }
        if (y < 0 || y > 59) {
            throw new IllegalArgumentException("Invalid minutes");
        }
        if (z < 0 || z > 59) {
            throw new IllegalArgumentException("Invalid seconds");
        }

        this.hour = x;
        this.minutes = y;
        this.seconds = z;
        this.dayOffset = 0;
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

    public int getDayOffset() {
        return this.dayOffset;
    }

    // Setters
    public void setHour(int x) {
        if (x < 0 || x > 23) {
            throw new IllegalArgumentException("Invalid hour");
        }
        this.hour = x;
    }

    public void setMinutes(int x) {
        if (x < 0 || x > 59) {
            throw new IllegalArgumentException("Invalid minutes");
        }
        this.minutes = x;
    }

    public void setSeconds(int x) {
        if (x < 0 || x > 59) {
            throw new IllegalArgumentException("Invalid seconds");
        }
        this.seconds = x;
    }

    // Display time
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",
                this.hour, this.minutes, this.seconds);
    }

    // Convert time into total seconds
    public int convertToSeconds() {
        return (this.hour * 3600) +
               (this.minutes * 60) +
               this.seconds;
    }

    // Add two timers
    public Timer add(Timer t) {

        int sec = this.seconds + t.seconds;
        int min = this.minutes + t.minutes;
        int hrs = this.hour + t.hour;

        min += sec / 60;
        sec = sec % 60;

        hrs += min / 60;
        min = min % 60;

        int days = hrs / 24;
        hrs = hrs % 24;

        Timer result = new Timer(hrs, min, sec);
        result.dayOffset = this.dayOffset + t.dayOffset + days;

        return result;
    }

    // Convert to AM/PM
    public String toAMPM() {
        int h = this.hour;
        String period = "AM";

        if (h >= 12) {
            period = "PM";
        }

        if (h == 0) {
            h = 12;
        }
        else if (h > 12) {
            h = h - 12;
        }

        return String.format("%02d:%02d:%02d %s",
                h, this.minutes, this.seconds, period);
    }

    // Compare two timers
    public int compare(Timer t) {
        return this.convertToSeconds() -
               t.convertToSeconds();
    }

    // Decrement seconds
    public void decrementSecond() {
        this.seconds--;

        if (this.seconds < 0) {
            this.seconds = 59;
            decrementMinute();
        }
    }

    // Decrement minutes
    public void decrementMinute() {
        this.minutes--;

        if (this.minutes < 0) {
            this.minutes = 59;
            decrementHour();
        }
    }

    // Decrement hours
    public void decrementHour() {
        this.hour--;

        if (this.hour < 0) {
            this.hour = 23;
            this.dayOffset--;

            System.out.println("Previous day: " + this);
        }
    }

    // Increase time by given hours, minutes and seconds
    public void incrementTime(int h, int m, int s) {

        int sec = this.seconds + s;
        int min = this.minutes + m;
        int hrs = this.hour + h;

        min += sec / 60;
        sec = sec % 60;

        hrs += min / 60;
        min = min % 60;

        this.dayOffset += hrs / 24;
        hrs = hrs % 24;

        this.hour = hrs;
        this.minutes = min;
        this.seconds = sec;
    }

    // Display day offset
    public void displayDayOffset() {
        System.out.println("Day offset: " + this.dayOffset);
    }
}
