import java.util.Arrays;
public class demo4 {
	//2������һ����������{55,45,5,44,2,6,56,15,4,12}���ҳ������е����ֵ����Сֵ
	public static void main(String[] args) {
				int [] a= {55,45,5,44,2,6,56,15,4,12};							
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
