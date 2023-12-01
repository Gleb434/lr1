package lr1;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели: ");
        String day = in.nextLine();
        System.out.println("Введите название месяца: ");
        String mouth = in.nextLine();
        System.out.println("Введите дату: ");
        int date = in.nextInt();
        System.out.print(day + " " + date + " " + mouth);
        in.close();
    }
}
