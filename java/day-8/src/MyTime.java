public class MyTime {
	private  int hour;
	private  int minute;
	private  int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public MyTime(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void convert() {
		//秒转分钟
		minute += second / 60;
		second = second % 60;
		//分钟转小时
		hour += minute / 60;
		minute += minute % 60;
	}
	
	public void display() {
		String h = hour + "";
		String m = minute + "";
		String s = second + "";
		
		if(hour < 10)
			h = "0" + h;
		if(minute < 10)
			m = "0" + m;
		if(second < 10)
			s = "0" + s;
		
		System.out.println(h+":"+m+":"+s);
	}
	
	public static void main(String[] args) {
		MyTime mytime = new MyTime(8,52,70);
//		mytime.display();
		mytime.convert();
	}
}
