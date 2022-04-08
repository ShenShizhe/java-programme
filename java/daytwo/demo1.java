import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		//输入一个整数判断是奇数还是整数
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int a =in.nextInt();
		//双分支结构
		if(a%2==0) {
			System.out.println("这个数是偶数");
		}
		else {
			System.out.println("这是一个奇数");
		}
	}
}
