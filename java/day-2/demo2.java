import java.util.Scanner;

public class demo2 {
	public static void main(String[] args) {
    
		Scanner in=new Scanner(System.in);
    
		System.out.println("请依次输入三个数:");
    
		int a=in.nextInt(),b =in.nextInt(),c =in.nextInt();
    //嵌套if
		if(a>=b) {
			if(a>=c) 
				System.out.println("最大的数是"+a);			
			else 
				System.out.println("最大的数是"+c);			
		}
		else {
			if(b>=c) 
			System.out.println("最大的数是"+b);
			else 
			System.out.println("最大的数是"+c);		
	  }
// 		多重if
// 		if (a>b&&a>c);
// 		System.out.println("最大的数是"+a);	
// 		else if(b>a && b>c);
// 		System.out.println("最大的数是"+b);
// 		else;
// 		System.out.println("最大的数是"+c);			
  }
	
}
