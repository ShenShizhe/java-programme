
public class demo6 {
	public static void main(String[] args) {
		char c='A';
		for (int i = 0; i <=5; i++) {
			for (int j = 5; j >i; j--) {
				System.out.print((char)(c+(5-j)));
				
			}
			System.out.println();
		}
		
	}
}
