
public class Undergraduate extends Student1 {
	
	private String telephone;
	
	public Undergraduate(String no, String name, String sex, int age,String telephone ) {
		super(no, name, sex, age);
		this.telephone = telephone;
		// TODO Auto-generated constructor stub
	}
	

	public void showInfo() {
		System.out.println("学号："+getNo()+" 姓名："+getName()+" 电话："+telephone);
	}

	public static void main(String[] args) {
		Undergraduate undergraduate = new Undergraduate("15115525","张三","122525");
		undergraduate.showInfo();
	}
	
}
