package JAVA_SE;
import  java.util.Scanner;
import java.util.Random;
/*
    switch  case

 */
public class base_0712_04 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.print("请输入一个月份：");
        int a =scan.nextInt();
        switch(a){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("宁输入的月份有误");

        }
        /*
        for 循环，求1到100的值
         */
        int count=0;
        for(int b=1;b<=100;b++){
            count=count+b;
        }
        System.out.println("count:"+count);
        /*
        while 的用法：
         */
    int b=1;
    int sum=0;
    while(b<=100){
        sum=sum+b;
        b++;
    }
        System.out.println("sum:"+sum);

    /*
    do{
    }while
     */
    int c=1;
    int su=0;
    do{
        su=su+c;
        c++;
    }while(c<=100);
        System.out.println("su:"+su);
//        死循环（无限循环）的三种格式
//        1. for(;;){}
//        2. while(true){}
//        3. do {} while(true);
//        跳转控制语句（break）
//        跳出循环，结束循环
//        跳转控制语句（continue）
//        跳过本次循环，继续下次循环
//        注意： continue只能在循环中进行使用

        /*
        菜蔬据0-9
         */

    Random ra=new Random();
    int x =ra.nextInt(10);
        System.out.println("输入10以内的数");
        while(true){
            int i=scan.nextInt();
            if(x<i){
                System.out.println("你猜大了");
            }else if(x>i){
                System.out.println("你猜小了");
            }else{
                System.out.println("对了");
                break;
            }
        }
    }
}
