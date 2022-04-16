public class Vehicle {
	double speed;
	
	public void setSpeed(double speed) {			
		this.speed=speed;
	}
	
	public void speedUp() {
		this.speed+=10;
	}
	
	public void speedDown() {
		this.speed-=15;
	}
	
	public static void main(String[] args) {
		Vehicle vehicle =new Vehicle();
		
		vehicle.setSpeed(77.77);
		vehicle.speedUp();
		vehicle.speedDown();
		System.out.println("ÀŸ∂» «£∫"+vehicle.speed);
		
		
	}
	
}
