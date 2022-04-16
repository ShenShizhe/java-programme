public class Demo7 {
static int count=0;
public static void main(String[] args) {
	//三个数字1,2,3组成一个三位数且每个数字只出现一次
    	//有多少种方法，试着输出！
	
	int[] a= {1,2,3,4,5,6,7,8,9};
	
	allSort(a,0,9);
	System.out.println(count/6);
}
public static void swap(int[] a,int p,int q) {
	int temp=a[p]; 
	a[p]=a[q];
	a[q]=temp;
}
public static void allSort(int[]a,int p,int q) {
	  if(p==q) {
//		  for(int i=0;i<a.length;i++) {
//			  System.out.println(a[i]+" ");
		  if(a[0]+a[1]+a[2]+a[3]==a[3]+a[4]+a[5]+a[6]&&a[3]
				  +a[4]+a[5]+a[6]==a[6]+a[7]+a[8]+a[0]) {
			  count++;
		  }
		  System.out.println();
	  }else {
		  for(int i=p;i<q;i++) {
			  swap(a,p,i);
			  allSort(a,p+1,q);
			  swap(a,p,i);
       }
     }
   }
}


