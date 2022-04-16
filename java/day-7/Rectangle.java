
public class Rectangle {
	double width;
	double height;
	
	public double Perimeter() {
		return 2*(width+height);

	}
	public double Area() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle rectangle =new Rectangle();
		rectangle.width=9.9;
		rectangle.height=9.9;
		
		System.out.println("Ãæ»ýÊÇ£º"+rectangle.Area());
		System.out.println("ÖÜ³¤ÊÇ£º"+rectangle.Perimeter());
	}
}
