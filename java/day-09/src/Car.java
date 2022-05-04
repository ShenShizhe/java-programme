
public class Car extends Vehicles{

	private int seats;
	
	public Car(String brand, String color,int seats) {
		super(brand, color);
		this.seats = seats;
		// TODO Auto-generated constructor stub
	}
	public void showCar() {
		System.out.println("Æ·ÅÆ£º"+getBrand()+" ÑÕÉ«"+getColor()+" ×ùÎ»"+getSeats());
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
	
}
