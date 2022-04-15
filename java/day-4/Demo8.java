public class Demo8 {
	//1^1000的完数，完数例如：6=1+2+3；
	public static void main(String[] args) {
		//求一个数的约数和1-n/2
		for(int n=1;n<=1000;n++) {
			int sum=1;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0)
					sum+=i;
			}
			//System.out.println(sum);
			//比较
			if(sum==n)
				System.out.println(n);
		}		
	}
}
