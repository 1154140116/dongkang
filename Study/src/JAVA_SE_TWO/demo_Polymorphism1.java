package JAVA_SE_TWO;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
  1.什么是多态:
      同一个对象，在不同时刻表现出来的不同形态
  2.多态的前提:
      2.1要有继承或实现关系
      2.2要有方法的重写
      2.3要有父类引用指向子类对象
  3.成员访问特点
      3.1 成员变量 编译看父类，运行看父类
      3.2 成员方法 编译看父类，运行看子类


 */
public class demo_Polymorphism1 {
    public static void main(String[] args){
        //有父类引用指向子类对象
        Animal a=new Cat();
        System.out.println(a.age); //编译看父类，父类里有所有可以点出来，允许时看父类
//        System.out.println(a.weight); 找不到weight 这个变量   父类没有所以编译时点不出来
        a.eat(); // 成员方法 编译看父类，运行看子类
//      a。playGame()  //父类没有点不出来
/*
特点：
    好处  提高程序的扩展性。定义方法时候，使用父类型作为参数，在使用的时候，使用具体的子类型参与操作
    弊端  不能使用子类的特有成员
 */
    }
}
 class Animal{
    public int age=40;
    public void eat(){
        System.out.println("动物吃东西");
    }
}
class Cat extends Animal{
    public int age = 20;
    public int weight = 10;
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void playGame() {
        System.out.println("猫捉迷藏");
    }
}