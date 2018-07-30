package studentdatabase;

import java.util.Scanner;

public class student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String  studentID;
	private String courses="";
	private int tuitionBalance=0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	//Constructor: prompt user to enter student's name and year
	public student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = sc.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = sc.nextLine();
				
		System.out.println("1. Fresher\n2. Sophmore\n3. Junior\n4. Senior\nEnter student class level: ");
		this.gradeYear = sc.nextInt();
		
		setStudentID();
		
		
		
		
	}
	
	//Generate an ID
	
	private void setStudentID() {
		//Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll in courses
	
	public void enroll() {
		//Get inside a loop, user hits 0
		do {
		System.out.print("Enter course to enroll (Q to quit) :");
		Scanner sc = new Scanner(System.in);
		String course=sc.next();
		
		
		if(!course.equals("Q")) {
			courses = courses + "\n " + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else {
			break;
			}
		
		} while(1 != 0);
		
		
	}
	
	
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is: Rs." + tuitionBalance + "\n");
		
	}
	
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: Rs.");
		Scanner sc = new Scanner(System.in);
		int payment=sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of Rs." + payment);
		viewBalance();
	}
	
	//Show status
	public String showInfo() {
		return "Name: " + firstName + " " +lastName + "\nGrade Level: " +gradeYear+
				"\nStudent ID: " + studentID + "\nCourses Enrolled:"+
	courses + "\nBalance: Rs." + tuitionBalance;
				}
	

}
