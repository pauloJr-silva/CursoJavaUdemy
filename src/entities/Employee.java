package entities;

public class Employee {
	
	private String name;
	private int id;
	
	private double grossSalery;
	private double tax;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double grossSalery) {
		this.id = id;
		this.name = name;
		this.grossSalery = grossSalery;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGrossSalery() {
		return grossSalery;
	}
	public void setGrossSalery(double grossSalery) {
		this.grossSalery = grossSalery;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		double net;
		
		net = grossSalery - tax;
		
		return net;
		
	}
	
	public void increasetSalary(double percentage) {
		
		grossSalery += grossSalery * (percentage /100.0); 
	}

	
	public String toString() {
		
		return  id + ", " + name + String.format(", $%.2f", netSalary());
	}
}
