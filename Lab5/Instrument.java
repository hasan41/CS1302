
public class Instrument
{
   String madeIn;
   double price;
   
    public Instrument(String made, double yourPrice) {
       madeIn = made;
       price = yourPrice;
}
    public String getMadeIn() {
        return madeIn;
    }
     public double getPrice() {
        return price;
    }
    public String toString(){
        
      return madeIn + "," + price;
    }
}
 class Wind extends Instrument {
 String type;
     public Wind(String made, double yourPrice, String type) {
         super(made, yourPrice);
         this.type = type;
        }
    public String getType() {
        return type;
    }
    public String toString(){
        
      return madeIn + "," + price + "," + type;
    }
}
class Stringed extends Instrument {
    int numberOfStrings;
     public Stringed(String made, double yourPrice, int numberOfStrings) {
         super(made, yourPrice);
         this.numberOfStrings = numberOfStrings;
        }
    public int getNumberOfStrings() {
        return numberOfStrings;
    }
    public String toString(){
        
      return madeIn + "," + price + "," + numberOfStrings;
    }
}
class Ukulele extends Stringed {
    String size;
     public Ukulele(String made, double yourPrice, int numberOfStrings, String size) {
         super(made, yourPrice, numberOfStrings);
         this.size = size;
        }
    public String getSize() {
        return size;
    }
    public String toString(){
        
      return madeIn + "," + price + "," + numberOfStrings + "," + size;
    }
}
