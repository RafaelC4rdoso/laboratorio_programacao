import javax.swing.*;
import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da transação: ");
        double valorTransacao = sc.nextDouble();

        System.out.print("Digite o valor venal: ");
        double valorVenal = sc.nextDouble();

        System.out.print("Percentual de imposto: ");
        double percentImposto = sc.nextDouble();

        double valorImposto = 0;

        if (valorTransacao > valorVenal) {
            valorImposto = valorTransacao * (percentImposto / 100);
        } else {
            valorImposto = valorVenal * (percentImposto / 100);
        }

        JOptionPane.showMessageDialog(null,"Valor do imposto a ser pago: " + valorImposto, "Warning", JOptionPane.WARNING_MESSAGE);

    }
}
