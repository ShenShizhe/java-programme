# day-6
## 数组的定义与使用
#### Demo0 (https://github.com/ShenShizhe/java-programme/edit/main/java/day-6/Demo0.java)
- 数组的声明
#### Demo1 (https://github.com/ShenShizhe/java-programme/edit/main/java/day-6/Demo1.java)
- 计算五个学生的平均分
1. 定义长度为5的整型数组
2. 为数组赋值
3. 求和
4. 求平均分
```
		Scanner in=new Scanner(System.in);
		int [] a2=new int [5];
		for (int i = 0; i < a2.length; i++) 
			a2[i]=in.nextInt();
		//输出		
		int sum=0;
		for (int i = 0; i < a2.length; i++) 
			sum+=a2[i]; //求和
```
#### Demo2 (https://github.com/ShenShizhe/java-programme/edit/main/java/day-6/Demo2.java)
- 对一个数组进行排序，并取出最大值和最小值

	- 排序
	```	
			int [] a= {32,33,45,34,56,67,86,27,3,56,76,85,69};
			Arrays.sort(a);
			for (int i = 0; i < a.length; i++) 
				System.out.print(a[i]+" ");
	```
	- 查找(如果小于0，则说明没有该值)
	```
			int index=Arrays.binarySearch(a, 86);
			System.out.println("查找结果："+index);		
			//最大值和最小值
			int max=a[0];
			int min=a[0];		
			for (int i = 0; i < a.length; i++) {
				if(max<=a[i]) max=a[i];
				if(min>=a[i]) min=a[i];
			}
	```
#### Demo3 (https://github.com/ShenShizhe/java-programme/edit/main/java/day-6/Demo3.java)
- 定义一个长度为10的整型数组，从键盘为数组赋值，并求出数组的平均值
```
		int [] a2=new int [10];
		for (int i = 0; i < a2.length; i++) 
			a2[i]=in.nextInt();		
		int sum=0;
		for (int i = 0; i < a2.length; i++) 
			sum+=a2[i]; 						
```
#### Demo4 (https://github.com/ShenShizhe/java-programme/edit/main/java/day-6/Demo4.java)
- 定义一个整型数组{55,45,5,44,2,6,56,15,4,12}，找出数组中的最大值和最小值
#### Demo5 (https://github.com/ShenShizhe/java-programme/edit/main/java/day-6/Demo5.java)
- 现在定义如下的一个数组：int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}
- 要求将以上数组中不为0的值存入一个新的数组
```
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
```
#### Demo6 (https://github.com/ShenShizhe/java-programme/edit/main/java/day-6/Demo6.java)
- 定义一个含有30个整型元素的数组，按顺序依次赋值为从2开始的偶数（2,4,6,8….）
- 然后按照顺序每5个数求出一个平均值，将所得的平均值依次存放在另一个数组中并输出
```
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
```
#### Demo7 (https://github.com/ShenShizhe/java-programme/edit/main/java/day-6/Demo7.java)

- 三个数字1,2,3组成一个三位数且每个数字只出现一次
- 有多少种方法，试着输出
















#### Demo8 (https://github.com/ShenShizhe/java-programme/edit/main/java/day-6/Demo8.java)
