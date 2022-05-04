
public class Vehicles {
	 private String brand;
	 private String color;
		
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Vehicles(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}

	public void run() {
		System.out.println(this.brand+"正在行驶");
	}
	
	public void showInfo() {
		System.out.println("品牌："+this.brand+"	颜色："+this.color);
	}
}
