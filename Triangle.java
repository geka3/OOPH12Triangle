
public class Triangle {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		super();
	}
	
	public double getArea(){
		double p = (a + b + c)/2;
		return Math.sqrt(p * (p-a)*(p-b)*(p-c));
	}
	

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", getArea()=" + getArea() + "]";
	}
	
	
}
