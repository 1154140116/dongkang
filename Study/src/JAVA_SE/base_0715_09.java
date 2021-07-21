package JAVA_SE;

public class base_0715_09 {
    /*
    面向对象：object
    类：由属性和行为组成
    属性：在类中通过成员变量来体现（类中方法外的变量）
    行为：在类中通过成员方法来体现（和前面的方法相比去掉static关键字即可）
     */
    //成员变量
    String brand;
    int price;
    //成员方法
    public void call(){
        System.out.println("打电话");
        System.out.println(age);
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
    /*
    private是一个修饰符，可以用来修饰成员（成员变量，成员方法）
    被private修饰的成员，只能在本类进行访问，针对private修饰的成员变量，如果需要被其他类使用，提供相
    应的操作
    提供“get变量名()”方法，用于获取成员变量的值，方法用public修饰
    提供“set变量名(参数)”方法，用于设置成员变量的值，方法用public修饰
     */
    private int age=10; //只能在本类中被访问
    // 提供“set变量名(参数)”方法，用于设置成员变量的值，方法用public修饰
    public void setAge(int a) { if(a<0 || a>120) { System.out.println("你给的年龄有误"); } else { age = a; } }
    //提供“get变量名()”方法，用于获取成员变量的值，方法用public修饰
    public int getAge() { return age; }

   /*
    this 的用法：
    this修饰的变量用于指代成员变量，其主要作用是（区分局部变量和成员变量的重名问题）
        方法的形参如果与成员变量同名，不带this修饰的变量指的是形参，而不是成员变量
        方法的形参没有与成员变量同名，不带this修饰的变量指的是成员变量
     */
   private String name;
   public String Nam(String name){
        this.name=name;
        return name;
   }
/*
1. 封装概述 是面向对象三大特征之一（封装，继承，多态） 是面向对象编程语言对客观世界的模拟，客观世界
里成员变量都是隐藏在对象内部的，外界是无法直接操作的
2. 封装原则 将类的某些信息隐藏在类内部，不允许外部程序直接访问，而是通过该类提供的方法来实现对隐藏
信息的操作和访问 成员变量private，提供对应的getXxx()/setXxx()方法
3. 封装好处 通过方法来控制成员变量的操作，提高了代码的安全性 把代码用方法进行封装，提高了代码的复用
性
 */
}
