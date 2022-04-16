import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		//计算五个学生的平均分
		//1、定义长度为5的整型数组
		//2、为数组赋值
		//3、求和
		//4、求平均分
		Scanner in=new Scanner(System.in);
		int [] a2=new int [5];
		for (int i = 0; i < a2.length; i++) {
			a2[i]=in.nextInt();
		}
		//输出		
		int sum=0;
		for (int i = 0; i < a2.length; i++) {
			sum+=a2[i]; //求和
		}				
		System.out.println(sum/a2.length);
		
	}
}
