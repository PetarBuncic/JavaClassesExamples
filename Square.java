package polimorfizam;

public class Square extends Shape {
	
	public double a;
	
	public double  area() {
		return Math.pow(a,2);
	}
	public double obim() {
		return 2*a;
	}

}
