import java.util.Scanner;

//Scanner in =new Scanner(System.in);
public class Demo7 {
	public static void main(String[] args) {
		//定义一个Student，sNo(学号)、sName(姓名)、sSex(性别)、sAge(年龄)、sJava()成绩
		Scanner in=new Scanner(System.in);
		System.out.println("请输入该学生的学号、姓名：");
		String Sno=in.next(), sName=in.next();
		System.out.println("请输入该学生的性别：");
		char sSex=in.next().charAt(0);
		System.out.println("请输入该学生的年龄：");
		int sAge=in.nextInt();
		System.out.println("请输入该学生的成绩：");
		double sJava=in.nextDouble();
		
		
		
		
		
		
		System.out.println();
	}
}
