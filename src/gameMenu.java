import java.util.Scanner;

public class gameMenu {
    int tamMenu;

    public void menu() {

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Меню: ");
                System.out.println("1. Покормити Тамагочі");
                System.out.println("2. Вигуляти Тамагочі");

                System.out.println("0. Вийти з гри");
                tamMenu = scanner.nextInt();

                switch (tamMenu) {
                    case 1:
                        System.out.println(1);
                        break;
                    case 2:
                        System.out.println(2);
                        break;
                    case 0:
                        System.out.println(0);
                        return;
                    default:
                        System.out.println("Неправильне значення. Спробуйте ще раз.");
                        break;
                }
            }
        }

    }
}
