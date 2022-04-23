
public class Demo1 {
	public static void main(String[] args) {
		//现有1分2分5分的硬币若干，换为1元，有多少中方法
		//设1分2分5分硬币的数量分别为x、y、z
		//x[0,100],y[0,50],z[0,20]
		int count=0;
		for(int x=0;x<=100;x++) {
			for(int y=0;y<=50;y++) {
				for(int z=0;z<=20;z++) {
					if(x*1+y*2+z*5 == 100) {
						count++;
						//System.out.println("1分:"+x+"\t"+"2分:"+y+"\t"+"5分"+z);
						
					}
				}
			}
		}
		System.out.println(count);
	}
}
