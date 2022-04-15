import java.util.Scanner;
//编一个程序，从键盘输入10个数，要求找出最小数和最大数
public class Demo5 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请从键盘输入10数：");
		int max=-1000000000,min=1000000000;
		for(int i=0;i<10;i++) {
			int n=in.nextInt();
			if(n>max)
				max=n;
			if(n<min) {
				min=n;
			}
		}
		System.out.println("最大值："+max+"最小值："+min);	
	}
}
