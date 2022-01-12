import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;

class Main

{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);

    System.out.println(b);
    System.out.println(" ");
    System.out.println(" ");

    Book bb = new Book("Alice's Adventures in Wonderland", "Lewis Carroll", 1865, 200, false);

    System.out.println(bb);
    System.out.println(" ");
    System.out.println(" ");

    System.out.println("Number of Pages in " + bb.getTitle() + ": " + bb.getNumPages());

    System.out.println("Is I am Malala a hardcover book? " + b.getHardcover());

    System.out.println("Enter a new number of pages for " + b.getTitle() + ".");

    int newPages = scan.nextInt();

    System.out.println("The new number of pages in " + b.getTitle() + " is " + newPages);

    // System.out.println("Change the author of " + bb.getTitle() + ".");

    // String newAuthor = scan.nextLine();
    // bb.setAuthor(newAuthor);

    // System.out.println("The new author of " + bb.getTitle() + " is " +
    // bb.getAuthor());

    System.out.println("Are the books equal? " + b.equals(b));
    System.out.println("Are the books equal? " + b.equals(bb));

// making some default books

Book def1 = new Book(); 
Book def2 = new Book(); 


System.out.println(" ");

System.out.println("This is book one: " + def1); 

System.out.println(" ");

System.out.println("This is book two: " + def2); 

    System.out.println("Are the default books equal? " + def1.equals(def2));

////////////////////////////////////////////////////////////////////////////

// the library class

System.out.println(" ");
System.out.println(" ");

Library lib = new Library(); 
System.out.println(lib);

//adding books to library object. the previous objects we made can interact with this class

System.out.println(" ");
System.out.println(" ");

lib.addBooks(b);
lib.addBooks(bb);
lib.addBooks(def1);
lib.addBooks(def2);
lib.addBooks(b);
lib.addBooks(bb);
lib.addBooks(def1);
lib.addBooks(def2);lib.addBooks(b);
lib.addBooks(bb);

System.out.println(lib);

System.out.println("Increasing size of array!");
lib.doubleSize(); 
System.out.println(lib);


  }
}
