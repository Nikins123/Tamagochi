import java.io.File;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public final class MainMenu {
    private static MainMenu instance;
    newLife Life = new newLife(50, 150, 24, 24);

    public static MainMenu getInstance() {
        if (instance == null) {
            instance = new MainMenu();
        }
        return instance;
    }

    private MainMenu() {}

    public void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println('\n' + "Меню: ");
                System.out.println("1. Нова гра");
                System.out.println("2. Зберегти гру");
                System.out.println("3. Загрузити гру");


                System.out.println('\n' + "0. Вийти з гри");
                int selected = scanner.nextInt();

                switch (selected) {
                    case 1:
                        nameInput input = new nameInput();
                        input.tamInput();


                        tamagochiMenu Menu = new tamagochiMenu();
                        Menu.bodyMenu();

                        Life.lifeOutput();

                        break;
                    case 2:
                        Life.saveStateToFile("C:\\Users\\pol12\\IdeaProjects\\Tamagochi\\saves\\gameSave.txt");
                        System.out.println("Гра збережена !");
                        break;
                    case 3:
                        System.out.println(3);
                        break;
                    case 0:
                        System.out.println("Ви вийшли з гри. Приходьте ще !");
                        return;
                    default:
                        System.out.println("Неправильне значення. Спробуйте ще раз.");
                        break;
                }
            }
        }

    }
}
