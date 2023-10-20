package User;

import action.*;

import java.util.Scanner;

public class Admin extends User{
    public Admin(String name) {
        this.name = name;
        actions = new IAction[]{
                new ExitAction(),
                new AddAction(),
                new DelAction(),
                new FIndAction(),
                new DisplayAction()
        };
    }

    @Override
    public int menu() {
        int choice;
        System.out.println("====================================================================");
        System.out.println("Добро пожаловать в систему управления библиотекой" + " " +this.name + " " + "Вы администратор");
        System.out.println("1. Добавить книгу");
        System.out.println("2. Удалить книгу");
        System.out.println("3. Найти книги");
        System.out.println("4. Показать все книги");
        System.out.println("0. Выход");
        System.out.println("=======================================================================");
        Scanner scanner = new Scanner(System.in);
        do {
            // ввод цикла
            choice = scanner.nextInt();
        }while (choice < 0 || choice> 4);
        return choice;
    }
}

