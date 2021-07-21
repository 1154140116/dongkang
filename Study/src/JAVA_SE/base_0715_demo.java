package JAVA_SE;

public class base_0715_demo {
    public static void main(String[] args){
        base_0715_09 d=new base_0715_09();

        //使用成员变量
        System.out.println(d.brand); //string的默认值是null
        System.out.println(d.price); // int 的初始值为0
        d.brand="dddd";
        d.price=25;
        d.sendMessage();
        d.call();
        System.out.println(d.brand);
        System.out.println(d.price);
        /*
        成员变量和局部变量的区别：
        类中位置不同：成员变量（类中方法外）局部变量（方法内部或方法声明上）
        内存中位置不同：成员变量（堆内存）局部变量（栈内存）
        生命周期不同：成员变量（随着对象的存在而存在，随着对象的消失而消失）局部变量（随着方法的调用而
        存在，醉着方法的调用完毕而消失）
        初始化值不同：成员变量（有默认初始化值）局部变量（没有默认初始化值，必须先定义，赋值才能使用）
         */

        //对private修饰的变量，调用
    d.getAge();
    d.setAge(20);


        String Na=d.Nam("ddd");
        System.out.println(Na);
    }


}
