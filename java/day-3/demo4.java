import java.util.Scanner;

public class demo4 {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
    
		System.out.println("请输入X的值：：");
		double value=in.nextDouble();
		
		if(value<1) {
			System.out.println("Y的值为："+value);
		}else if(1<=value&&value<10) {
			value=3*value-2;
			System.out.println("Y的值为："+value);
		
	}else{
		value=4*value;
		System.out.println("Y的值为："+value);
	}
}
}
