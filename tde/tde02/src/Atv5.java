import java.util.Scanner;

public class Atv5 {
    /*

    Elabore uma classe que receba o nome de um produto e o seu valor.
    O desconto deve ser calculado de acordo com o valor fornecido conforme a imagem.
    Utilizando a estrutura if-else, apresenta em tela o nome do produto, valor original do produto e o novo valor
    depois de ser realizado o desconto. Caso o valor digitado seja menor que zero,
    deve ser emitida uma mensagem de aviso.

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = sc.next();

        System.out.print("Digite o valor do produto: ");
        Double valor = sc.nextDouble();

        if (valor >= 50 && valor < 200) {
            valor *= 0.95;
        } else if (valor >= 200 && valor < 500) {
            valor *= 0.96;
        } else if (valor >= 500 && valor < 1000) {
            valor *= 0.97;
        } else if (valor >= 1000) {
            valor *= 0.98;
        }

        System.out.println("Valor alterado: " + valor);
    }
}
