import java.util.Scanner;


public class tamagochiMenu  {
    int Menu;


    public void bodyMenu(){

        String tamagotchiName = nameInput.name;

        try (Scanner scanner = new Scanner(System.in)){
            while (true){


                System.out.println('\n' + "Що ви хочете зробити : ");
                System.out.println("1. Покормити");
                System.out.println("2. Вигуляти");
                System.out.println("3. Погратись з ним");

                System.out.println('\n' + "0. Вийти назад");
                Menu = scanner.nextInt();

                switch (Menu){
                    case 1:
                        System.out.println("Ви покормили " + tamagotchiName);
                        break;
                    case 2:
                        System.out.println("Ви вигуляли " + tamagotchiName);
                        break;
                    case 3:
                        System.out.println("Ви погрались " + tamagotchiName);
                        break;
                    case 0:
                        MainMenu mainMenu = MainMenu.getInstance();
                        mainMenu.menu();

                        return;
                    default:
                        System.out.println("Неправильне значення. Спробуйте ще раз.");
                        break;
                }
            }
        }

    }


}
