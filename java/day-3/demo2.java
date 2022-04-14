import java.util.Scanner;

public class demo2 {

public static void main(String[] args) {
	
	
	Scanner in=new Scanner(System.in);
	System.out.println("请输入学生的成绩：");
	int score=in.nextInt();
	
	if(90<=score&&score<=100) {
		System.out.println("A");
	  }
  else if(80<=score&&score<90) {
		System.out.println("B");
	  }
  else if(70<=score&&score<80) {
		System.out.println("C");
	  }
  else if
    (60<=score&&score<70) {
		System.out.println("D");
	  }
  else if(score<60) {
		System.out.println("E");
	  }
  else {
		System.out.println("您的输入有误！！");
	  }	
  }
}
