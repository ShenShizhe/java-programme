
public class demo2 {
	public static void main(String[] args) {
		//��һ�����������к��������4�������ڴ���������ץ8�����ж�������Ϸ�ʽ
		//��x,��y,��z
		int count=0;
		for(int x=0;x<=4;x++) {
			for(int y=0;y<=4;y++) {
				for(int z=0;z<=4;z++) {
					if(x+y+z==8) {
//						System.out.println("��ɫ��"+x+"\t"+"��ɫ��"+y+"\t"+"��ɫ��"+z);
						count++;
					}
				}
			}		
		}		
		System.out.println(count);
	}
}
