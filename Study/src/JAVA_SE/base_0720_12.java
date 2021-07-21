package JAVA_SE;
import java.util.Scanner;
public class base_0720_12 {
    public static void main(String[] args){
        String username="dongkang";
        String password="3010@iong";
        Scanner scan=new Scanner(System.in);
        for( int i=1;i<=3;i++){
            System.out.println("请输入用户：");
            String un=scan.next();
            System.out.println("请输入密码：");
            String pw=scan.next();
            if(un.equals(username)&&pw.equals(password)){
                System.out.println("密码正常，欢迎登录！");
                    break;
            }else{
                System.out.println("密码错误，请重试！错误次数："+i+"还剩下："+(3-i));
            }
        }
    }
}
