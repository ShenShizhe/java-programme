import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		
		//排序
		int [] a= {32,33,45,34,56,67,86,27,3,56,76,85,69};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		//查找(如果小于0，则说明没有该值)
		int index=Arrays.binarySearch(a, 86);
		System.out.println("查找结果："+index);
		
		//最大值和最小值
		int max=a[0];
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(max<=a[i]) max=a[i];
			if(min>=a[i]) min=a[i];
		}
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
	}
}
