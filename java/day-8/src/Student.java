	//��װ���ⲿ���ܷ���˽�еĵ�����
	//This is face class act write of one
	//�ؼ��ʣ�private
	
	//��θ�age���Ը�ֵ
	//������setAge��getAge

//���췽�������ã���ʼ�����󣬼򻯴���
//�ص�1 ����������������ȫ��ͬ����û�з���ֵ
//�ص�2:���췽�������ж��
//�ص�3��new �����ʱ�򣬲��������빹�췽��һ��
public class Student {
	private String name;
	private String gender;
	private  int age; 
	private  int chinese;
	private  int math;
	private  int english;
	//���ù����Զ�����get/set����
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
	
	//���ܷ�
	public int total() {
		return this.chinese+this.english+this.math;
	}
	
	//��ƽ����
	public int avg() {
		return total()/3;
	}
	
	//���췽����Ϊ������ֵ
//	public Student(String name) {
//		this.name = name;
//	}
	//Ϊ�������Ա����丳ֵ
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
	
	//���ù��߲���

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
