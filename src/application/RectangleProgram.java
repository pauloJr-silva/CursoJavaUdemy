package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class RectangleProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec;
		
		rec = new Rectangle();
		
		System.out.println("Enter rectangle width: ");
		rec.setWidth(sc.nextDouble());
		System.out.println("Enter rectangle height: ");
		rec.setHeight(sc.nextDouble());
		
		System.out.println("AREA: " + String.format("%.2f",rec.areaRectangle()));
		System.out.println("PERIMETER: " + String.format("%.2f", rec.perimeter()));
		System.out.println("DIAGONAL: " + String.format("%.2f", rec.diagonal()));
		
		
		
		
		sc.close();

	}

}
