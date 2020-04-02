package StudentsDatabase;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

	private String name;
	private String emailID;
	private static int iD = 100;
	private String userID;
	private int phone;
	private String city;
	private String state;
	private String SSN;
	private ArrayList<String> courses = new ArrayList<String>( Arrays.asList("Geography", "History", "Philology", "Math", "German"));
	private ArrayList<Integer> prices = new ArrayList<Integer>( Arrays.asList( 200, 150, 300, 175, 220 ));
	private String enrolledCourses = "";
	private double balance;
	
	
	public Student(String name, String SSN){
		this.SSN = SSN;
		this.name = name;
		iD++;
		setEmailID();
		setUserID();
		System.out.println("Your ID is: " + iD);
		
	}
	
	
	private void setEmailID(){
		emailID = name + "@student.com";
		System.out.println("Your email is: " + emailID);
	}
	
	// userID = static ID, 4 random between 1000 and 9000, last 4 of SSN
	
	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int random = (int)(Math.random() * (max-min));
		random = random + min;
		userID = iD + "" + random + SSN.substring(SSN.length()-4, SSN.length());
		System.out.println("This is your userID: " + userID);
	}
	
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	public void enroll(String courseName) {
		if ( courses.contains(courseName)) {
			int n = courses.indexOf(courseName);
			this.enrolledCourses = this.enrolledCourses + " " + courseName;
			System.out.println("You have been enrolled for: " + courseName);
			System.out.println("Please, pay the course fee of $ " + prices.get(n));
			balance = balance - prices.get(n);
			
		} else {
			System.out.println("Course not found. Please choose one of the available courses: " + courses);
		}
		
	}

	public void pay(double amount) {
		System.out.println("You have paid: " + amount);
		balance = balance + amount;
	}
	
	public void checkBalance() {
		System.out.println("Your actual balance is: " + balance);
	}
	
	public void showCourses() {
		System.out.println("Here all of our courses available: " + courses);
	   System.out.println("Here are the courses you enrolled for:" + enrolledCourses);
	}
	
	public String toString() {
		return "[NAME: " + name + "]\n[COURSES: " + enrolledCourses + "]\nBALANCE: " + balance + "]";  
	}

}
