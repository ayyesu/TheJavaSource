package src.sandbox.datatypes;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDateDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        System.out.println("-----Current Date-----");
        System.out.println("Today: " + sdf.format(currentDate));

        System.out.println("------deprecated since 1.1-----");
        Date johnBirthday = new Date(77, 9, 16);
        System.out.println("John’s Birthday: " + sdf.format(johnBirthday));
        int day = johnBirthday.getDate();
        System.out.println("Day: "+ day);
        int month = johnBirthday.getMonth() + 1;
        System.out.println("Month: " + month);
        int year = johnBirthday.getYear();
        System.out.println("Year: " + year);

        System.out.println("-----Non Deprecated way to work with the DateTime API");
        /*
        * Non Deprecated way of working with dates and calendat
        * */
        Calendar calendar = new GregorianCalendar();
        Date currentDate1 = calendar.getTime();
        System.out.println("Today: " + sdf.format(currentDate1));
        calendar.set(1977, 9, 16);
        Date princeBirthday = calendar.getTime();
        System.out.println("Prince’s Birthday: " + sdf.format(princeBirthday));
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Day: " + day1);
        int month1 = calendar.get(Calendar.MONTH);
        System.out.println("Month: " + month1);
        int year1 = calendar.get(Calendar.YEAR);
        System.out.println("Year: " + year1);

        System.out.println("-----Current DateTime API--------");
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);
        LocalDate today = currentTime.toLocalDate();
        System.out.println("Today: " + today);
        LocalDate johnBd = LocalDate.of(1977, Month.OCTOBER, 16);
        System.out.println("John’s Birthday: " + johnBd);
        int day2 = johnBd.getDayOfMonth();
        System.out.println("Day: " + day2 + ", " + johnBd.getDayOfWeek());
        int month2 = johnBd.getMonthValue();
        System.out.println("Month: " + month2 + ", " + johnBd.getMonth());
        int year2 = johnBd.getYear();
        System.out.println("Year: " + year2);
    }
}
