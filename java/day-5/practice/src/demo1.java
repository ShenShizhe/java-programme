
public class demo1 {
	public static void main(String[] args) {
		//����1��2��5�ֵ�Ӳ�����ɣ���Ϊ1Ԫ���ж����з���
		//��1��2��5��Ӳ�ҵ������ֱ�Ϊx��y��z
		//x[0,100],y[0,50],z[0,20]
		int count=0;
		for(int x=0;x<=100;x++) {
			for(int y=0;y<=50;y++) {
				for(int z=0;z<=20;z++) {
					if(x*1+y*2+z*5 == 100) {
						count++;
						//System.out.println("1��:"+x+"\t"+"2��:"+y+"\t"+"5��"+z);
						
					}
				}
			}
		}
		System.out.println(count);
	}
}
