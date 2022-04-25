
//		面向对象
		
		/*
		 * 类是描述现实中的学生，任何类都具有的属性和方法
		 * 属性：类的固有特性，例如：学号、姓名、班级
		 * 方法：类的行为，例如：自我介绍
		 * 类是抽象的模板，对象是具体的实现
		 * */

//类名 对象 =new 类名 ()；
public class Student{
	String no;
	String name;
	String className;
	int age;
	String address;

	
/*访问修饰符 返回值类型 方法名（参数列表）{ 
 * 		方法体
 * }
 * */
	
/*方法调用
 * 
 * 对象.方法名（参数）
 * 
 * */
	
	
	//无参数、有返回值
	//自我介绍的方法
	public void showInfo() {
		System.out.println("\t学号："+this.no+
	"\t姓名："+this.name+"\t班级："+this.className+
	"\t年龄："+this.age+"\t地址："+this.address);
	
	}
	
	//无参数、有返回值 
	//计算1-200的和
	public int sum() {
		int n=0;
		for (int i = 0; i <= 200; i++) {
			n+=i;
		}
		return n;
	}
	//有参数有返回值 计算1-n的和
	public int sum(int n) {
		int res=0;
		for (int i = 0; i <= n; i++) {
			res+=i;
		}
		return res;
	}
	//计算a-b的和
	public int sum(int a,int b) {
		int res=0;
		for (int i = a; i <= b; i++) {
			res+=i;
		}
		return res;
	}
	
	
	
	
	
	//有参数、无返回值 （fruit为形参）
	public void juice(String fruit) {
		System.out.println("榨出一杯"+fruit+"汁");
	}
	
	public void f1(int a) {
		a++;
	}
	

	public static void main(String[] args) {
		
		//创建学生对象
		Student stu1=new Student();
		//为属性赋值
		stu1.no="001";
		stu1.name="张三";
		stu1.className="软件1班";
		
		//为对象可以创建多个，但是名字不能相同
		Student stu2=new Student();
		stu1.no="002";
		stu1.name="李四";
		stu1.className="网络1班";
		
		//输出学生的信息
//		System.out.println("学号："+stu1.no+"\t姓名："+stu1.name+"\t班级："+stu1.classsName);
//		System.out.println("学号："+stu2.no+"\t姓名："+stu2.name+"\t班级："+stu2.classsName);
		
		//调方法
//		stu1.showInfo();
//		stu2.showInfo();
		
//		int res=stu1.sum();
//		System.out.println("1到200 的和是："+res);
		
//		stu1.juice("芒果");//芒果为实参
//		stu2.juice("葡萄");
		
		//形参无法影响实参变化的
//		int a=1;
//		stu1.f1(a);
//		
//		System.out.println("a为："+a);
		

		int res1=stu1.sum(150);
		System.out.println("1-150的和："+res1);

		int res2=stu1.sum(300);
		System.out.println("1-300的和："+res2);
		
		//5-60的和
		int res3=stu1.sum(5, 60);
		System.out.println("5-60的和为："+res3);
	}
		



