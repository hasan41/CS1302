
/**
 * Write a description of class InstrumentClient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InstrumentClient
{
  public static void main(String[] args) {
      Instrument[] arr = new Instrument[3];
      arr[0] = new Wind("Germany",199.99,"Brass" );
      arr[1] = new Stringed("Mexico", 99.99, 6 );
      arr[2] = new Ukulele("Hawaii",300.0, 4, "Concert");
      
      for( int i=0; i<3; i++ ) {
    System.out.println(arr[i]);
}
    }
}
