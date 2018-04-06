
public class LibraryItems {
  private int id;
  private String title;
    
    public LibraryItems(int id, String title) {
        this.id = id;
        this.title = title;
    }
    public int getID() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String toString() {
        return id + "," + title;
    }
    
}
 class Book extends LibraryItems {
    private int year;
    private String author;
    public Book(int id, String title, int year, String author) {
        super(id,title);
        this.year = year;
        this.author = author;
    }
    
    public int getYear() {
        return year;
    }
    public String getAuthor() {
        return author;
    }
    public boolean equals(Book b) {
        return ( this.getTitle() == b.getTitle() && this.getYear() == b.getYear() && this.getAuthor() == b.getAuthor());
        
    }

    public String toString() {
        return super.toString() + "," + year + "," + author;
    }
}
class Magazine extends LibraryItems {
  private String genre;
  private int numberOfPages;
  public Magazine(int id, String title,String genre, int numberOfPages) {
     super(id,title);
     this.genre = genre;
     this.numberOfPages = numberOfPages;
  
}
public String getGenre() {
        return genre;
    }
    public int getNumbweOfPages() {
        return numberOfPages;
    }
    public String toString() {
        return super.toString() + "," + genre + "," + numberOfPages;
    }
}
class Video extends LibraryItems {
    private int length;
    private int year;
    public Video( int id, String title, int length, int year) {
        super(id,title);
        this.length = length;
        this.year = year;
    }
    public int getLength() {
        return length;
    }
    public int getYear() {
        return year;
    }
    public String toString() {
        return super.toString() + "," + length + "," + year;
    }
}
