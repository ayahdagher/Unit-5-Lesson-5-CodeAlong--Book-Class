public class Book

{
  // Fields/ Instance Data
  private String title;
  private String author;
  private int year;
  private int numPages;
  private boolean hardcover;

  /*
   * you can set variables with variable assignment, like below.
   * 
   * //Constructor public Book(String t, String a, int y, int n, boolean h) {
   * title = t; author = a; year = y; numPages = n; hardcover = h;
   * 
   * }
   * 
   * you can set variables using mutators in the constructor, like in the code
   * below.
   */
  public Book(String t, String a, int y, int n, boolean h) {
    setTitle(t);
    setAuthor(a);
    setYear(y);
    setNumPages(n);
    setHardcover(h);

  }

  public Book() 
  {
    this("none", "unknown", 1900, 0, false);
  }

  // Accessor methods- these methods are public and have returns.

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getYear() {
    return year;
  }

  public int getNumPages() {
    return numPages;
  }

  public boolean getHardcover() {
    return hardcover;
  }
  // mutator methods- don't return anything, because you use it to set Data

  public void setTitle(String s) {
    title = s;
  }

  public void setAuthor(String a) {
    author = a;
  }

  public void setYear(int y) {
    year = y;
  }

  public void setNumPages(int n) {
    numPages = n;
  }

  public void setHardcover(boolean h) {
    hardcover = h;
  }

  public boolean equals(Book b) {
    if (this.getTitle().equals(b.getTitle())) {
      return true;
    }

    else {
      return false;
    }
  }

  // toString- what prints for our objects?

  public String toString() {
    String str = "";
    str = "Title: " + title + "\nAuthor: " + author + "\nYear Published: " + year + "\nNumber of Pages: " + numPages
        + "\nHardcover: " + hardcover;

    return str;

  }
}