import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class newLife {
    int Health;
    int Food;
    int Sleep;
    int Time;


    public newLife(int health, int food, int sleep, int time) {
        this.Health = health;
        this.Food = food;
        this.Sleep = sleep;
        this.Time = time;

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new LifeTimerTask(), 0, 30 * 60 * 1000);
    }

    public void lifeOutput() {
        System.out.println(

                "ХП:" + Health + "/50" + " -2" +'\n' +
                        "Їжа: " + Food + "/150" +  " -10" + '\n' +
                        "Сон: " + Sleep + "/24" + " -3" +'\n' +
                        "Дозвілля:" + Time + "/24" + '\n'

        );

    }
    public void saveStateToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("ХП:" + Health + "/50" + " -2" +'\n' );
            writer.write("Їжа: " + Food + "/150" +  " -10" + '\n');
            writer.write("Сон: " + Sleep + "/24" + " -3" +'\n');
            writer.write("Дозвілля:" + Time + "/24" + '\n');
        } catch (IOException e) {
            System.err.println("Помилка при записі у файл: " + e.getMessage());
        }
    }


    class LifeTimerTask extends TimerTask {
        @Override
        public void run() {
            Health -= 2; // Зменшення значення Health на 5 кожні 30 хвилин
            Food -= 5; // Зменшення значення Food на 5 кожні 30 хвилин
            Sleep -= 3; // Зменшення значення Sleep на 5 кожні 30 хвилин
            Time -= 3; // Зменшення значення Time на 5 кожні 30 хвилин

//            System.out.println("\nВідняло  ХП: 50/" + Health + " -2");
//            System.out.println("Відняло Їжа: 150/ " + Food + " -10");
//            System.out.println("Відняло Сон: 24/ " + Sleep + " -3");
//            System.out.println("Відняло Дозвілля: 24/ " + Time + " -3");

        }
    }
}