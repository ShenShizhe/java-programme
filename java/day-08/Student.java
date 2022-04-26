public class Student {
	private String name;
	private String gender;
	private  int age; 
	private  int chinese;
	private  int math;
	private  int english;
	
	//利用工具自动产生get/set方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getChinese() {
		return chinese;
	}

	public void setChinese(int chinese) {
		this.chinese = chinese;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}
	
	//求总分
	public int total() {
		return this.chinese+this.english+this.math;
	}
	
	//求平均分
	public int avg() {
		return total()/3;
	}
	
	//构造方法，为姓名赋值
//	public Student(String name) {
//		this.name = name;
//	}
	//为姓名、性别、年龄赋值
//	public Student(String name,String gender,int age) {
//		this.name = name;
//		this.gender = gender;
//		this.age = age;
//	}
//	
//	public Student(int chinese,int math,int english) {
//		this.chinese = chinese;
//		this.math = math;
//		this.english = english;
//	}
	
	//利用工具产生

	public Student(String name, String gender, int age, int chinese, int math, int english) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}
	
}
