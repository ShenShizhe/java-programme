import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		//�������ѧ����ƽ����
		//1�����峤��Ϊ5����������
		//2��Ϊ���鸳ֵ
		//3�����
		//4����ƽ����
		Scanner in=new Scanner(System.in);
		int [] a2=new int [5];
		for (int i = 0; i < a2.length; i++) {
			a2[i]=in.nextInt();
		}
		//���		
		int sum=0;
		for (int i = 0; i < a2.length; i++) {
			sum+=a2[i]; //���
		}				
		System.out.println(sum/a2.length);
		
	}
}
