package atv2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        String nome;
        double valor = 1;
        final double PERCENTUAL = 1.10;
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#.00");

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o valor: ");
            valor = sc.nextDouble();

            if (valor > 0) {

                System.out.print("Digite o nome do produto: ");
                nome = sc.next();

                valor *= PERCENTUAL;

                System.out.println("Nome do produto: " + nome);
                System.out.println("Novo preço: " + df.format(Math.round(valor)));
            } else {
                System.out.println("tiaul");
            }
        } while (valor != 0);
    }
}
