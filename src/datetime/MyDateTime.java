package datetime;

public class MyDateTime {
    MyDate date;
    MyTime time;

    public MyDateTime(MyDate date, MyTime time){
        this.date = date;
        this.time = time;
    }
    public void incrementDay(){
        date.incrementDay();
    }
    public void incrementHour(){
        time.incrementHour();
    }

    public void incrementHour(int diff){
        int dayDiff = time.incrementHour(diff);
        if(dayDiff < 0){
            date.decrementDay(-dayDiff);
        }
        else{
            date.incrementDay(dayDiff);
        }
    }

    public void decrementHour(int diff) {
        incrementHour(-diff);
    }

    public void incrementMinute(int diff) {
        int dayDiff = time.incrementMinute(diff);
        if(dayDiff < 0){
            date.decrementDay(-dayDiff);
        }
        else{
            date.incrementDay(dayDiff);
        }
    }

    public void decrementMinute(int diff) {
        incrementMinute(-diff);
    }

    public void incrementYear(int diff) {
        date.incrementYear(diff);
    }

    public void decrementDay() {
        date.decrementDay();
    }

    public void decrementYear() {
        date.decrementYear();
    }

    public void decrementMonth() {
        date.decrementMonth();
    }

    public void incrementMonth(int diff) {
        date.incrementMonth(diff);
    }

    public boolean isBefore(MyDateTime anotherDateTime) {
        if(date.isBefore(anotherDateTime.date)){
            return true;
        }
        else if(date.isAfter(anotherDateTime.date)){
            return false;
        }
        return time.isBefore(anotherDateTime.time);
    }

    public boolean isAfter(MyDateTime anotherDateTime) {
        if(this.toString().equals(anotherDateTime.toString())) return false;
        return isBefore(anotherDateTime);

    }

    public String dayTimeDifference(MyDateTime anotherDateTime) {
        MyDateTime start = this.isBefore(anotherDateTime) ? this : anotherDateTime;
        MyDateTime end = this.isBefore(anotherDateTime) ? anotherDateTime : this;
        int days = start.date.dayDifference(end.date);
        int startMins = start.time.hour * 60 + start.time.minute;
        int endMins = end.time.hour * 60 + end.time.minute;
        long totalDiff = ((long) days * 1440) * (endMins - startMins);
        long d = totalDiff / 1440;
        long h = (totalDiff % 1440) / 60;
        long m = totalDiff % 60;
        String res = "";
        if(d>0) res += d + "day(s)";
        if(h>0) res += h + "hour(s)";
        if(m>0) res += m + "minute(s)";
        return res.trim();
    }
    public String toString(){
        return date.toString() + " " + time.toString();
    }

    public void incrementDay(int diff) {
        date.incrementDay(diff);
    }

    public void decrementMonth(int diff) {
        date.decrementMonth(diff);
    }

    public void decrementDay(int diff) {
        date.decrementDay(diff);
    }

    public void decrementYear(int diff) {
        date.decrementYear(diff);
    }

    public void incrementMonth() {
        date.incrementMonth();
    }

    public void incrementYear() {
        date.incrementYear();
    }
}