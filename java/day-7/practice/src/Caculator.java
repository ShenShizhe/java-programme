import java.util.Scanner;

public class Caculator {

	public double add(double number1,double number2) {
		return number1+number2;
	}
	
	public double subtraction(double number1,double number2) {
		return number1-number2;
	}
	
	public double multiplication(double number1,double number2) {
		return number1*number2;
	}
	
	public double division(double number1,double number2) {
		return number1/number2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Caculator caculator=new Caculator();
		System.out.println("�������һ������");
		double number1=sc.nextDouble();
		System.out.println("������ڶ�������");
		double number2=sc.nextDouble();
		System.out.println("�������������");
		char op=sc.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println("number1��number2�ĺ�Ϊ��"+caculator.add(number1,number2));
			break;
		case '-':
			System.out.println("number1��number2�Ĳ�Ϊ��"+caculator.subtraction(number1,number2));
			break;
		case '*':
			System.out.println("number1��number2�Ļ�Ϊ��"+caculator.multiplication(number1,number2));
			break;
		case '/':
			System.out.println("number1��number2����Ϊ��"+caculator.division(number1,number2));
			break;
		}
	
		
		
	}
}
