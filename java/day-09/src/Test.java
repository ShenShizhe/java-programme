/* 1.��̬�ı����ܶ����еĶ�����
 * 2.��̬��������ֱ��ͨ���������� (t2.b++==Test.b++)
 * 3.��̬�ķ���Ҳ����ͨ����������
 * 4.ֻ�о�̬����ֻ�ܵ��þ�̬��������ͨ�������ɵ��ã�
 * */
public class Test {
//	int a;//��ͨ��������������
//	static int b;//��̬�������˴˹���
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
//		Test.print();//�������þ�̬����
//		
//		
//		System.out.println("t1��a:"+t1.a);
//		System.out.println("t1��b:"+t1.b);
//		System.out.println("t2��a:"+t2.a);
//		System.out.println("t2�� b:"+t2.b);
//	}
//2222222222	
//	public static void main(String[] args) {
//		Sparrow sparrow = new Sparrow ("��ȸ");
//		Ostrich ostrich = new Ostrich ("����");
//		
//		sparrow.fly();
//		//������ķ����������������ʱ����Ҫ��д
//		ostrich.fly();
//		
//	}
	
//Vehicles
	public static void main(String[] args) {
		Car car = new Car("����","��ɫ",8);
		car.showCar();
		car.run();
		
		Truck truck = new Truck("����","��ɫ",12);
		truck.showInfo();
		truck.showtruck();
		truck.run();
	}
//	
	
}
