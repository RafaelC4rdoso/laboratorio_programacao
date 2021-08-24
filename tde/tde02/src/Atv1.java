import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        double desconto = sc.nextDouble();

        double valorDesconto = valor * (desconto/100);
        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.println("Valor total: " + (valor - valorDesconto));


    }
}
