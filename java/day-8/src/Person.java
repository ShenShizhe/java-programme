
public class Person {
	private String name;
	private  int age; 
	private String adder;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdder() {
		return adder;
	}
	public void setAdder(String adder) {
		this.adder = adder;
	}
	public Person(String name, int age, String adder) {
		super();
		this.name = name;
		this.age = age;
		this.adder = adder;
	}
	
	public static void main(String[] args) {
		Person  p = new Person("������",20,"�����г���������··120��");
		
		System.out.println("������"+p.getName()+",���䣺"+p.getAge()+",��ͥסַ��"+p.getAdder());
	}
	
}
