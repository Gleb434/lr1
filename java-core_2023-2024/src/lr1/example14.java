package lr1;
import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        int a = 2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();

        int minus = num - 1;
        System.out.println(minus);
        System.out.println(num);
        int plus = num + 1;
        System.out.println(plus);
        double sum = Math.pow(minus + num + plus, a);
        System.out.println(sum);
    }
}
