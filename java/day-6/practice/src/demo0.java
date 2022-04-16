import java.util.Scanner;

public class demo0 {
	
	public static void main(String[] args) {
		//声明一个长度为5的整型数组
		int [] a;//操作1
		a=new int[5];//操作2
		
		//通常将操作1与2合并一起写
		int [] b=new int[5];
		
		//数组的数据类型和变量是一致的
		double [] c=new double[10];
		String [] str=new String[5];
		char [] d=new char [8];
		
		//在声明数组的时候同时给数组赋值
		int [] a1= {1,2,3,4,5};
		System.out.println("a1的第一个元素是："+a1[0]);
		System.out.println("a1的第四个元素是："+a1[3]);
//		System.out.println("a1的第六个元素是："+a1[5]);
		
		//从键盘上为数组赋值
		Scanner in=new Scanner(System.in);
		
		int [] a2=new int [5];
		for (int i = 0; i < a2.length; i++) {
			a2[i]=in.nextInt();
		}
		//输出
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}
	}
}
