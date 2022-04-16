
public class demo6 {
	//4、定义一个含有30个整型元素的数组，按顺序依次赋值为从2开始的偶数（2,4,6,8….）。
	//然后按照顺序每5个数求出一个平均值，将所得的平均值依次存放在另一个数组中并输出
	
	public static void main(String[] args) {
		int [] a=new int [30];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=(i+1)*2;
		}
		double[] b=new double [6];
		//每五个数求一个平均值  0_4\5_9\10_14
		
		int sum=0;
		int index=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			if((i+1)%5==0) {
				b[index]=sum/5.0;
				index++;
				sum=0;	
			}
		
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]+" ");
		}
		
		
		
		
		
	}
}
