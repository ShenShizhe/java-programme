import java.util.Scanner;

public class Demo0 {
	public static void main(String[] args) {
		
		
		/*
		 * 多分支
		 * if(条件){
		 * 
		 * }else if(条件){
		 * 
		 * }else if(条件）{
		 * ...
		 * }else{}
		 * 
		 * 
		 * 
		 * */
		
		//switch表达式中可以是整数、字符、字符串
		
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("请输入名次：");
		int n=in.nextInt();
		//switch判断
		switch(n) {
		case 1:
			System.out.println("获得笔记本电脑");
			break;
		case 2:
			System.out.println("获得移动硬盘");
			break;
		case 3:
			System.out.println("获得U盘");
			break;
		default:
			System.out.println("很遗憾，没有获得名次");
			break;
			
		}
		
		
		
		
		
		
		
		
		
	}
}
