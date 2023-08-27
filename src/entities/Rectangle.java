package entities;

public class Rectangle {
	
	private double width;
	private double height;
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double areaRectangle() {
		
		return width *height ;
	}
	
	public double perimeter() {
		
		double p = 2*(width + height);
		
		return p;
	}
	
	public double diagonal() {
	
		double d = Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
		
		
		return d;	
	}
	
	
	
	
}
