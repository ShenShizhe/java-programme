public class Demo4 {
	public static void main(String[] args) {
	//操场上有学生排队（人数少于200），如果三个人一组则多1人，如果四个人一组则多2人，如果五个人一组则多3人，问共有多少人？
	int sum=0;
	do {
		if(sum%4==2&&sum%5==3&&sum%3==1) {
			System.out.println(sum);
		}
		sum++;
	}while(sum<200);
		
	}
}
