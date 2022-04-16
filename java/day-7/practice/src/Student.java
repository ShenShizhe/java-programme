
//		面向对象
		
		/*
		 * 该类是描述现实中的学生，任何类都具有的属性和方法
		 * 属性：类的固有特性，例如：学号、姓名、班级
		 * 方法：类的行为，例如：自我介绍
		 * 类是抽象的模板，对象是具体的实现
		 * */

//类名 对象 =new 
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
	
	
	
	
}
		
		



