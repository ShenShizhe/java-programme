public class Test {
	public static void main(String[] args) {
		
		//����ѧ������
		Student stu1=new Student();
		//Ϊ���Ը�ֵ
		stu1.no="001";
		stu1.name="����";
		stu1.className="���1��";
		
		//Ϊ������Դ���������������ֲ�����ͬ
		Student stu2=new Student();
		stu1.no="002";
		stu1.name="����";
		stu1.className="����1��";
		
		//���ѧ������Ϣ
//		System.out.println("ѧ�ţ�"+stu1.no+"\t������"+stu1.name+"\t�༶��"+stu1.classsName);
//		System.out.println("ѧ�ţ�"+stu2.no+"\t������"+stu2.name+"\t�༶��"+stu2.classsName);
		
		//������
//		stu1.showInfo();
//		stu2.showInfo();
		
//		int res=stu1.sum();
//		System.out.println("1��200 �ĺ��ǣ�"+res);
		
//		stu1.juice("â��");//â��Ϊʵ��
//		stu2.juice("����");
		
		//�β��޷�Ӱ��ʵ�α仯��
//		int a=1;
//		stu1.f1(a);
//		
//		System.out.println("aΪ��"+a);
		

		int res1=stu1.sum(150);
		System.out.println("1-150�ĺͣ�"+res1);

		int res2=stu1.sum(300);
		System.out.println("1-300�ĺͣ�"+res2);
		
		//5-60�ĺ�
		int res3=stu1.sum(5, 60);
		System.out.println("5-60�ĺ�Ϊ��"+res3);
	}
}

