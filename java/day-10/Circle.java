
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
	//��дshow����
	public void show() {
		System.out.println("����Բ��");
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		//ͨ������ָ������
		Shape circle1 = new Circle(10);
		//Shape circle1 = new Shape(10);�����಻�ܱ�ʵ����
		System.out.println("�ܳ�"+circle.calcPerimeter());
		System.out.println("�ܳ���"+circle1.calcPerimeter());
		
		
		
		int a = 1;
		a = 2;
		final int b = 1;
		//final���εı���һ����ֵ�Ͳ��ܸı䣬�����峣��
		//final���ε���Ϊ�����࣬������������
//		b = 2;
	}
	
	
}
