//P69
public class Cirle {
	private double r;
	private static double PI = Math.PI;
	
	//�����
	public double area() {
		return PI*r*r;
	}
	//���ܳ�
	public double prime() {
		return 2*PI*r;
	}
	
	public static void main(String[] args) {
		Cirle cirle = new Cirle();
		cirle.r = 8;
		System.out.println("�����"+cirle.area());
		System.out.println("�ܳ���"+cirle.prime());
	}
}
