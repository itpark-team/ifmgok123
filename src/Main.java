import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.print("Введите свой возраст: ");
        age = scanner.nextInt();

        if (age >= 0 && age < 7) {
            System.out.println("Иди в садик");
        } else if (age >= 7 && age < 18) {
            System.out.println("Иди в школу");
        } else if (age >= 18 && age < 23) {
            System.out.println("Иди в ВУЗ");
        } else if (age >= 23 && age < 60) {
            System.out.println("Иди на работу");
        } else if (age >= 60 && age < 100) {
            System.out.println("Иди на пенсию");
        } else {
            System.out.println("Такого возраста не существует");
        }
    }
}