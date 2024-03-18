import java.util.Scanner;
import java.util.regex.Pattern;

public class nameInput {
    public static String name; // Змінна для збереження імені Тамагочі
    public String tamInput() {
        Scanner sc = new Scanner(System.in);
        String inputString;

        do {
            System.out.println("Введіть Ім'я Тамагочі: ");
            inputString = sc.nextLine();

            if (!isValid(inputString)) {
                System.out.println("Ім'я Тамагочі написане неправильно. Спробуйте ще раз.");
            }
        } while (!isValid(inputString));

        name = inputString;
       return name;


    }

    private boolean isValid(String input) {
        // Перевірка, чи введене ім'я містить лише літери
        return input.matches("[a-zA-Z]+");
    }


}
