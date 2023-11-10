/**
 * 
 */
package Aggregation;

/**
 *Create another class Book with data members: bookName,price and Author.
 * Print the Book details. 
 * @author VINITHA EDWIN
 */
public class Book {
	
	String bookName;
	double price;
	Author author;

	/**
	 * @param bookName
	 * @param price
	 * @param author
	 */
	public Book(String bookName, double price, Author author) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}
	void display(){  
		System.out.println(bookName+" "+price+" "+author.authorName+" "+author.age+" "+author.place);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author1=new Author("Karan Thapar",66,"India");  
		Author author2=new Author("Robin Sharma",50,"India");  
		
		Book book1 = new Book("Devil's Advocate",499,author1);
		Book book2 = new Book("LEarderShip Wisdom",250,author2);
		
		book1.display();
		book2.display();
	}

}
