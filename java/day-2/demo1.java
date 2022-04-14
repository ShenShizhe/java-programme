import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
    
		Scanner in=new Scanner(System.in);
    
		System.out.println("请输入一个整数:");
		int a =in.nextInt();
		if(a%2==0) 
			System.out.println("这个数是偶数");
		else 
			System.out.println("这是一个奇数");
	}
}
