package Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second =second;
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
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public void nextSecond(){
        if(second < 60 ){
            this.second = second + 1;
            }
        else if (second == 60) {
            this.second = 01;
            this.minute = minute + 1;
        }
        else if (second == 59) {
            this.second =0;
            this.minute = minute + 1;
        }
    }

    public void previousSecond(){
        if (second < 60){
            this.second = second - 1;
        } else if (second == 60) {
            this.second = second - 1;
            this.minute = minute - 1;
        } else if (second == 1) {
            this.second = 0;
            this.minute = minute - 1;
        } else if (second == 0) {
            this.second = 59;
            this.minute = minute - 1;
        }
    }
}
