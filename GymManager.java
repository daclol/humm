package Main;

import Actions.*;

import java.util.Scanner;

public class GymManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Menu.printMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ! Hãy nhập một số.");
                continue;
            }

            switch (choice) {
                case 1 -> AddMember.execute(scanner);
                case 2 -> RemoveMember.execute(scanner);
                case 3 -> ChoosePackage.execute(scanner);
                case 4 -> DisplayMembers.execute();
                case 5 -> AddCoach.execute(scanner);
                case 6 -> DisplayCoaches.execute();
                case 7 -> Actions.Statistics.execute();
                case 0 -> {
                    System.out.println("Thoát chương trình. Hẹn gặp lại!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ! Hãy thử lại.");
            }
        }
    }
}
