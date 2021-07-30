package JAVA_SE_TWO;
/*
抽象类：
    成员的特点
        成员变量：既可以是变量 也可以是常量
        构造方法：空参构造 有参构造
        成员方法：抽象方法 普通方法
 */
public class demo_Abstract{
    public static void main(String [] args){
        anmail1 a=new Cat1();
        a.eat();
        a.show();

    }
}
 abstract class anmail1 {
    private  int age=20;
    private final  String city="北京";
    public anmail1(){

    }
    public anmail1(int age){
        this.age=age;
    }
    public void show(){
        age=40;
        System.out.println(age);
//        city="dongk"  final 修饰的变量不允许修改
        System.out.println(city);

    }
    public abstract void eat();  //抽象方法

}
class Cat1 extends anmail1{
     @Override
    public void eat(){
         System.out.println("猫吃鱼");
     }
}
//