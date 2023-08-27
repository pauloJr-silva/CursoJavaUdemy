package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp1 = new Employee();
		
		System.out.println("Name: ");
		emp1.setName(sc.nextLine());
		System.out.println("Gross Salary: ");
		emp1.setGrossSalery(sc.nextDouble());
		System.out.println("Tax: ");
		emp1.setTax(sc.nextDouble());
		
		System.out.println("Employee: "  + emp1);
		System.out.println();
		
		System.out.println("Which percentage to increase salary: ");
		emp1.increasetSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + emp1);
		
		
		
		
		
		sc.close();
		

	}

}
