//�����࣬
/* 1.��������һ��ģ�壬Ϊ����Ĵ����ṩ����
 * 2.�����಻һ���������󷽷������г��󷽷���һ���ǳ�����
 * 3.���󷽷�ֻ�з����Ķ��壬û�з�����ʵ��
 * 4.�������̳г����࣬������Ҫ��д�������е����еĳ��󷽷�
 * 5.���󷽷�������public��protected���Σ���������final��private��static����ʹ��
 * 
 * */
public abstract  class Shape {

	//��ͨ����
	public void show() {
		System.out.println("���Ǹ���shape��");
	}
	
	//���󷽷� �����ܳ�
	public abstract double calcPerimeter();
}
