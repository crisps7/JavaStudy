package com.monet;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("=================");
            System.out.println("欢迎登录学生管理系统");
            System.out.println("1.查询信息");
            System.out.println("2.添加信息");
            System.out.println("3.删除信息");
            System.out.println("4.修改信息");
            System.out.println("==================");
            switch (sc.nextInt()) {
                case 1:
                    findAll(list);
                    break;
                case 2:
                    addStudent(list);
                    break;
                case 3:
                    deleteStudent(list);
                    break;
                case 4:
                    updateStudent(list);
                    break;
            }
        }
    }

    //查询学生信息
    public static void findAll(List<Student> list) {
        if (list.size() == 0) {
            System.out.println("暂无学生数据,请先添加.");
        } else {
            for (Student student : list) {
                System.out.println("学生id为"+student.getId() + ",  学生姓名为"+student.getName());
            }
        }
    }

    //添加学生数据
    public static void addStudent(List<Student> list) {
        Student s = new Student();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要添加的学生id");
            int SId = scanner.nextInt();
            System.out.println("请输入要添加的学生名字");
            String SName = scanner.next();
            boolean flag = false;
            for (Student student : list) {
                if (SId == student.getId()) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("id重复，请重新输入");
            } else {
                s.setId(SId);
                s.setName(SName);
                list.add(s);
                System.out.println("添加成功");
                break;
            }
        }
    }

    //删除学生数据
    public static void deleteStudent(List<Student> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        int sId=scanner.nextInt();
        int idx=-1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (sId==stu.getId()){
                idx=i;
                break;
            }
        }
        if (idx!=-1){
            System.out.println("已删除成功");
            list.remove(idx);
        }else {
            System.out.println("删除失败，不存在该学生，请重新输入");
        }
    }

    //修改学生信息
    public static void updateStudent(List<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        int s= sc.nextInt();
        int index=-1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            if (stu.getId()==s){
                index=i;
                break;
            }
        }
        if (index!=-1){
            Student student = new Student();
            System.out.println("请输入要修改的姓名");
            String sName= sc.next();
            student.setName(sName);
            list.set(index,student);
            System.out.println("修改成功");
        }else {
            System.out.println("不存在该学生，请重新输入");
        }
    }
}


