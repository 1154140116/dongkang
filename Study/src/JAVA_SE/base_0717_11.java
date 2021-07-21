package JAVA_SE;

public class base_0717_11 {
    /*
    1.String 类代表字符串，Java 程序中的所有字符串文字（例如“abc”）都被实现为此类的实例。也就是说，Java 程序
中所有的双引号字符串，都是 String 类的对象。String 类在 java.lang 包下，所以使用的时候不需要导包！
    2.字符串不可变，它们的值在创建后不能被更改
      虽然 String 的值是不可变的，但是它们可以被共享
      字符串效果上相当于字符数组( char[] )，但是底层原理是字节数组( byte[] )

      方法名 说明
    public String() 创建一个空白字符串对象，不含有任何内容
    public String(char[] chs) 根据字符数组的内容，来创建字符串对象
    public String(byte[] bys) 根据字节数组的内容，来创建字符串对象
    String s = “abc”; 直接赋值的方式创建字符串对象，内容就是abc
     */
    public static void main(String[] args){
        //public String()：创建一个空白字符串对象，不含有任何内容
        String st=new String();
        System.out.println("s1"+st);
        //public String(char[] chs)：根据字符数组的内容，来创建字符串对象
        char[] chs={'a','f','e'};
        String st2=new String(chs);
        System.out.println("st2:"+st2);
        //public String(byte[] bys)：根据字节数组的内容，来创建字符串对象
        byte[] chs2={52,54,65};
        String st3=new String(chs2);
        System.out.println("st3:"+st3);
        //String s = “abc”; 直接赋值的方式创建字符串对象，内容就是abc
        String s4 = "abc";
        System.out.println("s4:" + s4);

        //字符串的比较
        /*
        1.==号的作用
           比较基本数据类型：比较的是具体的值
           比较引用数据类型：比较的是对象地址值
        2. equals方法的作用
            public boolean equals(String s) 比较两个字符串内容是否相同、区分大小写
         */
        char[] chj={'a','b','f'};
        //构造方法的方式得到对象
        String s1 = new String(chj);
        String s2 = new String(chj);
        //直接赋值的方式得到对象
        String s8 = "abc";
        String s9 = "abc";
        //比较字符串对象地址是否相同
         System.out.println(s1 == s2); //false,每次创建都是新的地址
         System.out.println(s1 == s8); //false
         System.out.println(s8 == s9); //同一个对象，地址相同
         System.out.println("--------");
        //比较字符串内容是否相同
         System.out.println(s1.equals(s2)); //内容相同
         System.out.println(s1.equals(s8)); //内容不同
         System.out.println(s8.equals(s9)); //内容相同

    }
}
