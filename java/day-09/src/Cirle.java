//P69
public class Cirle {
	private double r;
	private static double PI = Math.PI;
	
	//求面积
	public double area() {
		return PI*r*r;
	}
	//求周长
	public double prime() {
		return 2*PI*r;
	}
	
	public static void main(String[] args) {
		Cirle cirle = new Cirle();
		cirle.r = 8;
		System.out.println("面积："+cirle.area());
		System.out.println("周长："+cirle.prime());
	}
}
