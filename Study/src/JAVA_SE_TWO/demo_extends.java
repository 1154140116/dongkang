package JAVA_SE_TWO;
//继承:是面向对象三大特征之一，可以使得子类具有父类的属性和方法，还可以在子类中重新定义，以及 追加属性和方法
//继承的格式:    class Dog extends Animal { }
/*
继承好处:提高了代码的复用性(多个类相同的成员可以放到同一个类中) 提高了代码的维护性(如果方法的代码需要修改，修改一处即可)
继承弊端: 继承让类与类之间产生了关系，类的耦合性增强了，当父类发生变化时子类实现也不得不跟着变化，削 弱了子类的独立性
继承的应用场景: 使用继承，需要考虑类与类之间是否存在is..a的关系，不能盲目使用继承 is..a的关系：谁是谁的一种，例如：老师和学生是人的一种，那人就是父类，学生和老师就是子类
 */
/*
继承中变量的访问特点：
    1. 子类局部范围找
    2. 子类成员范围找
    3. 父类成员范围找
    4. 如果都没有就报错(不考虑父亲的父亲…)
 */
/*
this&super关键字：
    this：代表本类对象的引用
    super：代表父类存储空间的标识(可以理解为父类对象引用)
this和super的使用分别 成员变量：
    this.成员变量 - 访问本类成员变量
    super.成员变量 - 访问父类成员变量
成员方法：
    this.成员方法 - 访问本类成员方法
    super.成员方法 - 访问父类成员方法
构造方法：
    this(…) - 访问本类构造方法
    super(…) - 访问父类构造方法
 */
/*
继承中构造方法的访问特定：
    注意：子类中所有的构造方法默认都会访问父类中无参的构造方法 。
    子类会继承父类中的数据，可能还会使用父类的数据。所以，子类初始化之前，一定要先完成父类数据的初始化， 原因在于，每一个子类构造方法的第一条语句默认都是：super()
 */
public class demo_extends {
    public static void main(String[] args){
        zi d=new zi();
        d.method();
    }
}
/*
方法重写的注意事项
1. 私有方法不能被重写(父类私有成员子类是不能继承的)
2. 子类方法访问权限不能更低(public > 默认 > 私有)
 */

class FU{
    int num=10;
    private void show(){
        System.out.println("FU中show()方法被调用");
    }
    void method(){
        System.out.println("fu中method()方法被调用");
    }
}
/*
方法的重写：
    1、方法重写概念
    子类出现了和父类中一模一样的方法声明（方法名一样，参数列表也必须一样）
    2、方法重写的应用场景
    当子类需要父类的功能，而功能主体子类有自己特有内容时，可以重写父类中的方法，这样，即沿袭了 父类的功能，又定义了子类特有的内容
    3、Override注解
    用来检测当前的方法，是否是重写的方法，起到【校验】的作用
 */
class zi extends FU{
    int num=20;
//    @Override //* 编译【出错】，子类不能重写父类私有的方法*/
//    public void show(){
//        int num=30;
//        System.out.println(num);
//    }
/* 编译【出错】，子类重写父类方法的时候，访问权限需要大于等于父类 */
//@Override
//    private void method(){
//    System.out.println("Zi中show()方法被调用");
//}
    @Override
    public void method(){
        System.out.println("Zi中method()方法被调用");
    }
}

/*
Java中继承的注意事项
1. Java中类只支持单继承，不支持多继承 错误范例：class A extends B, C { }
2. Java中类支持多层继承   Class a extends b   ;Class c  extends a

 */