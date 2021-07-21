package JAVA_SE;

import java.util.ArrayList;
import java.util.Scanner;
public class StudentManager {
        public static void main(String[]  args) {
            //创建集合对象，用于保存学生数据
            ArrayList<Student> array = new ArrayList<Student>();
            while (true) {
                System.out.println("--------欢迎来到学生管理系统--------");
                System.out.print("1 添加学生"+"\t");
                System.out.print("2 删除学生"+"\t");
                System.out.print("3 修改学生"+"\t");
                System.out.print("4 查看所有学生"+"\t");
                System.out.print("5 退出");
                System.out.print("请输入你的选择：");
                Scanner scan = new Scanner(System.in);
                String line = scan.nextLine();
                //用switch语句完成操作的选择
                switch (line) {
                    case "1":
                        addStudent(array);
                        break;
                    case "2":
                        deleteStudent(array);
                        break;
                    case "3":
                        updateStudent(array);
                        break;
                    case "4":
                        findAllStudent(array);
                        break;
                    case "5":
                        System.out.println("谢谢使用");
                        System.exit(0); //JVM退出

                }
            }
            }
            //定义一个方法，判断学号是否被占用
            public static boolean isUsed (ArrayList < Student > array, String sid){
                //如果与集合中的某一个学生学号相同，返回true;如果都不相同，返回false
                boolean flag = false;
                for (int i = 0; i < array.size(); i++) {
                    Student s = array.get(i);
                    if (s.getSid().equals(sid)) {
                        flag = true;
                        break;
                    }
                }
                return flag;
            }
            //定义一个方法，用于添加学生信息
            public static void addStudent (ArrayList < Student > array) {
                Scanner sc = new Scanner(System.in);
                String sid;
                while (true) {
                    System.out.println("请输入学生学号");
                    sid = sc.nextLine();
                    boolean flag = isUsed(array, sid);
                    if (flag) {
                        System.out.println("学生工号被占用");
                    } else {
                        break;
                    }
                }
                System.out.println("请输入学生姓名：");
                String name = sc.nextLine();
                System.out.println("请输入学生年龄：");
                String age = sc.nextLine();
                System.out.println("请输入学生居住地：");
                String address = sc.nextLine();
                //创建对象，赋值
                Student s = new Student();
                s.setAddress(address);
                s.setName(name);
                s.setAge(age);
                s.setSid(sid);
                //将学生对象，添加到集合中
                array.add(s);
                System.out.println("添加学生成功");

            }
            //定义一个方法，用于查看学生信息
            public static void findAllStudent (ArrayList < Student > array) {
                //判断集合中是否有数据，如果没有显示提示信息
                if (array.size() == 0) {
                    System.out.println("无信息，请先添加");
                    //为了让程序不再往下执行，我们在这里写上return;
                    return;
                }
                //显示表头信息 //\t其实是一个tab键的位置
                System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
                //将集合中数据取出按照对应格式显示学生信息，年龄显示补充“岁”
                for (int i = 0; i < array.size(); i++) {
                    Student s = array.get(i);
                    System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t\t" + s.getAddress());
                }
            }
            //定义一个方法，用于删除学生信息
            public static void deleteStudent (ArrayList < Student > array) {
                //键盘录入要删除的学生学号,显示提示信息
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入你要删除的学生的学号：");
                String sid = sc.nextLine();
                //在删除/修改学生操作前，对学号是否存在进行判断 //如果不存在，显示提示信息 //如果存在，执行删除/修改操作
                int index = -1;
                for (int i = 0; i < array.size(); i++) {
                    Student s = array.get(i);
                    if (s.getSid().equals(sid)) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("该信息不存在，请重新输入");
                } else {
                    array.remove(index); //给出删除成功提示
                    System.out.println("删除学生成功");
                }
            }
//定义一个方法，用于修改学生信息
            public static void updateStudent (ArrayList < Student > array) {
                //键盘录入要修改的学生学号，显示提示信息
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入你要修改的学生的学号：");
                String sid = sc.nextLine();
                //键盘录入要修改的学生信息
                System.out.println("请输入学生新姓名：");
                String name = sc.nextLine();
                System.out.println("请输入学生新年龄：");
                String age = sc.nextLine();
                System.out.println("请输入学生新居住地：");
                String address = sc.nextLine();
                //创建学生对象
                Student s = new Student();
                s.setSid(sid);
                s.setName(name);
                s.setAge(age);
                s.setAddress(address);
                //遍历集合修改对应的学生信息
                for (int i = 0; i < array.size(); i++) {
                    Student student = array.get(i);
                    if (student.getSid().equals(sid)) {
                        array.set(i, s);
                    } else {
                        System.out.println("信息不存在");
                    }
                }
                //给出修改成功提示
                System.out.println("修改学生成功");
            }

        }


