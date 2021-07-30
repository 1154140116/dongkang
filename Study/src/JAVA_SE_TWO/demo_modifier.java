package JAVA_SE_TWO;
/* package
1、包的概念 包就是文件夹，用来管理类文件的
2、包的定义格式 package 包名; (多级包用.分开) 例如：package com.heima.demo;
 */
/* import
    1. 使用不同包下的类时，使用的时候要写类的全路径，写起来太麻烦了 为了简化带包的操作，Java就提供了导包的功能
    导包的格式:
    格式：import 包名; 范例：import java.util.Scanner;
 */
/*   final
    fianl关键字的作用
     final代表最终的意思，可以修饰成员方法，成员变量，类
     final修饰类、方法、变量的效果
     fianl修饰类：该类不能被继承（不能有子类，但是可以有父类）
     final修饰方法：该方法不能被重写
     final修饰变量：表明该变量是一个常量，不能再次赋值
 */
/*
static的概念
static关键字是静态的意思，可以修饰【成员方法】，【成员变量】
static修饰的特点
1. 被类的所有对象共享，这也是我们判断是否使用静态关键字的条件
2. 可以通过类名调用当然，也可以通过对象名调用【推荐使用类名调用】


static的访问特点
  非静态的成员方法  (静态的牛逼，谁都可以访问)
    能访问静态的成员变量
    能访问非静态的成员变量
    能访问静态的成员方法
    能访问非静态的成员方法
  静态的成员方法:
    能访问静态的成员变量
    能访问静态的成员方法

    总结成一句话就是： 静态成员方法只能访问静态成员
 */
public class demo_modifier {
    public static void main(String[] args){
        // 为对象的共享数据赋值
        Stu.university="传至大学"; //这个变量是公共变量
        Stu s=new Stu();
        s.age=29;
        s.name="dongkang";
        s.show();
        //创建新对象
        Stu s1=new Stu();
        s1.name = "风清扬";
        s1.age = 33;
        s1.show();
    }


}
class Stu{
    public String name;
    public int age;
    public static String university; //学校 共享数据！所以设计为静态！
    public void show(){
        System.out.println(name + "," + age + "," + university);
    }
}