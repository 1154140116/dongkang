package JAVA_SE;

public class base_0709_02 {
    /*
    关系运算符：
    >,<, >= ,==,！= 等
     */
    public static void main(String[] args){
        int a=90;
        int b=92;
        System.out .println(a==b);  //false
        System.out .println(a!=b); //true
        System.out .println(a>b); //false
/*
逻辑运算符
&：逻辑与
| ：逻辑或
！： 逻辑非
^ : 异或

 */
        System.out .println((a==b)&(a<b)); //false & true =false
        System.out .println((a==b)|(a<b)); //false | true  =true
        System.out .println(!(a<b));  // true ! =false
        System.out .println((a==b)^(a<b)); //a^b，a和b结果不同为true，相同为false

        System.out .println("ddd");
/*
&& ：短路与  遇见false就不进行下面的了 （短路与&&，如果左边为真，右边执行；如果左边为假，右边不执行）
||  ：短路或  （如果左边为假，右边执行；如果左边为真，右边不执行。）
 */
        System.out .println((a==b)&&(a<b)); //false
/*
三元运算符：
关系表达式 ? 表达式1 : 表达式2;
判断结果为boolean型，为true时调用表达式1，为false时调用表达式2。其
逻辑为：如果条件表达式成立或者满足则执行表达式1，否则执行第二个。
 */
        int height1 = 150; int height2 = 210; int height3 = 165;
        int first =height1 >height2 ?height1:height2;
        System.out.println("first:"+first);
        int max= first>height3?first:height3;
        System.out.println("max:"+max);

    }
}
