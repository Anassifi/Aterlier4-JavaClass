package Ex03.Ex002;

public class Video extends Work{
	
	String publisher;
	double duration;
	
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Video(String title, String date, boolean existence, String publisher, double duration) {
		super(title, date, existence);
		// TODO Auto-generated constructor stub
		
		this.publisher = publisher;
		this.duration = duration;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public void display() {
		System.out.println("title :" + title + ", date: " + date + ", existence: " + existence + ", publisher: " + publisher + ", duration: " + duration);
	}

}
