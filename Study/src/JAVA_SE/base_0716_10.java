package JAVA_SE;

public class base_0716_10 {
    /*
    构造方法：
    格式：
    public class 类名{
    修饰符 类名( 参数 ) {
    }
    功能：主要是完成对象数据的初始化,在创建对象时就执行了构造方法。
     */
    /*
    1:构造方法的创建
    如果没有定义构造方法，系统将给出一个默认的无参数构造方法 如果定义了构造方法，系统将不再提供默认的构造
    方法
    2:构造方法的重载
    如果自定义了带参构造方法，还要使用无参数构造方法，就必须再写一个无参数构造方法
    3:推荐的使用方式
    无论是否使用，都手工书写无参数构造方法
    4:重要功能！
    可以使用带参构造，为成员变量进行初始化
     */
    private String name;
    private int age;
    //构造方法
    public base_0716_10(){
        System.out.println("无构造方法");
    }
    public base_0716_10(String name){
        this.name=name;
        System.out.println(name);
    }
    public base_0716_10(String name,int age)
    { this.name = name; this.age = age;
        System.out.println("name:"+name+" age:"+age);}
    public void show(){
        System.out.println(name+":"+age);
    }
}
