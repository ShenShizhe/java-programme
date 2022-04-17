# algorithm
## 算法与数据结构

#### [位运算](https://github.com/ShenShizhe/java-programme/blob/main/java/algorithm/Bit-operation.java)
```
    public static void print(int num) {
      for (int i = 31; i >= 0; i--) 
        System.out.print( (num & (1<<i)) == 0 ? "0":"1");			
      System.out.println();
    }
```
