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
		System.out.println("请输入第一个数：");
		double number1=sc.nextDouble();
		System.out.println("请输入第二个数：");
		double number2=sc.nextDouble();
		System.out.println("请输入操作符：");
		char op=sc.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println("number1与number2的和为："+caculator.add(number1,number2));
			break;
		case '-':
			System.out.println("number1与number2的差为："+caculator.subtraction(number1,number2));
			break;
		case '*':
			System.out.println("number1与number2的积为："+caculator.multiplication(number1,number2));
			break;
		case '/':
			System.out.println("number1与number2的商为："+caculator.division(number1,number2));
			break;
		}
	
		
		
	}
}
