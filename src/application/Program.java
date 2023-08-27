package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle ta = new Triangle();
		Triangle tb = new Triangle();
				
		System.out.println("Enter the measures of triangle X: ");
		ta.setA(sc.nextDouble());
		ta.setB(sc.nextDouble());
		ta.setC(sc.nextDouble());
		System.out.println("Enter the measures of tringle Y: ");
		tb.setA(sc.nextDouble());
		tb.setB(sc.nextDouble());
		tb.setC(sc.nextDouble());
		
		System.out.printf("Triangle X area: %.4f%n",ta.calculoArea());
		System.out.printf("Triangle Y area: %.4f%n", tb.calculoArea());
		
		if(ta.calculoArea() > tb.calculoArea()) {
			
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		
		
		sc.close();

	}

}
