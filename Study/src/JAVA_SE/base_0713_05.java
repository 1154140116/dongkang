package JAVA_SE;

public class base_0713_05 {
    /*
    数组就是存储数据长度固定的容器，存储多个数据的数据类型要一致
     */
    public static void main(String[] args){
        //数组定义：数据类型[] 数组名
//        int [] arr;
//        double[] arr1;
//        char[] arr2;
        //数组定义2：数据类型 数组名[]
//        int arr[];
//        double arr1[];
//        char arr2[];
//    数据的定义和初始化
        int[] arr=new int[3];
        System.out.println(arr);//输出数组名
        System.out.println(arr[0]); //如果没有赋值的，默认 为0
        System.out.println(arr[1]); //如果没有赋值的，默认 为0
        System.out.println(arr[2]); //如果没有赋值的，默认 为0
//静态初始化数组  1：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,...}; 2：数据类型[] 数组名 = {元素1,元素2,...};
        int[] dong={1,2,3,52};
        for(int i=0;i<4;i++){
            System.out.println(dong[i]);
        }
        //索引越界异常
//        System.out.println(dong[4]);
        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
	at JAVA_SE.base_0713_05.main(base_0713_05.java:28)
         */
    int[] kang={21,52,22,56,34};
//    kang=null;
//        System.out.println(kang[1]);
        /*
        Exception in thread "main" java.lang.NullPointerException
	at JAVA_SE.base_0713_05.main(base_0713_05.java:35)
         */
        int max=kang[0];
    for(int i=1;i<kang.length;i++){
        if(kang[i]>=max){
            max=kang[i];
        }
    }
        System.out.println("最大值："+max);
    }
}
