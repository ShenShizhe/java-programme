import java.util.Arrays;

public class demo5 {
	//3�����ڶ������µ�һ�����飺int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5},Ҫ�����������в�Ϊ0��ֵ����һ���µ�����
	
	public static void main(String[] args) {
		
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};	
		//����һ�������в�Ϊ0��Ԫ���ж���
		int n=0;
		for (int i = 0; i < oldArr.length; i++) {
			if(oldArr[i]>0)
				n++;
		}
		int newArr[]=new int [n];
		//����֮ǰ���飬�Ѳ�Ϊ0��Ԫ�ط���newArr��ע��newArr�±��oldArr����ͬһ��
		int index=0;//����newArr���±�
		
		for (int i = 0; i < oldArr.length; i++) {
			if(oldArr[i]>0) {
				newArr[index]=oldArr[i];
				index++;
			}
		}
		//���newArr
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
		
	}
}
