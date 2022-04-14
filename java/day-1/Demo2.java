public class Demo2 {
	public static void main(String[] args) {
		int chinese=90;
		int math=80;
		System.out.println("成绩交换前为：");
		System.out.println("语文成绩："+chinese);
		System.out.println("数学成绩："+math);
    
		int temp=chinese;
		chinese=math;
		math=temp;
    
		System.out.println("成绩交换后为：");
		System.out.println("语文成绩："+chinese);
		System.out.println("数学成绩："+math);	
	}
}
