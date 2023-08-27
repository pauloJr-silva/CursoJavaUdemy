package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ListEmployeeProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		List<Employee> listEmpl = new ArrayList<>();
	
		
		System.out.println("How many employee will be registered?");
		int qtdEmpl = sc.nextInt();
		
		sc.nextLine();
		for (int i =0 ;i<qtdEmpl;i++) {
			System.out.println("Employee #" + (i +1));
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			
			while (hasID(listEmpl, id)) {
				System.out.println("Id already taken! Try again");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.println("Name: ");
			String name  = sc.nextLine();
			System.out.println("Salary: ");
			Double grossSalery = sc.nextDouble();
			Employee empl = new Employee(id,name,grossSalery);
			listEmpl.add(empl);
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee result = listEmpl.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
			if(result == null) {
				System.out.println("This id does not exist!");
				
			}else {
				System.out.println(" Enter the porcentage: ");
				double porc =  sc.nextDouble();
				result.increasetSalary(porc);
			}
		
		
		System.out.println("");
		System.out.println("List of Employees: ");
		for(Employee list: listEmpl) {
			System.out.println(list);
		}
		
		
		
		sc.close();

	}
	
	public static boolean hasID(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x-> x.getId()==id).findFirst().orElse(null);
		return emp != null;
	}

}
