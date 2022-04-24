import java.util.Scanner;

public class Demo3 {
	//定义一个长度为10的整型数组，从键盘为数组赋值，并求出数组的平均值
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int [] a2=new int [10];
		for (int i = 0; i < a2.length; i++) {
			a2[i]=in.nextInt();
		}		
		int sum=0;
		for (int i = 0; i < a2.length; i++) {
			sum+=a2[i]; 
		}				
		System.out.println(sum/a2.length);
	}
	
}
