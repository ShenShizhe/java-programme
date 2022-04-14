public class demo5 {
	
	public static void main(String[] args) {
//循环的要素
		/*1.循环变量的初始值			例：打印36张试卷
		 * 2.循环的条件				i=1;
		 * 3.循环变量的自增或者自减		i<=36
		 * 4.循环的操作				i++
		 * 						system.out.print()
		 */
	
		//while循环
//		int i=1;
//		while(i<=36) {
//			System.out.println("打印第"+i+"张试卷");
//			i++;
//		}
		
		
		int sum=0,i=2;
		while(i<=100) {
			sum+=i;			
			i+=2;
		}
		System.out.println(sum);
	}
	
	
}
