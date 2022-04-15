public class Demo7 {
//编写Java程序计算一下1～100的所有整数中出现多少次数字9
	public static void main(String[] args) {
		int a,b,temp=0;
		for(int i=1;i<100;i++) {
			a=i%10;b=i/10%10;
			if(a==9) 
				temp++;	
			if(b==9)
				temp++;	
		}
		System.out.println(temp);
	}
}
