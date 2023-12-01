package lr1;
import java.util.Scanner;
public class example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        float num = in.nextFloat();
        System.out.println("Введите число 2: ");
        float num2 = in.nextFloat();
        float sum = num + num2;
        System.out.println(num + " + " + num2 + " = " + sum);
    }
}
