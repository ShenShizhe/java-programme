import java.util.Scanner;

public class Demo3 {

	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("请输入父亲的升高(cm)：");
		int fatherheight=in.nextInt();
		System.out.println("请输入母亲的升高(cm)：");
		int motherheight=in.nextInt();
		System.out.println("请输入小孩的性别W/M)：");
		char sex=in.next().charAt(0);
		System.out.println("请输入小孩是否喜欢体育锻炼(Y/N)：");
		char exercise=in.next().charAt(0);
		System.out.println("请输入小孩是否有良好的卫生习惯(Y/N)：");
		char habit=in.next().charAt(0);
		
		
		if(sex=='W'||sex=='w') {
			if(exercise=='Y'||exercise=='y'){
				if(habit=='Y'||habit=='y') {
					float height=(float) ((fatherheight*0.923+motherheight)/2);
					height=height*(float)(1+0.02+0.015);
					System.out.println("小孩身高为："+height+"cm");
				}else {
					float height=(float) ((fatherheight*0.923+motherheight)/2);
					height=height*(float)(1+0.02);
					System.out.println("小孩身高为："+height+"cm");
				}
			}else {
				if(habit=='Y'||habit=='y') {
					float height=(float) ((fatherheight*0.923+motherheight)/2);
					height=height*(float)(1+0.015);
					System.out.println("小孩身高为："+height+"cm");
				}else {
					float height=(float) ((fatherheight*0.923+motherheight)/2);
					System.out.println("小孩身高为："+height+"cm");
				}
				
			}
			
			
		}else if(sex=='M'||sex=='m'){
			if(exercise=='Y'){
				if(habit=='Y') {
					float height=(float) ((fatherheight+motherheight)*0.54);
					height=height*(float)(1+0.02+0.015);
					System.out.println("小孩身高为："+height+"cm");
				}else {
					float height=(float) ((fatherheight+motherheight)*0.54);
					height=height*(float)(1+0.02);
					System.out.println("小孩身高为："+height+"cm");
				}
			}else {
				if(habit=='Y') {
					float height=(float) ((fatherheight+motherheight)*0.54);
					height=height*(float)(1+0.015);
					System.out.println("小孩身高为："+height+"cm");
				}else {
					float height=(float) ((fatherheight+motherheight)*0.54);
					System.out.println("小孩身高为："+height+"cm");
				}
			}
			
		}else {
			System.out.println("您的入有误！！");
		}
		
	}
}
