public class Test {
//	int a;//普通变量，互不干扰
//	static int b;//静态变量，彼此共享
//	
//	public static void print() {
//		b++;
//		System.out.println("I am static");
//	}
//	
//	
//	
//	
//	public static void main(String[] args) {
//		
//		Test t1 = new Test();
//		Test t2 = new Test();
//		
//		t1.a++;
//		t2.b++;
//		
//		t2.a++;
//		t2.b++;
//		
//		Test.print();//类名调用静态方法
//		
//		
//		System.out.println("t1的a:"+t1.a);
//		System.out.println("t1的b:"+t1.b);
//		System.out.println("t2的a:"+t2.a);
//		System.out.println("t2的 b:"+t2.b);
//	}
//2222222222	
//	public static void main(String[] args) {
//		Sparrow sparrow = new Sparrow ("麻雀");
//		Ostrich ostrich = new Ostrich ("鸵鸟");
//		
//		sparrow.fly();
//		//当父类的方法不适用于子类的时候，需要重写
//		ostrich.fly();
//		
//	}
	
//Vehicles
	public static void main(String[] args) {
		Car car = new Car("大众","白色",8);
		car.showCar();
		car.run();
		
		Truck truck = new Truck("东风","绿色",12);
		truck.showInfo();
		truck.showtruck();
		truck.run();
	}
//	
	
}
