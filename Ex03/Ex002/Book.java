package Ex03.Ex002;

public class Book extends Work{
	
	String author;
	
	public Book() {
		super();
	}
	
	public Book(String title, String date, boolean existence, String author) {
		super(title, date, existence);
		// TODO Auto-generated constructor stub
		
		this.author = author;
	}

	
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void display() {
		System.out.println("title :" + title + ", date: " + date + ", existence: " + existence + ", author: " + author);
	}
}
