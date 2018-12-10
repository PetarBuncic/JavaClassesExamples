package polimorfizam;

public class TestClass {
	
	public static void main(String [] args) {
		
		Circle circle=new Circle();
		circle.color="Red";
		circle.x=100;
		circle.y=200;
		circle.r=12;
		StringBuilder sb=new StringBuilder();
		sb.append("Povrsina je:");
		System.out.println(sb.append(circle.area()));
	} 
}
