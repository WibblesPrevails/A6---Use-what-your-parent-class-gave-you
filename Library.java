/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building{

  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }
  
    public void addTitle(String title) {
      collection.put(title,false);
    }

    public String removeTitle(String title) {
      collection.remove(title);
      return title;
    }

    public void checkOut(String title) {
      if (collection.replace(title,false,true)) {
        System.out.println(title + " was checked out.");
      }
      else {
        System.out.println(title + " is either checked out or is not part of this library.");
      }
    }

    public void returnBook(String title) {
      if (collection.replace(title,true,false)) {
        System.out.println(title + " was returned.");
      }
      else {
        System.out.println(title + " is either not checked out or is not part of this library.");
      }
    }

    public boolean containsTitle(String title) {
      return collection.containsKey(title);
    }

    public boolean isAvailable(String title) {
      return collection.get(title) == true;
    }

    public void printCollection() {
      System.out.println(collection.toString());
    }

    public static void main(String[] args) {
      new Library("Edyth Dyer", "269 Main RD North", 3);
    }
  
  }