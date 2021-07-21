package JAVA_SE;
/*
运算符：
    1.算数运算符：+- * / ,%s
 */
public class base_0709_01 {
    public static void main(String[] args){
        int a=9;
        int  b =4;
        System.out.println(a/b); //整数相除只能取整
        float c  = a/b;
        System.out.println(c); //整数相除只能取整2.0

        /*
        字符的 + 操作,单个才是字符，多个是字符串
    A=65, a=97  0=48
         */
        char d= 'R';
        System.out.println(c+d);
    //char --int --long--float--double
        int f= a+d;
        System.out.println(f);

    /*
    字符串的 + 操作  ;字符串参与+的操作，实现为字符串的拼接
     */
        String e ="dong";
        String q="kang";
        System.out.println(e+q+";"+a);
        System.out.println("dong"+8+90); //dong890
        System.out.println(8+90+"dong"); //98dong
        /*
        赋值运算符：
        =  +=  -=  /= *=  %=
         */
        System.out.println(a);
       a+=a;
       System.out.println(a); //18

       /*
       ++ ,--, 自加自减运算符
        */
        System.out.println(a++); //18
        System.out.println(++a); //19
    }
}
