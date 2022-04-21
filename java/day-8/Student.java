	//封装；外部不能访问私有的的属性
	//This is face class act write of one
	//关键词：private
	
	//如何给age属性赋值
	//方法：setAge、getAge

//构造方法的作用：初始化对象，简化代码
//特点1 ：方法名和类名完全相同，且没有返回值
//特点2:构造方法可以有多个
//特点3：new 对象的时候，参数必须与构造方法一致
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
