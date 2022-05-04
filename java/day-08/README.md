# day-8
## 封装和构造方法
#### [Student](https://github.com/ShenShizhe/java-programme/blob/main/java/day-08/Student.java)
- [Test](https://github.com/ShenShizhe/java-programme/blob/main/java/day-08/Test.java)
- 封装；外部不能访问私有的的属性
- 这是类的独特写法之一
- 关键词：private
- 如何给age属性赋值
  - 方法：setAge、getAge
- 构造方法的作用：
   - 初始化对象，简化代码
      - 特点1 ：方法名和类名完全相同，且没有返回值
      - 特点2:构造方法可以有多个
      - 特点3：new 对象的时候，参数必须与构造方法一致
#### [Person](https://github.com/ShenShizhe/java-programme/blob/main/java/day-08/Person.java)  
- 设计一个Person类，类中包含姓名，年龄，家庭住址。将属性设置为私有成员变量，并设置getter/setter方法，在主函数中初始化对象并赋值输出(以自己的个人信息为例)
#### [Phone](https://github.com/ShenShizhe/java-programme/blob/main/java/day-08/Phone.java)
- 定义一个手机类Phone，包含：
	- 属性:
		- 品牌brand
		- 价格price
	- 行为:
		- 打电话call()
		- 发短信sendMessage()
		- 玩游戏playGame()
		
	- 要求:
		1. 按照以上要求定义类,属性要私有,有参数构造方法，setter和getter方法
		2. 定义测试类,在main方法中创建该类的三个对象并给属性赋值。
		3. 调用三个成员方法,打印格式如下:
			> 正在使用价格为2398元的小米9手机打电话....
			>> 正在使用价格为1598元的小米8手机发短信....
			>>> 正在使用价格为998元的红米手机玩游戏..
#### [Light](https://github.com/ShenShizhe/java-programme/blob/main/java/day-08/Light.java)
- 编写一个Light类，该类是对灯的描述，该类拥有：
1. 2个成员变量
	- Watts（私有，整型）//用于存放灯的瓦数
	- Indicator（私有，布尔类型）//存放灯的开或关状态
2. 2个构造方法
	- Light（int watts）//创建具有watts瓦的对象
	- Light（int watts,boolean indicator）
3. 3个成员方法
	- public void switchOn()		//开灯，将灯的状态置为开
	- public void switchOff()		//关灯
4. public void printInfo()		//输出灯的瓦数信息和开关状态
#### [Box](https://github.com/ShenShizhe/java-programme/blob/main/java/day-08/Box.java)
- 设计一个立方体类Box，定义三个属性，分别是长，宽，高。定义二个方法，分别计算并输出立方体的体积和表面积，要求用到构造方法和getter/setter方法
#### [MyTime](https://github.com/ShenShizhe/java-programme/blob/main/java/day-08/MyTime.java)
- 定义一个名为MyTime的类，其中应有三个整型成员：时（hour），分（minute），秒（second），为了保证数据的安全性，这三个成员变量应声明为私有
- 为MyTime类定义构造方法，以方便创建对象时初始化成员变量。定义convert()方法，对时间进行转化，例如：
	- 70秒应变为1分10秒、150分钟应变为2小时30分钟
	- 定义display()方法，对时间进行格式转化，例如：2：2：2转化为
		- 以如下的形式输出02：02：02


