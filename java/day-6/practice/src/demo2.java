import java.util.Arrays;

public class demo2 {
	public static void main(String[] args) {
		
		//����
		int [] a= {32,33,45,34,56,67,86,27,3,56,76,85,69};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		//����(���С��0����˵��û�и�ֵ)
		int index=Arrays.binarySearch(a, 86);
		System.out.println("���ҽ����"+index);
		
		//���ֵ����Сֵ
		int max=a[0];
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(max<=a[i]) max=a[i];
			if(min>=a[i]) min=a[i];
		}
		System.out.println("���ֵ��"+max);
		System.out.println("��Сֵ��"+min);
	}
}
