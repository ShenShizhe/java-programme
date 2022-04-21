public class Test {
	public static void main(String[] args) {
//		stu.setAge(20);
//		System.out.println("学生年龄是："+stu.getAge());
		
		Student s1 = new Student("张三","男",20,80,100,85);
		Student s2 = new Student("李四","女",17,95,60,95);		
		
//		s1.setName("张三");
//		s1.setGender("男");
//		s1.setAge(20);
//		s1.setChinese(75);
//		s1.setMath(100);
//		s1.setEnglish(60);
		
//		s2.setName("李四");
//		s2.setGender("女");
//		s2.setAge(19);
//		s2.setChinese(90);
//		s2.setMath(98);
//		s2.setEnglish(100);
		
		System.out.println(s1.getName()+"总分:"+s1.total()+"平均分："+s1.avg());
		System.out.println(s2.getName()+"总分:"+s2.total()+"平均分："+s2.avg());
	}
}
