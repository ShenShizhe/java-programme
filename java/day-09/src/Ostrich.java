//Ostrich 鸵鸟
public class Ostrich extends Bird{

	public Ostrich(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	//重写fly方法，和父类的方法名完全一样
	public void fly() {
		System.out.println("我是鸵鸟，不会飞");
	}
}
