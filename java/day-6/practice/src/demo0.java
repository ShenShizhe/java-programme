import java.util.Scanner;

public class demo0 {
	
	public static void main(String[] args) {
		//����һ������Ϊ5����������
		int [] a;//����1
		a=new int[5];//����2
		
		//ͨ��������1��2�ϲ�һ��д
		int [] b=new int[5];
		
		//������������ͺͱ�����һ�µ�
		double [] c=new double[10];
		String [] str=new String[5];
		char [] d=new char [8];
		
		//�����������ʱ��ͬʱ�����鸳ֵ
		int [] a1= {1,2,3,4,5};
		System.out.println("a1�ĵ�һ��Ԫ���ǣ�"+a1[0]);
		System.out.println("a1�ĵ��ĸ�Ԫ���ǣ�"+a1[3]);
//		System.out.println("a1�ĵ�����Ԫ���ǣ�"+a1[5]);
		
		//�Ӽ�����Ϊ���鸳ֵ
		Scanner in=new Scanner(System.in);
		
		int [] a2=new int [5];
		for (int i = 0; i < a2.length; i++) {
			a2[i]=in.nextInt();
		}
		//���
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}
	}
}
