package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
	public double totalValueInStock() {
		
		return price * quantity;
	}
	
	
	public void  addProducts(int quantity) {
		this.quantity += quantity;	
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return  name + " $ " 
				+ String.format("%.2f", price) 
				+  ", " + quantity 
				+ " units, Total: $ " 
				+String.format("%.2f", totalValueInStock());

		
		
	}

}
