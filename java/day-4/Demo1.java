import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		/* 最大公约数：例如24, 18，最大公约数是6
		 * 最小公倍数：例如24 18，最小公倍数72
		 * */
		Scanner in=new Scanner(System.in);
		System.out.println("请输入两个正整数：");
		int n=in.nextInt(),m=in.nextInt(),gcd=0;
		//最大公约数 约数一定是在1-n或者1-m之间
		for(int i=n;i>=1;i--) {
			if(n%i==0 && m%i==00) {
				gcd=i;
				System.out.println("这两个数的最大公约数为："+i);
				break;
			}
		}
		
		//最小公倍数
		System.out.println("这两个数的最小公倍数为："+m*n/gcd);
		
		
	}

}
