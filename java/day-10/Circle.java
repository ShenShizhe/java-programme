
public class Circle extends Shape{

	
	private double r;
	private final double PI=Math.PI;
	
	
	public Circle(double r) {
		super();
		this.r = r;

	}


	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return 2*PI*r;
	}                     
	//重写show方法
	public void show() {
		System.out.println("这是圆形");
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		//通过父类指向子类
		Shape circle1 = new Circle(10);
		//Shape circle1 = new Shape(10);抽象类不能被实例化
		System.out.println("周长"+circle.calcPerimeter());
		System.out.println("周长："+circle1.calcPerimeter());
		
		
		
		int a = 1;
		a = 2;
		final int b = 1;
		//final修饰的变量一旦赋值就不能改变，即定义常量
		//final修饰的类为最终类，即不能有子类
//		b = 2;
	}
	
	
}
