public class Test {
	public static void main(String[] args) {
//		stu.setAge(20);
//		System.out.println("ѧ�������ǣ�"+stu.getAge());
		
		Student s1 = new Student("����","��",20,80,100,85);
		Student s2 = new Student("����","Ů",17,95,60,95);		
		
//		s1.setName("����");
//		s1.setGender("��");
//		s1.setAge(20);
//		s1.setChinese(75);
//		s1.setMath(100);
//		s1.setEnglish(60);
		
//		s2.setName("����");
//		s2.setGender("Ů");
//		s2.setAge(19);
//		s2.setChinese(90);
//		s2.setMath(98);
//		s2.setEnglish(100);
		
		System.out.println(s1.getName()+"�ܷ�:"+s1.total()+"ƽ���֣�"+s1.avg());
		System.out.println(s2.getName()+"�ܷ�:"+s2.total()+"ƽ���֣�"+s2.avg());
	}
}
