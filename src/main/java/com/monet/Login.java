package com.monet;

import java.util.HashSet;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        HashSet<User> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("=========");
        System.out.println("欢迎进入注册界面");
        System.out.println("请输入用户名:");
        String userName=sc.nextLine();
        System.out.println("请输入密码:");
        String passWord=sc.nextLine();
        System.out.println("请确认密码");
        String mPassWord=sc.nextLine();
        System.out.println("请输入您的生日");
        String birth=sc.nextLine();
        System.out.println("请输入您的手机号:");
        int telPhone=sc.nextInt();
        System.out.println("请输入您的邮箱");
        String email=sc.nextLine();


    }
}
