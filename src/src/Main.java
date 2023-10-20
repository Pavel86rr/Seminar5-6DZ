package src;

import User.Admin;
import book.BookList;
import User.*;

import java.util.Scanner;

public class Main {
    public static User login() {
        System.out.println("Пожалуйста, введите Ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Пожалуйста, введите свою личность (1 означает администратора, 0 означает обычного пользователя):");
        int who = scanner.nextInt();
        if(who == 1) {
            return new Admin(name);
        }else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user = login();
        while (true) {
            int choice = user.menu();
            // 0   bookList
            user.doAction(choice, bookList);
        }
    }
}

