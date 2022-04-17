public class Bit_operation {
	public static void print(int num) {
		for (int i = 31; i >= 0; i--) 
			System.out.print( (num & (1<<i)) == 0 ? "0":"1");			
		System.out.println();
	}	
	public static void main(String[] args) {
		int num = 1234567;
		print(num);
	}
}
