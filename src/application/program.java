package application;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		student student = new student();
		
		System.out.println("Student's name:  ");
		student.name = sc.next();
		System.out.println("First grade(0-30): ");
		student.grade1 = sc.nextDouble();
		System.out.println("Second grade(0-30): ");
		student.grade2 = sc.nextDouble();
		System.out.println("Third grade(0-40): ");
		student.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else if (student.finalGrade() > 100) {
			System.out.println("TYPOGRAPHICAL ERROR");
		} else {
			System.out.println("APROVED");
		}
		
		
		
		sc.close();
	}

}
