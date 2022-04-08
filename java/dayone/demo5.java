public class demo5 {
	public static void main(String[] args) {
		
		int time=123456;
		int h,m,s;
		h=time/(60*60);
		m=time%(60*60)/60;
		s=time%60;
		
		System.out.println("123456秒是："+h+"小时"+m+"分钟"+s+"秒");
	}
}
