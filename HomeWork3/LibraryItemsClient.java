
public class LibraryItemsClient{
  public static void main (String[] args) {
      Book b1= new Book(1,"BuildingJavaPrograms",2017,"Stuart");
      Magazine m1 = new Magazine(2, "wired","technology",20);
      Video v1 = new Video(3,"wildlife",50,2001);
      Book b2 =new Book(4,"BuildingJavaPrograms",2017,"Stuart");
      
      System.out.println(b1.toString());
      System.out.println(b2.toString());
      System.out.println("equal ?: " + b1.equals(b2));
      System.out.println(m1.toString());
      System.out.println(v1.toString());
    }
    
    
}
