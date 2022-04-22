public class Demo6 {
	public static void main(String[] args) {
		//计算1-2+3-4+5-6+……+99-100的和
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) 
				sum-=i;
			else 
				sum+=i;			
		}
		System.out.println(sum);
	}
}
