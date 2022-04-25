package com.company;
import java.util.Scanner;
public class Main {
    String login;
    String password;
    public static void main(String[] args) {
        Main sk = new Main ();
        sk.login = "java";
        sk.password = "111";
        String login1;
        String password1;
        Scanner in = new Scanner(System.in);
        login1 = in.nextLine();
        password1 = in.nextLine();
        if(sk.password.equals(password1) && sk.login.equals(login1))
        {System.out.println("Вас узнали. Добро пожаловать");}
        else {System.out.println("Логин и пароль не распознаны. Доступ запрещен");};
    }
}



