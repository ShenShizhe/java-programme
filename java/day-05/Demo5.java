import java.util.Scanner;

public class Demo5 {
//从屏幕输入数字x，创造一个边长为x的等边三角形
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个数：");		
		int n=in.nextInt();		
		for(int i=1;i <=n;i++) {	
			//输出一个空格
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");				
			}
			//输出*
			for (int j = 1; j <= 2*i-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
