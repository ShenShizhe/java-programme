
public class Demo3 {
	public static void main(String[] args) {
//		for (int i = 0; i <5; i++) {
//			System.out.println("**********");			
//		}
		
		
		//外层i循环控制行数
		//内层j控制每一行的数
//		for (int i = 0; i <5; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.println("*");				
//			}
//			System.out.println();
//		}
		
		//使用嵌套循环用*输出三角形
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <=i ; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
