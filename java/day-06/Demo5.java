import java.util.Arrays;

public class Demo5 {
	//现在定义如下的一个数组：int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5},要求将以上数组中不为0的值存入一个新的数组
	
	public static void main(String[] args) {
		
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};	
		//计算一下数组中不为0的元素有多少
		int n=0;
		for (int i = 0; i < oldArr.length; i++) {
			if(oldArr[i]>0)
				n++;
		}
		int newArr[]=new int [n];
		//遍历之前数组，把不为0的元素放入newArr，注意newArr下标和oldArr不是同一个
		int index=0;//代表newArr的下标
		
		for (int i = 0; i < oldArr.length; i++) {
			if(oldArr[i]>0) {
				newArr[index]=oldArr[i];
				index++;
			}
		}
		//输出newArr
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
		
	}
}
