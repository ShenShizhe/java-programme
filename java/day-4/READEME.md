# day-4 

##
#### Demo0
1. 计算1……100的和,for循环
```
  		int sum=0;
  		for(int i=1;i<=100;i++) {			
  		sum+=i;
  		}			
```

		
2. 计算1……100的和，while循环
```
    int sum=0;
	  int i=1;
		while(i<=100) {
			sum+=i;
			i++;
		}
```
		
		
3. 1~100不能被3整除的数的和
```
      int sum=0;
      for(int i=1;i<=100;i++) {
      if(i%3!=0) 
          sum+=i;
      }	
```
    
		
4. 计算1……10的阶层和(1！+2！……9！+10！)
```
		long t=1,sum=0;
		for(int i=1;i<=10;i++) {
			t*=i;	
			sum+=t;
		}
```

#### Demo1
- 求两个数的最大公约数和最小公倍数
	- 获取用户输入的两个数 
		1. 最大公约数：例如24, 18，最大公约数是6
		2. 最小公倍数：例如24 18，最小公倍数72
		 
#### Demo2



```
	/*do{
	 * 循环操作
	 * }while(循环条件);
	 * 
	 * 选执行操作再判断
	 * */
```	
1. 先考试，再判断成绩是否合格！
```
		Scanner in=new Scanner(System.in);
		int score=0;
		do {
			System.out.println("请输入考试成绩：");
			score=in.nextInt();
		}while(score<60);
		System.out.println("人才啊！居然通过了！！");
```
2. 随机产生1……100的随机数，用户输入数据来猜，系统给出提示(大了，小了)，最后统计次数
```
		Scanner in=new Scanner(System.in);
		int n=(int)(Math.random()*100+1);//1……100的随机数
		int num=0,count=0;//计数器
		do {
			count++;
			System.out.println("请输入你认为对的数：");
			num=in.nextInt();
			if(num>n) {
				System.out.println("喂喂喂！！这么大的吗？？");
			}else if(num<n) {
				System.out.println("什么玩意？我有这么小？？");
			}
		}while(num!=n);
		System.out.println("17张牌！你能猜对???真有你的，居然猜了"+count+"次，厉害啊！！");
```

#### Demo3
- 编一个程序，输出所有的三位水仙花数，（如153=13+53+33）
#### Demo4
- 操场上有学生排队（人数少于200）
	- 如果三个人一组则多1人
	- 如果四个人一组则多2人
	- 如果五个人一组则多3人
- 问共有多少人？
#### Demo5
- 编一个程序，从键盘输入10个数，要求找出最小数和最大数
#### Demo6
- 计算1-2+3-4+5-6+……+99-100的和
#### Demo7
- 编写Java程序计算一下1～100的所有整数中出现多少次数字9
#### Demo8
- 完数
	- 例如：6=1+2+3
		- 求1~1000的完数


