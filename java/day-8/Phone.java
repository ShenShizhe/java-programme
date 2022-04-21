
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
		System.out.println("正在使用价格为"+price+"元的"+brand+"手机"+"打电话");
	}
	
	public void sendMessage() {
		System.out.println("正在使用价格为"+price+"元的"+brand+"手机"+"发短信");
	}
	public void playGame() {
		System.out.println("正在使用价格为"+price+"元的"+brand+"手机"+"玩游戏");
	}
	
	public static void main(String[] args) {
		Phone p1 = new Phone("小米9",2398);
		Phone p2 = new Phone("小米8",1598);
		Phone p3 = new Phone("红米",998);
		
		p1.call();
		p2.sendMessage();
		p3.playGame();

	}
	
	
}
