import java.util.Scanner;

public class Atv6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalResist = 0;
        double resist;
        double value;
        double bigResist = 0, smallResist = 0;

        for(int i = 0; i < 4; i++) {
            value = sc.nextDouble();
            totalResist += value;

            if (i == 0) {
                bigResist = value;
                smallResist = value;
            }

            if (value > bigResist) {
                bigResist = value;
            }

            if (value < smallResist) {
                smallResist = value;
            }
        }
        System.out.println("Maior resistencia: " + bigResist);
        System.out.println("Menor resistencia: " + smallResist);
        System.out.println("Resistencia total: " + totalResist);
    }
}
