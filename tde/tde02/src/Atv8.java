import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int number = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }
    }
}
