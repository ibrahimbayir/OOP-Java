package Tİme_2;

public class Time {
    int hour;
    int minute;
    int second;
    public Time(int hour, int minute, int second) {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public String toString() {
        return "Time:"+hour+":"+minute+":"+second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour=hour;
    }
    public void setMinute(int minute) {
        this.minute=minute;
    }
    public void setSecond(int second) {
        this.second=second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public String nextSecond() {
        if (second==59) {
            second=00;
            minute=minute + 1;
            return "Time:"+hour+":"+minute+":"+(second);
        }
        return "Time:"+hour+":"+minute+":"+(second+1);
    }
    public String previousSecond() {
        if (second==0) {
            second=59;
            minute=minute-1;
            return "Time:"+hour+":"+minute+":"+(second);
        }
        return "Time:"+hour+":"+minute+":"+(second-1);
    }
}

