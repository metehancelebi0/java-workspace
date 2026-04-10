package datetime;

public class MyTime {
    int hour,minute;

    public MyTime(int hour,int minute){
        this.hour = hour;
        this.minute = minute;

    }

    @Override
    public String toString(){
        return (hour < 10 ? "0" : "") + hour + " " + (minute < 10 ? "0": "")+ minute;

    }
    public void incrementHour(){
        incrementHour(1);
    }
    public int incrementHour(int diff){
        int dayDiff = 0;
        if(hour + diff <0){
            dayDiff = -1;
        }
        dayDiff += (hour + diff) % 24;
        if(hour < 0){
            hour += 24;
        }
        return dayDiff;
    }
    public int incrementMinute(int diff){
        int hourDiff = 0;
        if(minute + diff < 0){
            hourDiff = -1;

        }
        hourDiff += (minute + diff) / 60;
        minute = (minute + diff) % 60;
        if(minute < 0){
            minute += 60;

        }
        return incrementHour(hourDiff);

    }
    public boolean isBefore(MyTime myTime){
        return hour + 60 + minute < myTime.hour + 60 + myTime.minute;
    }
}