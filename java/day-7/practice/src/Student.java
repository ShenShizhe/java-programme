
//		�������
		
		/*
		 * ������������ʵ�е�ѧ�����κ��඼���е����Ժͷ���
		 * ���ԣ���Ĺ������ԣ����磺ѧ�š��������༶
		 * �����������Ϊ�����磺���ҽ���
		 * ���ǳ����ģ�壬�����Ǿ����ʵ��
		 * */

//���� ���� =new 
public class Student{
	String no;
	String name;
	String className;
	int age;
	String address;

	
/*�������η� ����ֵ���� �������������б�{ 
 * 		������
 * }
 * */
	
/*��������
 * 
 * ����.��������������
 * 
 * */
	
	
	//�޲������з���ֵ
	//���ҽ��ܵķ���
	public void showInfo() {
		System.out.println("\tѧ�ţ�"+this.no+
	"\t������"+this.name+"\t�༶��"+this.className+
	"\t���䣺"+this.age+"\t��ַ��"+this.address);
	
	}
	
	//�޲������з���ֵ 
	//����1-200�ĺ�
	public int sum() {
		int n=0;
		for (int i = 0; i <= 200; i++) {
			n+=i;
		}
		return n;
	}
	//�в����з���ֵ ����1-n�ĺ�
	public int sum(int n) {
		int res=0;
		for (int i = 0; i <= n; i++) {
			res+=i;
		}
		return res;
	}
	//����a-b�ĺ�
	public int sum(int a,int b) {
		int res=0;
		for (int i = a; i <= b; i++) {
			res+=i;
		}
		return res;
	}
	
	
	
	
	
	//�в������޷���ֵ ��fruitΪ�βΣ�
	public void juice(String fruit) {
		System.out.println("ե��һ��"+fruit+"֭");
	}
	
	public void f1(int a) {
		a++;
	}
	
	
	
	
}
		
		



