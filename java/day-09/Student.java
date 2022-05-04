
class Student  extends Person{

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Person person = new Person("уехЩ",17);
		person.showInfo();
	}
}