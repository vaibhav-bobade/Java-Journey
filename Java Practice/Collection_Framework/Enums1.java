package Collection_Framework;

enum Weekday {
    SUNDAY, MONDAY,  TUESDAY, WEDNESDAY, THURSDAY,  FRIDAY, SATURDAY
}
class Enums1 {
    public static void main(String[] args) {
        //printing single constant
        Weekday day1 = Weekday.SUNDAY;
        System.out.println(day1);  //SUNDAY

        //getting particular index
        int day2 = Weekday.MONDAY.ordinal();
        System.out.println("Monday is at index: " + day2);

        //printing all enum constants through loop with their indexes
        Weekday[] weekdays = Weekday.values();
        for (Weekday day : weekdays) {
            System.out.println(day.ordinal() + " -> " + day);
        }
        /*==== Output ====
        0 -> SUNDAY
        1 -> MONDAY
        2 -> TUESDAY
        3 -> WEDNESDAY
        4 -> THURSDAY
        5 -> FRIDAY
        6 -> SATURDAY
        */
    }
}