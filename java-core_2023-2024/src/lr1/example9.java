package lr1;
import java.util.Scanner;
public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название месяца: ");
        String mouth = in.nextLine();
        System.out.println("Введите количество дней: ");
        int date = in.nextInt();
        System.out.print(mouth + " содержит " + date);
        in.close();
    }
}
