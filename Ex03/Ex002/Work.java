package Ex03.Ex002;

public class Work {
	String title;
	String date;
	boolean existence; //True if the work is available, false if it's borrowed;
	
	public Work() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Work(String title, String date, boolean existence) {
		this.title = title;
		this.date = date;
		this.existence = existence;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isExistence() {
		return existence;
	}

	public void setExistence(boolean existence) {
		this.existence = existence;
	}

	public void display() {
		System.out.println("title :" + title + ", date: " + date + ", existence: " + existence);
	}
}
