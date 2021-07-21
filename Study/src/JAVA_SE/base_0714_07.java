package JAVA_SE;

public class base_0714_07 {
    /*
    方法的重载：
    方法重载指同一个类中定义的多个方法之间的关系，满足下列条件的多个方法相互构成重载。
    多个方法在同一个类中
    多个方法具有相同的方法名
    多个方法的参数不相同，参数类型不同或者参数的数量不同
    和返回值类型无关
     */
    public static void fn(int a){
        System.out.println("a"+a);
    }
    public static void fn(double b){
        System.out.println("b"+b);
    }
    public static void fn(char a,double b){
        System.out.println("a,b"+a+" "+b);
    }

    public static void main(String[]args){
        fn(90);
        fn(52.36);
        fn('c',52.36);
    }
}
