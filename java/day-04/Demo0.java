public class Demo0 {
	public static void main(String[] args) {
		
		/*/for(表达式1;条件判断;更新循环变量){
		 * }
		 * 		
		 */
		
		//计算1……100的和,for循环
		/*1.初始值i=1
		 * 2.循环条件i<=100\
		 * 3.循环体sum+=i
		 * 4.i的更新i++
		 * */
//		int sum=0;
//		for(int i=1;i<=100;i++) {			
//			sum+=i;
//		}			
//		System.out.println("1……100的和为："+sum);
		
		//计算1……100的和，while循环
//		int sum=0;
//		int i=1;
//		while(i<=100) {
//			sum+=i;
//			i++;
//		}
//		System.out.println("1……100的和为："+sum);
		
		
		//1~100不能被3整除的数的和
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			if(i%3!=0) 
//				sum+=i;
//		}		
//		System.out.println("1~100不能被3整除的数的和:"+sum);
		
		//计算1……10的阶层和(1！+2！……9！+10！)
		long t=1,sum=0;
		for(int i=1;i<=10;i++) {
			t*=i;	
			sum+=t;
		}
		System.out.println(sum);
		
	}
}
