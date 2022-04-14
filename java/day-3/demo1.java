import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {	

		Scanner in=new Scanner(System.in);
		System.out.println("请输入星期几：");
		int n=in.nextInt();
		
		switch(n) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("工作");
			break;
		case 6:
		case 7:
			System.out.println("休息");
			break;
		default:
			System.out.println("您的输入有误！！！");
			break;
		}		
		/*
		 * switch只能处理等值判断；条件必须是整形变量、字符型、字符串型
		 * */			
		//使用多重if解决
		if(n==1||n==2||n==3||n==4||n==5) {
			System.out.println("工作");
		}else if(n==6||n==7) {
			System.out.println("休息");
		}else {
			System.out.println("您的输入有误！！！");
		}
	}
}
