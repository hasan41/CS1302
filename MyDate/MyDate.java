
/**
 * Write a description of class MyDate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
  public class MyDate implements Comparable <MyDate> {
    // instance variables - replace the example below with your own
    private int month;
    private int day;
    private int year;

    public MyDate(int year, int month, int day)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth()
    {
        // put your code here
        return month;
    }
    public int getDay()
    {
        // put your code here
        return day;
    }
    public int getYear()
    {
        // put your code here
        return year;
    }
    public int compareTo(MyDate other) {
        if (this.year != other.year) {
            return this.year - other.year;
        } else {
            return this.month - other.month;
        }
    }
    public String toString() {
        return this.year + "/" + this.month + "/" + this.day;
}
 }
