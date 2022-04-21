
public class Phone {
	private String brand;
	private int price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	public void call() {
		System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"�ֻ�"+"��绰");
	}
	
	public void sendMessage() {
		System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"�ֻ�"+"������");
	}
	public void playGame() {
		System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"�ֻ�"+"����Ϸ");
	}
	
	public static void main(String[] args) {
		Phone p1 = new Phone("С��9",2398);
		Phone p2 = new Phone("С��8",1598);
		Phone p3 = new Phone("����",998);
		
		p1.call();
		p2.sendMessage();
		p3.playGame();

	}
	
	
}
