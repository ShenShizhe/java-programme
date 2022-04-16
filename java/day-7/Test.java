public class Test {
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
}

