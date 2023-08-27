package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class StudentProgram {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student std1 =  new Student();
		
		
		System.out.println("Name: ");
		std1.setName(sc.nextLine());
		System.out.println("Nota #1: ");
		std1.setNota1(sc.nextDouble());
		System.out.println("Nota #2: ");
		std1.setNota2(sc.nextDouble());
		System.out.println("Nota #3: ");
		std1.setNota3(sc.nextDouble());
		
		System.out.println();
		
		if(std1.calculoNota() >= 60.0) {
			System.out.println("FINAL GRADE: " + std1.calculoNota());
			System.out.println("PASS");
			
		}else {
			System.out.println("FINAL GRADE: " + std1.calculoNota());
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", std1.missionPoint()) + " POINTS");
			
		}
		
		
		sc.close();
		

	}

}
