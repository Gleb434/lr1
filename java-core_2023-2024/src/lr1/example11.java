package lr1;

import java.util.Date;
import java.util.Scanner;

public class example11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите год рождения: ");
        int yearOfBirth = scanner.nextInt();

        int yearsOld = (new Date()).getYear() + 1900 - yearOfBirth;
        int lastDigit = yearsOld % 10;
        int previousLastDigit = yearsOld / 10 % 10;

        if (previousLastDigit == 1) {
            System.out.print(name + " " + yearsOld + " лет");
        } else {
            switch (lastDigit) {
                case 1:
                    System.out.print(name + " " + yearsOld + " год");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.print(name + " " + yearsOld + " года");
                    break;
                default:
                    System.out.print(name + " " + yearsOld + " лет");
            }
        }

        scanner.close();

    }

}

