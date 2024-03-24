public class Time {
    // Private data fields. They care encapsulated in the internal state of the object. They cannot be accessed by other classes.
    private int hours;
    private int minutes;
    private int seconds;
    // Default constructor for midnight.
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }
    // The constructor that takes hours, minutes and seconds as input.
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    // A function that takes a number of seconds as a parameter and increases the time by that many seconds.
    public void increment(int seconds) {
        this.seconds += seconds;
        if (this.seconds >= 60) {
            this.minutes += this.seconds / 60;
            this.seconds %= 60;
        }
        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
        if (this.hours >= 24) {
            this.hours %= 24;
        }
    }
     // A function that takes one parameter which is a boolean.
    public void print(boolean military) {
        if (military) {
            System.out.printf("%02d:%02d:%02d\n", this.hours, this.minutes, this.seconds);
        } else {
            String amPm = this.hours < 12 ? "AM" : "PM";
            int hour = this.hours % 12;
            if (hour == 0) {
                hour = 12;
            }
            System.out.printf("%02d:%02d:%02d %s\n", hour, this.minutes, this.seconds, amPm);
        }
    }
    // Static function that takes a String in the form "HH:MM:SS" and returns a Time object.
    public static Time fromString(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        return new Time(hours, minutes, seconds);

    }
}
