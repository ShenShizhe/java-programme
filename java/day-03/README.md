# day-3
## 多重if

#### [Demo0](https://github.com/ShenShizhe/java-programme/blob/main/java/day-03/Demo0.java)
- switchd的使用
#### [Demo1](https://github.com/ShenShizhe/java-programme/blob/main/java/day-03/Demo1.java)
1. 从键盘输入1-7天，已知1-5是工作日，6-7是休息日
2. 根据输入输出工作或者休息
   
#### [Demo2](https://github.com/ShenShizhe/java-programme/blob/main/java/day-03/Demo2.java)
- 从键盘输入学生成绩，利用计算机将学生成绩划分出等级并输出：
   - 90~100为A
   - 80~90为B
   - 70~80为C
   - 60~70为D
   - 60以下为E
#### [Demo3](https://github.com/ShenShizhe/java-programme/blob/main/java/day-03/Demo3.java)
- 编写程序计算身高：每个做父母的都关心自己孩子成人后的身高，小孩成人后身高与其父母身高和自身性别密切相关
   - 身高预测公式为：  
      - 男性成人时身高 = (父亲身高 + 母亲身高) * 0.54
      - 女性成人时身高 = (父亲身高* 0.923 +母亲身高) / 2
      - 此外，如果喜爱体育锻炼，那么可增加身高2%，如果有良好的卫生饮食习惯，那么可增加身高1.5%
 
- 程序要求：父亲的身高与母亲的身高、小孩的性别、是否喜爱体育锻炼和是否有良好的卫生饮食习惯也从键盘上输入，最终输出预测的身高

#### [Demo4](https://github.com/ShenShizhe/java-programme/blob/main/java/day-03/Demo4.java)
- 计算数学表达式
   - 输入一个数，如果小于1
      - 直接输出
   - 如果大于1，小于10
      - 则输出三倍减去2后的值
   - 否则
      - 输出四倍该数的值
```

		if(value<1) {
			System.out.println("Y的值为："+value);
		}
		else if(1<=value&&value<10){
			value=3*value-2;
			System.out.println("Y的值为："+value);
		}
		else{
			value=4*value;
			System.out.println("Y的值为："+value);
		}
```
#### [Demo5](https://github.com/ShenShizhe/java-programme/blob/main/java/day-03/Demo5.java)
- 循环的操作
#### [Demo6](https://github.com/ShenShizhe/java-programme/blob/main/java/day-03/Demo6.java)
- 随机产生200个三位的正整数，按每行10个数输出
- 统计其中的偶数和奇数
- 计算出现偶数和奇数的概率

```		
		//随机数Math.random()产生0-1的随机数			
		//System.err.println(Math.random());
```
#### [Demo7](https://github.com/ShenShizhe/java-programme/blob/main/java/day-03/Demo7.java)
- 学生管理（continue）
