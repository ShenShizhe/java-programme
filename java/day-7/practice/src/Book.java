public class Book{
	String name;
	String author;
	double price;	
	
	public void Introduce() {
		System.out.println("\t������"+this.name+"\t���ߣ�"+this.author+"\t�۸�"+this.price);
	}
	
	public double sellBook(int n) {
		double sum=0;
		if(n<10)
			sum=n*price;
		else if(n<20)
			sum=price*0.9;
		else
			sum=n*price*0.8;
		return sum;
	}
	public static void main(String[] args) {
		Book book=new Book();
		book.name="���¾Ž�";
		book.author="����";
		book.price=9.99;
		
		
		book.Introduce();
		
		double sum=book.sellBook(8);
		System.out.println("�鼮������"+sum+"Ԫ");
	}
	
}

