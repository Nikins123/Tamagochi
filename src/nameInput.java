import java.util.Scanner;
import java.util.regex.Pattern;

public class nameInput {

    public void tamInput() {
        Scanner sc = new Scanner(System.in);
        String inputString;

        do {
            System.out.println("Введіть Ім'я Тамагочі: ");
            inputString = sc.nextLine();

            if (!isValid(inputString)) {
                System.out.println("Ім'я Тамагочі написане неправильно. Спробуйте ще раз.");
            }
        } while (!isValid(inputString));

        System.out.println("Введено правильне ім'я: " + inputString);


    }

    private boolean isValid(String input) {
        // Перевірка, чи введене ім'я містить лише літери
        return input.matches("[a-zA-Z]+");
    }

}
