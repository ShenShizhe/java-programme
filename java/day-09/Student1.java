
public class Student1 {
	//ѧ��no������name���Ա�sex������age
	private String no;
	private String name;
	private String sex;
	private int age;
	
	public Student1(String no, String name, String sex, int age) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	
	public Student1(String no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void homework() {
		System.out.println("д��ҵ");
	}
	
}




