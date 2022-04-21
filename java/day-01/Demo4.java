public class Demo4 {
	
	public static void main(String[] args) {
		
		boolean year=1900%400==0 || (1900%4==0)&&1900%100!=0;
		
		System.out.println(year);
	}
}
