import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
	/*do{
	 * 循环操作
	 * }while(循环条件);
	 * 
	 * 选执行操作再判断
	 * */
	
	//先考试，再判断成绩是否合格！
//		Scanner in=new Scanner(System.in);
//		int score=0;
//		do {
//			System.out.println("请输入考试成绩：");
//			score=in.nextInt();
//		}while(score<60);
//		System.out.println("人才啊！居然通过了！！");
	
		//随机产生1……100的随机数，用户输入数据来猜，系统给出提示(大了，小了)，最后统计次数
		Scanner in=new Scanner(System.in);
		int n=(int)(Math.random()*100+1);//1……100的随机数
		int num=0,count=0;//计数器
		do {
			count++;
			System.out.println("请输入你认为对的数：");
			num=in.nextInt();
			if(num>n) {
				System.out.println("喂喂喂！！这么大的吗？？");
			}else if(num<n) {
				System.out.println("什么玩意？我有这么小？？");
			}
		}while(num!=n);
		System.out.println("17张牌！你能猜对???真有你的，居然猜了"+count+"次，厉害啊！！");
	}	
}
