
public class Cylinder implements C {
	
	
	private double radius;
	private double height;
	private String color;
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return radius*radius*PI;
	}
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
		
	}
	@Override
	public void volume() {
		// TODO Auto-generated method stub
		double volume = height * area();
		System.out.println("体积为："+volume+"颜色是"+color);
	}
	
	
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder();
		cylinder.radius = 5;
		cylinder.height = 10;
		cylinder.setColor("白色");
		cylinder.volume();			
	}					
}
