public class Demo5 {
	public static void main(String[] args) {
		
		int time=123456;
		int hour,minute,second;
		hour=time/(60*60);
		minute=time%(60*60)/60;
		second=time%60;
		
		System.out.println("123456秒是："+hour+"小时"+minute+"分钟"+second+"秒");
	}
}
