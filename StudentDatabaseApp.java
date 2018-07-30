package studentdatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
	
		
		//Ask how many new students we want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		student[] students= new student[numOfStudents];
	       
		//Create n number of new students
		for(int n=0; n<numOfStudents; n++) {
			students[n]=new student();
			
			students[n].enroll();
			students[n].payTuition();
			
				
		}
		for(int n=0; n<numOfStudents; n++) {
		System.out.println(students[n].showInfo() + "\n");
		}
}

}