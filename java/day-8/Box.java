
public class Box {
	private  double length;
	private  double width;
	private  double height;	
	
	public Box(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double Volume() {
		return length*width*height;
	}
	
	public double Area() {
		return (length*width+width*height+length*height)*2;
	}
	
	public static void main(String[] args) {
		Box box = new Box(12,23,43);
		System.out.println("Ìå»ýÊÇ£º"+box.Volume());
		
		System.out.println("±íÃæ»ýÊÇ£º"+box.Area());


	}
}
