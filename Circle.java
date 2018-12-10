package polimorfizam;
import java.lang.Math;

public class Circle extends Shape {
	
	public double r;
	public final double PI=3.14;// moze se koristiti i PI iz Math.PI klase
	
	public double area() {
		return Math.pow(r, 2) * PI;//r*r *PI
	}
	public double obim() {
		return 2*r*PI;
	}
	
}
