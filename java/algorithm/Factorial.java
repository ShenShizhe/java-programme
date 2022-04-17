import java.util.Scanner;

public class Factorial {
	
	public static long factorial(int n) {
		long num = 1,all = 0;
		for (int i = 1; i <= n; i++) {
			num=i*num;
			all+=num;
		}
		return all;
	}
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("请输入一个整数（n）");
			int n  =in.nextInt();
			System.out.println(factorial(n));
		}
}
