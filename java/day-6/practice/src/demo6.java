
public class demo6 {
	//4������һ������30������Ԫ�ص����飬��˳�����θ�ֵΪ��2��ʼ��ż����2,4,6,8��.����
	//Ȼ����˳��ÿ5�������һ��ƽ��ֵ�������õ�ƽ��ֵ���δ������һ�������в����
	
	public static void main(String[] args) {
		int [] a=new int [30];
		
		for (int i = 0; i < a.length; i++) {
			a[i]=(i+1)*2;
		}
		double[] b=new double [6];
		//ÿ�������һ��ƽ��ֵ  0_4\5_9\10_14
		
		int sum=0;
		int index=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			if((i+1)%5==0) {
				b[index]=sum/5.0;
				index++;
				sum=0;	
			}
		
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]+" ");
		}
		
		
		
		
		
	}
}
