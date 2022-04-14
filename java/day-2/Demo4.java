import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
    
		Scanner in=new Scanner(System.in);
    
		System.out.println("请输入身高(cm):");
		double height=in.nextDouble();
    
		System.out.println("请输入体重(kg):");
		double weight=in.nextDouble();
    
		double biaow=height-100;
    
		if(weight==biaow) {
			System.out.println("您为标准体重");
		}else {
			if(weight-5>weight) 
				System.out.println("您身体过胖");
			else
				System.out.println("您身体过瘦");
		}
		
	}
}
