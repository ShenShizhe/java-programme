//抽象类，
/* 1.抽象类是一个模板，为子类的创建提供依据
 * 2.抽象类不一定包含抽象方法，但有抽象方法的一定是抽象类
 * 3.抽象方法只有方法的定义，没有方法的实现
 * 4.如果子类继承抽象类，子类需要重写抽象类中的所有的抽象方法
 * 5.抽象方法可以用public、protected修饰，但不能与final、private和static复合使用
 * 
 * */
public abstract  class Shape {

	//普通方法
	public void show() {
		System.out.println("这是父类shape类");
	}
	
	//抽象方法 计算周长
	public abstract double calcPerimeter();
}
