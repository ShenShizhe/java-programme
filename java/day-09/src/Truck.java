
public class Truck extends Vehicles{

	private float load;
	
	
	public Truck(String brand, String color,float load) {
		super(brand, color);
		this.load =load;
		// TODO Auto-generated constructor stub
	}


	public float getLoad() {
		return load;
	}


	public void setLoad(float load) {
		this.load = load;
	}

	public void showtruck() {
		System.out.println("∆∑≈∆£∫"+getBrand()+" —’…´"+getColor()+" ‘ÿ÷ÿ"+getLoad());
	}
	
}
