import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class date {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String da=s.nextLine();
        try{
        SimpleDateFormat sa=new SimpleDateFormat("dd-MM-yyyy");
        LocalDate d=sa.parse(da);
        System.out.println(d);
        }catch(Exception e){
            System.out.println("error");
        }
        //LocalDate today = LocalDate.now();
        // LocalDate today=LocalDate.of(2019, 5, 3);
        // System.out.println("Today's Date: " + today);
        // LocalDate date=LocalDate.of(1997,12,20);
        // int year=date.getYear();
        // int month=date.getMonthValue();
        // int day=date.getDayOfMonth();
        // System.out.println("year "+year);
        // System.out.println(month+" is the month");
        // System.out.println("day "+day);
        // System.out.println(date.getMonth());
        // System.out.println(date.plusDays(4));
        // System.out.println(date.minusWeeks(1));
        // System.out.println(date.isLeapYear());
        // System.out.println(date.getDayOfYear());
        // System.out.println(date.getDayOfWeek());
        // System.out.println(date.minusMonths(2));
        // System.out.println(date.plusMonths(4));
        // System.out.println(date.withYear(2003));
        // System.out.println(date.withMonth(8));
        // System.out.println(date.withDayOfYear(4));
        // System.out.println(date.getDayOfYear());
        // System.out.println(date.getMonth());
        // System.out.println(date.getDayOfWeek());
    }
}
