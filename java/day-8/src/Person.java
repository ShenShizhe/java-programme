
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
		Person  p = new Person("审视者",20,"北京市朝阳区海淀路路120号");
		
		System.out.println("姓名："+p.getName()+",年龄："+p.getAge()+",家庭住址："+p.getAdder());
	}
	
}
