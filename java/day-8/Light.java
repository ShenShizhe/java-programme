public class Light {
	private  int watts;
	private boolean indicator;
	
	
	
	public int getWatts() {
		return watts;
	}
	public void setWatts(int watts) {
		this.watts = watts;
	}
	public boolean isIndicator() {
		return indicator;
	}
	public void setIndicator(boolean indicator) {
		this.indicator = indicator;
	}

	public Light(int watts, boolean indicator) {
		super();
		this.watts = watts;
		this.indicator = indicator;
	}
	//开灯，将灯的状态置为开
	public void switchOn() {
		this.indicator = true;
	}
	//关灯
	public void switchOff() {
		this.indicator = false;
	}
	//输出灯的瓦数信息和开关状态
	public void printInfo() {
		System.out.println("瓦数"+watts+",灯的状态："+indicator);
}
	public static void main(String[] args) {
//		Light p = new Light(12);
		
	}
}
 
