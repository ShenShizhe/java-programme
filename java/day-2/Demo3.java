import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
    
		Scanner in=new Scanner(System.in);
    
		System.out.println("请输入您的性别(男/女):");
		char sex=in.next().charAt(0);
    
		System.out.println("请输入您的引体向上数量:");
		int num=in.nextInt();
    // 嵌套if
		if (sex == '男') {
			if(num>11) 
				System.out.println("您成绩达标");
			else 
				System.out.println("您成绩未达标");	
		}
		else {
			if(num>7) 
				System.out.println("您成绩成绩达标");			
			else 
				System.out.println("您成绩未达标");			
		}
		
		//多重if
//		if(sex=='男' && num>11)
//			System.out.println("男生及格");
//		else if(sex=='女' && num>7)
//			System.out.println("女生及格");
//		else
//			System.out.println("不及格");		
	}
}
