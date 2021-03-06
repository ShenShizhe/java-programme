# day-7

## 类和对象
#### [Student](https://github.com/ShenShizhe/java-programme/blob/main/java/day-07/Student.java)

- 类是描述现实中的学生，任何类都具有的属性和方法
- 属性：类的固有特性，例如：学号、姓名、班级
- 方法：类的行为，例如：自我介绍
- 类是抽象的模板，对象是具体的实现

# 
- 创建类方法：
```
	修饰符 class 类名{
	成员
	};
```
```
	1. class——关键词，必须有
        2. 修饰符是可选的，有public（公共）或不加 
        3. 类名——首字母大写，且按驼峰命名规则起名，必须有
        4. 成员——有成员属性和成员方法
```
# 
- 成员属性定义:
```
	[ public | private | protected ]　[ static ]　[ final ]　类型　成员名
```
```
      1. 类型和成员名是必须的，其他都是可选项
      2. public　公共成员——不同包也可访问
      3. private　私有成员——只能在本类中访问
      4. protected　保护成员——同包及子类可访问
      5. 上面三个都不加　　默认——同包可访问
      6. static　静态成员——属于类的，它不属于具体的对象，该类的所有对象共享该成员
      7. 所有不是static的对象的对象都要实例化才能访问
      8. Static成员或方法直接通过类名访问（通过：[ 类名. ]引用）
      9. final 成员——最终成员，其值不能被改变
      10. final 类——最终类，不能被继承
      11. final 方法——最终方法，该方法不能被重写
      12. 注意：final和public可以加载类上面，而static不能
```
#
- 成员方法定义
```
	[public|private|protected] [static] [final] 类型 方法名（参数列表）{
	方法体；
	return表达式；
      };
```
```
      1. 类型（首字母大写）(必须)：指返回值的类型（既可以是基本类型，也可以是对象类型）
      2. 方法名 (必须)：做什么
      3. 法体：定义了方法的具体内容，通常起到两个作用：
		一是围绕类的属性进行各种操作
		二是与其他的类与对象进行数据交流、消息传递的操作
      4. 形参(可选)：只有两种类型：基本类型和对象类型。方法调用中参数用来传递数值、传递引用同时方法还可以嵌套、递归调用
      5. return除了能返回值，还可以结束此方法体，值得注意的是：方法体中如果指定了非void的返回类型
      		方法中就必须包含一条return语句保证任何情况下都有返回数值
      6. return语句后面不能跟任何表达式
      7. 访问修饰符:[public|private|protected]
      8. 返回值类型:[static] [final]
```
- 方法调用
 ```
	对象.方法名(参数);
```
- 注意：
```
      1. 在一个方法中定义另一个方法将产生语法错误（方法不能嵌套定义，类可以）
      		最好避免局部变量”屏蔽“实例(成员)变量，在一个类中不使用同名标识符就可以做到这一点
      2. 若同名了成员变量被屏蔽，此时又要访问成员变量，可用this.成员变量
```

- 关于局部变量与实例变量：
```
　　　1. 局部变量：在方法中声明或定义的变量，当此方法被调用时创建变量，当此方法执行完时变量被释放
　　　2. 在所有方法之外但在类体中声明或定义的变量，有效范围是整个类
　　　3. 屏蔽不是覆盖
```
#
 - 创建对象方法：
```
	类名 对象 =new 类名 ();
```
#### [Book](https://github.com/ShenShizhe/java-programme/blob/main/java/day-07/Book.java)
- 创建一个书籍类Book，添加属性书名、作者和价格，添加介绍书方法Introduce()，输出书名、作者和价格
	- 添加卖书的方法sellBook(int n)，规定买10本书以下不打折，买大于等于10本书打9折，买超过20本书打8折
	- 最后在main()中实例化一个Book对象，并调用两个方法分别介绍书籍和购买书籍
#### [Rectangle](https://github.com/ShenShizhe/java-programme/blob/main/java/day-07/Rectangle.java)
- 创建Rectangle类，添加属性width、height；
	- 在Rectangle类中添加两种方法计算矩形的周长和面积(均使用有返回值无参的方法)；
	- 最后在main()中实例化一个Rectangle对象，并调用两个方式计算一个矩形的周长和面积
#### [Vehicle](https://github.com/ShenShizhe/java-programme/blob/main/java/day-07/Vehicle.java)
- 请定义一个交通工具(Vehicle)的类，其中有: 
	- 属性：速度(speed) 
	- 方法:设置速度setSpeed(int speed)，加速speedUp(),减速speedDown()等等. 其中加速使速度+10，减速使速度-15。
		- 最后在main()中实例化一个交通工具对象，并通过方法给它初始化speed的值，然后各进行1次加速和减速，并打印出最终的速度
#### [Caculator](https://github.com/ShenShizhe/java-programme/blob/main/java/day-07/Caculator.java)
- 新建一个类Caculator,这个类包含常见的加、减、乘、除运算
	- 要求分别写四个方法，完成这四种运算。
	- 在主函数中，输入两个数字，以及操作符号，根据符号进行计算
#### [Function](https://github.com/ShenShizhe/java-programme/blob/main/java/day-07/Function.java)
- 新建一个类function,用于求一元二次方程ax2+bx+c=0的根
	- 该类中包含一个方法root(int a,int b,int c)
	- 一元二次方程的求根公式为:x=(-b±√(b^2-4ac))/2a

