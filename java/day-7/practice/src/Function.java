
public class Function {
	public void root(int a,int b,int c) {
		int  detal=b*b-4*a*c;
		if(detal<0)
			System.out.println("无实数解");
		else if(detal==0) {
			double x=-b/(2*a);
			System.out.println("有且只有有一个实数解\t："+x);
		}
			
		else {
			double x1=(-b+Math.sqrt(detal)/(2*a));
			double x2=(-b+Math.sqrt(detal)/(2*a));
			System.out.println("有两个解\tx1:"+x1+"\tx2:"+x2);
			
		}
	}
	public static void main(String[] args) {
		Function function=new Function();
		function.root(1, 5, 3);
	}
}
