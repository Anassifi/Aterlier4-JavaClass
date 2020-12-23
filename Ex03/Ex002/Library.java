package Ex03.Ex002;

import java.util.*;

public class Library{
	
	List<Work> works = new ArrayList<Work>();
	List<Subscriber> subs = new ArrayList<Subscriber>();
	
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(String title, String date, boolean existence) {
	}
	
	private boolean helper(Work workName) {
		for(int i = 0; i < works.size(); i++) {
			if(works.get(i).getTitle().equals(workName.getTitle())) {
				return true;
			}	
		}
		return false;
	}
	
	
	public void setWork(Work workName) {
		if (!this.helper(workName))
			works.add(workName);
		else System.out.println("already exists");
	}
	
	public Work getWork(String bookName) {
		for(int i = 0; i < works.size(); i++) {
			if(works.get(i).getTitle().equals(bookName)) {
				return works.get(i);
			}
		}
		return null;
	}
	
	public void setSub(Subscriber subName) {
		subs.add(subName);
	}
	
	public Subscriber getSub(int subID) {
		for(int i = 0; i < subs.size(); i++) {
//			System.out.println(subs.get(i).getName());
			if(subs.get(i).getIdentityNumber() == subID) {
				return subs.get(i);
			}
		}
		return null;
	}
	
	public void printBooks(List<Work> works) {
		for(Work b : works) {
			System.out.println(b.getTitle());
		}
	}


//	public void display() {
//		System.out.println("works :" + printBooks(works) + ", subs: " + subs);
//	}

}
