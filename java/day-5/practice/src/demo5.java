import java.util.Scanner;

public class demo5 {
//����Ļ��������x������һ���߳�Ϊx�ĵȱ�������
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("������һ������");		
		int n=in.nextInt();		
		for(int i=1;i <=n;i++) {	
			//���һ���ո�
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");				
			}
			//���*
			for (int j = 1; j <= 2*i-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
