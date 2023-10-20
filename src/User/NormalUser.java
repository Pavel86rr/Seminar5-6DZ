package User;
import action.*;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        this.name = name;
        actions = new IAction[]{
                new ExitAction(),
                new FIndAction(),
                new BorrowAction(),
                new ReturnAction()
        };
    }

    @Override
    public int menu() {
        int choice;
        System.out.println("=================================================================");
        System.out.println("Добро пожаловать" + " " + this.name + " " + "в систему управления библиотекой");
        System.out.println("1. Найти книгу");
        System.out.println("2. Заимствование книг");
        System.out.println("3. Вернуть книгу");
        System.out.println("0, Выход");
        System.out.println("==================================================================");
        System.out.println("Пожалуйста, введите свой выбор:");
        Scanner scanner = new Scanner(System.in);
        do {
            choice = scanner.nextInt();
        } while (choice < 0 || choice > 3);
        return choice;
    }
}


