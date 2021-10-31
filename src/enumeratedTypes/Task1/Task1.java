package enumeratedTypes.Task1;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Saturday is holiday: " + Weekday.SATURDAY.isHoliday());
        System.out.println("Saturday is weekday: " + Weekday.SATURDAY.isWeekDay());
        Weekday.TUESDAY.wichIsGreater(Weekday.MANDAY);

    }
}
enum Weekday{
    MANDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    boolean isWeekDay(){
        return this != SATURDAY && this != SUNDAY;
    }
    boolean isHoliday(){
        return this == SATURDAY && this == SUNDAY;
    }
    void wichIsGreater (Weekday weekday){
        if (this.ordinal()>weekday.ordinal()){
            System.out.println("Before " + weekday);
        }else {
            System.out.println("After " + weekday);
        }
    }
}




