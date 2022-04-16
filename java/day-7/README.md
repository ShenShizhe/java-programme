# day-7
## 类和对象
#### Student (https://github.com/ShenShizhe/java-programme/blob/main/java/day-7/Student.java)

- 类是描述现实中的学生，任何类都具有的属性和方法
- 属性：类的固有特性，例如：学号、姓名、班级
- 方法：类的行为，例如：自我介绍
- 类是抽象的模板，对象是具体的实现

  - 创建对象方法：
    - 类名 对象 =new 类名 ()；
  - 创建类方法：
    - 修饰符 class 类名{成员}
        2. 修饰符是可选的，有public（公共）或不加
        1. class——关键词，必须有
        3. 类名——首字母大写，且按驼峰命名规则起名，必须有
        4. 成员——有成员属性和成员方法

  - 成员属性定义

    - [ public | private | protected ]　[ static ]　[ final ]　类型　成员名

      1. 类型和成员名是必须的，其他都是可选项
      2. public　公共成员——不同包也可访问
      3. private　私有成员——只能在本类中访问
      4. protected　保护成员——同包及子类可访问
      5. 上面三个都不加　　默认——同包可访问
      6. static　静态成员——属于类的，它不属于具体的对象，该类的所有对象共享该成员
      7. 所有不是static的对象的对象都要实例化才能访问
      8. Static成员或方法直接通过类名访问（通过：[ 类名. ]引用）
      9. final 成员——最终成员，其值不能被改变
      10. final 类——最终类，不能被继承
      11. final 方法——最终方法，该方法不能被重写
      12. 注意：final和public可以加载类上面，而static不能
  - 成员方法定义
	```
		[public|private|protected] [static] [final] 类型 方法名（形参）{
		方法体；
		return表达式；
	      }
	```
      1. 类型（首字母大写）(必须)：指返回值的类型（既可以是基本类型，也可以是对象类型）
      2. 方法名 (必须)：做什么
      3. 法体：定义了方法的具体内容，通常起到两个作用：一是围绕类的属性进行各种操作，二是与其他的类与对象进行数据交流、消息传递的操作
      4. 形参(可选)：只有两种类型：基本类型和对象类型。方法调用中参数用来传递数值、传递引用，同时方法还可以嵌套、递归调用
      5. return除了能返回值，还可以结束此方法体，值得注意的是：方法体中如果指定了非void的返回类型，方法中就必须包含一条return语句保证任何情况下都有返回数值
      6. return语句后面不能跟任何表达式。
      - 注意：
      1. 在一个方法中定义另一个方法将产生语法错误（方法不能嵌套定义，类可以），最好避免局部变量”屏蔽“实例(成员)变量，在一个类中不使用同名标识符就可以做到这一点
      2. 若同名了成员变量被屏蔽，此时又要访问成员变量，可用this.成员变量。
　　　- 关于局部变量与实例变量：
　　　1. 局部变量：在方法中声明或定义的变量，当此方法被调用时创建变量，当此方法执行完时变量被释放
　　　2. 在所有方法之外但在类体中声明或定义的变量，有效范围是整个类
　　　3. 屏蔽不是覆盖












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
		




#### 
