package JAVA_SE;

public class base_0714_06 {
    /*
    方法：method
     */
    //无参方法
    public static void getMax(){
        int a=12;
        int b=21;
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    //带参方法
    public static void getMix(int a,int b){
        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
    //有返回值 public static int getMax(int a, int b) {  //不是void,改成int
    public static int getRe(int a,int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
    //方法的注意事项：1.方法不能嵌套 2.void表示无返回值，可以省略return，也可以单独的书写return，后面不加数据

public static void main(String[] args){
        getMax();//无参方法
        getMix(12,32);
        int a=9;
        int b=90;
        getMix(a,b);

        //带返回值方法定义和调用
    int re=getRe(90,87);
    System.out.println("min:"+re);

}
}
