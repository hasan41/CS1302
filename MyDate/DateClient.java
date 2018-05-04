import java.util.*;
public class DateClient
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        ArrayList<MyDate> birthdates = new ArrayList<MyDate>();
        birthdates.add(new MyDate(1743,4,13));   // Jefferson
        birthdates.add(new MyDate(1732,2,22)); // Washington
        birthdates.add(new MyDate(1751,3,16));   //Madison
        birthdates.add(new MyDate(1735, 10, 30));   // Adams
        birthdates.add(new MyDate(1758, 4, 28));   // Monroe

        System.out.println("birthdays = " + birthdates);
        Collections.sort(birthdates);
        System.out.println("birthdays = " + birthdates);
    }
}

