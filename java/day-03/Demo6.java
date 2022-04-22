public class Demo6 {
	
	/*随机产生200个三位的正整数，按每行10个数输出
	 * 统计其中的偶数和奇数
	 * 计算出现偶数和奇数的概率
	 */
		
	
	public static void main(String[] args) {
		//随机数Math.random()产生0-1的随机数			
		//System.err.println(Math.random());
		int i=1;
		int oddnumber=0,evennumber=0;
		//oddnumberprobability=0,evennumberprobability=0;
		//oddnumber(奇数)、evennumber(偶数)、oddnumberprobabilit（奇数概率)、evennumberprobability(偶数概率)
		while(i<200) {
			String n=((int)(Math.random()*100000)+"").substring(0,3);
		int num=Integer.parseInt(n);
		System.out.println(num+" ");				
		//换行
		if(i%10==0)
			System.out.println();
		
		
		if(num%2==1)
			oddnumber++;
		else
			evennumber++;
		
		i++;
		
		}
//		oddnumberprobability=Math.round(oddnumber/200.0*100);
//		evennumberprobability=Math.round(evennumber/200.0*100)
		
		System.out.println("奇数有："+oddnumber+"个"+"出现的概率为："+Math.round(oddnumber/200.0*100)+"%");
		System.out.println("偶数有："+evennumber+"个"+"出现的概率为："+Math.round(evennumber/200.0*100)+"%");
		
	}
	
	
	
}
