public class Timer {
    private int hour;
    private  int minutes;
    private int seconds;
    Timer(int x, int y, int z){
        this.hour = x;
        this.minutes= y;
        this.seconds = z;

        if(this.hour < 0 || this.hour > 23){
            throw new IllegalArgumentException("Value error: Hour given is invalid value");
        }
        if (this.minutes < 0 || this.minutes > 59){
            throw new IllegalArgumentException("Value error: Minutes given is invalid value");
        }
        if (this.seconds < 0 || this.seconds > 59){
            throw new IllegalArgumentException("Value error: Seconds given is invalid value");
        }
    }
    //add 2 timers
    public Timer add(Timer t){
        int seconds = this.hour + t.seconds;
        int minutes = this.minutes + t.minutes;
        int hours = this.hour + t.hour;
        return new Timer(hours, minutes, seconds);


    }
    void getAll(){
        System.out.println("The current time is: " + this.hour + ":" + this.minutes + ":" + this.seconds);
    }
    /*
    void setAll(int x, int y, int z){
        this.hour = x;
        this.minutes= y;
        this.seconds = z;

        if(this.hour < 0 || this.hour > 23){
            System.out.println("Hour indicated is out of range. \n Using 0 as default");
            this.hour = 0;
        }
        if (this.minutes < 0 || this.minutes > 59){
            System.out.println("Minutes indicated is out of range. \n Using 0  as default");
            this.minutes =0;
        }
        if (this.seconds < 0 || this.seconds > 59){
            System.out.println("Minutes indicated is out of range. \n Using 0 as default");
            this.seconds =0;
        }
    }
    */
    @Override 
    public String toString(){
        return "The current time is: " + this.hour + ":" + this.minutes + ":" + this.seconds;

    }
    void convertToSeconds(){
        int step1 = this.hour * 60 * 60;
        int step2 = this.minutes * 60;
        int tatolSeconds = this.seconds + step1 + step2;
        System.out.println("Seconds are:"+ tatolSeconds);
    }
    void addTimers(){

    }
} 