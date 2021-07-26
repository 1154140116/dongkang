package JAVA_SE_TWO;
/*
练习继承：
需求：定义老师类和学生类，然后写代码测试；最后找到老师类和学生类当中的共性内容，抽取出一个父 类，用继承的方式改写代码，并进行测试
 */

public class demo_extend2 {
    public static void main(String[] args){
        //创建老师类对象
        Teacher t=new Teacher();
        t.setAge(23);
        t.setName("董康");
        System.out.println("姓名："+t.getName()+"\n"+"年龄："+t.getAge());
        t.teach();
        //新建对象t2
        System.out.println("==================== =================-");
        Teacher t1=new Teacher("风清扬",32);
        System.out.println("姓名："+t1.getName()+"\n"+"年龄："+t1.getAge());
        t1.teach();
        System.out.println("------------------------");
        //创建学生类对象
        Student s=new Student("王菲",25);
        System.out.println("姓名："+s.getName()+"\n"+"年龄："+s.getAge());
        s.study();
    }

}
class Person{
    private String name;
    private int age;
    public Person(){
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
class Teacher extends Person{
    public Teacher(){}
    public Teacher(String name,int age){
        super(name,age);
    }
    public void teach(){
        System.out.println("用爱成就每一位学生");
    }
}
class Student extends Person{
    public Student(){}
    public Student(String name,int age){
        super(name,age);
    }
    public void study(){
        System.out.println("学生学习");
    }
}

