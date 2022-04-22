public class Demo3 {
	public static void main(String[] args) {
		//编一个程序，输出所有的三位水仙花数，（如153=13+53+33）
		int a,b,c;
		System.out.println("三位水仙花数有：");
		for(int i=100;i<1000;i++) {			
			a=i%10;//各位
			b=i/10%10;//十位
			c=i/100;//百位
			if(a*a*a+b*b*b+c*c*c==i) {
				System.out.println(i);
			}
			
			
		}
	}
}
