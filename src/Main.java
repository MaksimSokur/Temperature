import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Введите температуру в (С): ");
        double tc = sc.nextDouble();
        double tf = tc*9/5+32;
        out.printf("Темпаратура (F): %2f\n", tf);
    }
}
