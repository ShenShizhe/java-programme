
public class Undergraduate extends Student1 {
	
	private String telephone;
	
	public Undergraduate(String no, String name, String sex, int age,String telephone ) {
		super(no, name, sex, age);
		this.telephone = telephone;
		// TODO Auto-generated constructor stub
	}
	

	public void showInfo() {
		System.out.println("ѧ�ţ�"+getNo()+" ������"+getName()+" �绰��"+telephone);
	}

	public static void main(String[] args) {
		Undergraduate undergraduate = new Undergraduate("15115525","����","122525");
		undergraduate.showInfo();
	}
	
}
