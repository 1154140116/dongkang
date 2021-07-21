package JAVA_SE;
import java.util.Scanner;
public class base_0714_08 {
    /*
    练习debug模式，对代码的调试:
step into：单步执行，遇到子函数就进入并且继续单步执行（简而言之，进入子函数）；

step over：在单步执行时，在函数内遇到子函数时不会进入子函数内单步执行，而是将子函数整个执行完再停止，也就是把子函数整个作为一步。有一点,经过我们简单的调试,在不存在子函数的情况下是和step into效果一样的（简而言之，越过子函数，但子函数会执行）。

step out：当单步执行到子函数内时，用step out就可以执行完子函数余下部分，并返回到上一层函数。
     */
    public static void main(String[] args){
//        int a=90;
//        int b=89;
//        int sum=a+b;
//        System.out.println(sum);
        //联系if else
//        Scanner scan=new Scanner(System.in);
//        System.out.println("请输入一个星期");
//        int week=scan.nextInt();
//        if(week==1){
//            System.out.println("跑步");
//        }else if(week==2){
//            System.out.println("钓鱼");
//        }else if(week==3){
//            System.out.println("吃饭");
//        }else if(week==4){
//            System.out.println("打牌");
//        }else if(week==5){
//            System.out.println("拳击");
//        }else{
//            System.out.println("输入错误");
//        }
        //联系switch
        Scanner scan=new Scanner(System.in);
        int dd=scan.nextInt();
        switch(dd){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("无法五天");

        }
    }
}
