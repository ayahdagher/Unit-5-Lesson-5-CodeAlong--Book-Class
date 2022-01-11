public class Library
{
// instance data 
private String name ;
private String address ; 
private Book[] books ;
private static int numBooks = 0 ; 

// default constructor
public Library()
{
  this("unknown" , "unknown", 10) ; 
}

//constructor with parameters
public Library(String n, String a, int x)
{
  this.name = n; 
  this.address = a; 
  this.books = new Book[x] ; 
}

public void addBooks(Book b)
{
books[numBooks] = b ;
numBooks ++ ; 

/*
if(numBooks > books.length - 1)
{
put stuff here
}

}

public void doubleSize(Books[] b)
{

}
 
*/

public String toString()
{
  String it = "" ;

  for(Book i : books)
{
  it += i + "\n" ; 
}
  return it ; 
}
}
