/*import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
class Main{
    public static void main(String[] args){
        Day day = new Day();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter date (dd-mm-yyyy): ");
        String input = console.nextLine();
        System.out.println("Desired days to add: ");
        int dayNumber = console.nextInt();
        day.setDay(input, dayNumber);
        System.out.println(day.getDay());
        System.out.println(day.nextDay(input));
        //System.out.println(day.previousDay(input));
        console.close();
    }
}
class Day{
    int dayNumber = 0;
    String Weekday = null;
    String Nextday = null;
    String PreviousDay = null;

    void setDay(String input, int dayNumber){
        if(dayNumber > 0){
            String strDay = input.substring(0, 2);
            int dayConversion = Integer.valueOf(strDay);
            int intDay = dayConversion + dayNumber;
            String newDayconversion = String.valueOf(intDay);
            String newInput = input.replace(strDay,newDayconversion);
            DateTimeFormatter  datetime = DateTimeFormatter.ofPattern("d-M-u");
            LocalDate date = LocalDate.parse(newInput, datetime);
            String Weekday = date.format(DateTimeFormatter.ofPattern("EEEE"));
            this.Weekday = Weekday;
            System.out.println("The day in " + dayNumber + " days is: ");
        }
        else{
            DateTimeFormatter  datetime = DateTimeFormatter.ofPattern("d-M-u");
            LocalDate date = LocalDate.parse(input, datetime);
            String Weekday = date.format(DateTimeFormatter.ofPattern("EEEE"));
            this.Weekday = Weekday;
            System.out.println("The day is: ");
        }
        
    }
    String getDay(){
        return Weekday;
    }
    String nextDay(String input){
        String strDay = input.substring(0, 2);
        int dayConversion = Integer.valueOf(strDay);
        int intDay = dayConversion + 1;
        String newDayconversion = String.valueOf(intDay);
        String newInput = input.replace(strDay,newDayconversion);
        DateTimeFormatter  datetime = DateTimeFormatter.ofPattern("d-M-u");
        LocalDate date = LocalDate.parse(newInput, datetime);
        String Nextday = date.format(DateTimeFormatter.ofPattern("EEEE"));
        this.Nextday = Nextday;
        System.out.println("The next day is: ");
        return Nextday;
    }*/
    /*String previousDay(String input){
        String strDay = input.substring(0, 2);
        int dayConversion = Integer.valueOf(strDay);
        int intDay = dayConversion - 1;
        String newDayconversion = String.valueOf(intDay);
        String newInput = input.replace(strDay,newDayconversion);
        DateTimeFormatter  datetime = DateTimeFormatter.ofPattern("d-M-u");
        LocalDate date = LocalDate.parse(newInput, datetime);
        String PreviousDay = date.format(DateTimeFormatter.ofPattern("EEEE"));
        this.PreviousDay = PreviousDay;
        System.out.println("The previous day was: ");
        return PreviousDay;
    }*/
}