//接口和抽象类的概念非常接近，可以把接口看成纯粹的抽象类
/* 1、接口中只能定义抽象方法
 * 2、接口的方法默认是公共抽象的方法，因此public和abstract可以省略不写
 * 3、接口中的变量只能只能是静态常量（final static）
 * */
public interface A {
	
	final static double PI=3.14;
	
//	static int a=1;
	//抽象方法 计算周长
//		public abstract double calcPerimeter();
	//计算面积	
	public abstract double area();
	
}
