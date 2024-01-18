import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру по Цельсию :");
        int сelsiusTemperature = scanner.nextInt();
        double fahrenheitTemperature = ((сelsiusTemperature * 1.8) + 32);
        System.out.println("Температура по Цельсию " + сelsiusTemperature + "С равна " + fahrenheitTemperature + " С по Фаренгейту");

    }
}