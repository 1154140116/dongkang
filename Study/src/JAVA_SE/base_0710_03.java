package JAVA_SE;
import java.util.Scanner;
public class base_0710_03 {
    public static void main(String[] args){
        /* 输出的快捷建sout
        顺序结构
        分支结构(if, switch)
        循环结构(for, while, do…while)
         */
        System.out.println("开始");
        int a=90;
        int b=98;
        if (a==b){
            System.out.println("a与b相同");
        }
        if(a<b){
            System.out.println("a<b");
        }
        //if else
        if (a>b){
            System.out.println("a>");
        }else{
            System.out.println("a<=b");
        }

Scanner scan =new Scanner(System.in);
        System.out.println("请输入一个分数");
int score =scan.nextInt();
//if (score >=60){
//    System.out.println("及格分数为："+score);
//}else{
//    System.out.println("不及格分数为："+score);
//}
    if(score>100||score<0){
        System.out.println("你输入的分数有误");
    }else if (score>=85&&score<=100){
        System.out.println("优秀");
    }else if (score>=60&&score<85){
        System.out.println("凑合");
    }else if(score <60){
        System.out.println("不及格");
    }

    }
}
