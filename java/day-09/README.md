# day-09
## 类的继承
#### 



继承
1.	定义一个Person类（属性有名字，年龄）,包含一个能输出各个属性值的方法showInfo（），定义一个Student类，学生类继承Person类。
要求：
（1）Person类的属性赋值用构造方法来实现
（2）声明Student类的对象，显示该学生的信息。


2.	创建名为交通工具（Vehicles）的父类，该类中有两个String类型的属性、商标（brand）和颜色(color)，该类中还包含一个行驶（run）的方法，该方法中输出汽车的品牌+“正在行驶”。并通过调用该类的showInfo方法在控制台显示汽车商标和颜色。通过该类的有参构造方法初始化其成员属性。
创建小汽车（Car）类继承Vehicles类，在该类中增加int型成员属性座位（seats）和showCar方法，该方法用于在控制台显示小汽车的信息
编写卡车（Truck）类继承Vehicles类，添加float型成员属性载重（load）和showTruck方法，该方法用于在控制台显示卡车的信息



1.编写一个学生类Student，该类成员包括学号no、姓名name、性别sex和年龄age，该类的成员方法有homework()做作业。为该类添加构造方法，要求有两种格式:
（1）包括no、name、sex和age四个参数。
（2）包括no和name两个参数。
2.编写一个大学生类Undergraduate，该类继承Student类中的所有属性和方法，为此类新添加一个电话号码成员变量telephone。添加一个成员方法showInfo(),输出自己的学号、姓名和电话号码。在主函数在初始化大学生类的对象并输出基本信息。
