package com.ll;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        int a = 0;
        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                System.out.print("명언 : ");
                String command2 = sc.nextLine();
                System.out.print("작가 : ");
                a++;
                String command3 = sc.nextLine();
                System.out.printf("%d번 명언이 등록되었습니다.\n", a);
                continue;
            }
        }
    }
}
