package polimorfizam;

public class Rectangle extends Shape {
	
	public double a, b;
	
	public double area() {
		return a*b;
	}
	public double obim() {
		return 2*a+2*b;
	}
	

}
