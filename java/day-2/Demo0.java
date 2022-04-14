import java.util.Scanner;

public class Demo0 {
	public static void main(String[] args) {		
		Scanner in=new Scanner(System.in);
    
		//输入一个整数
		int integer  =in.nextInt();
		System.out.println("输入的整数为"+integer);
    
		//输入一个小数
		double decimal_fraction=in.nextDouble();
		System.out.println("输入的小数是"+decimal_fraction);
    
		//输入一个字符
		char chars=in.next().charAt(0);
		System.out.println("输入的字符是"+chars);
    
		//输入一个字符串
		String strings=in.next();
		System.out.println("输出的名字是"+strings);
	}
}
