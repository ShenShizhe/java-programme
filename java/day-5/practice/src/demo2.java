
public class demo2 {
	public static void main(String[] args) {
		//有一个箱子里面有红黄蓝各有4个，现在从箱子里面抓8个球，有多少中组合方式
		//红x,黄y,蓝z
		int count=0;
		for(int x=0;x<=4;x++) {
			for(int y=0;y<=4;y++) {
				for(int z=0;z<=4;z++) {
					if(x+y+z==8) {
//						System.out.println("红色："+x+"\t"+"黄色："+y+"\t"+"红色："+z);
						count++;
					}
				}
			}		
		}		
		System.out.println(count);
	}
}
