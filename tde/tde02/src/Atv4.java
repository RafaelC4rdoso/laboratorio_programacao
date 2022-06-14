import javax.swing.*;
import java.util.Scanner;

public class Atv4 {
    /*
    Considere a seguinte informação a respeito do cálculo da aposentadoria.
    Para se aposentar por idade, as mulheres precisam ter atingido 60 anos de idade e os homens, 65.
    Já na aposentadoria por tempo de contribuição, o tempo mínimo exigido é de 30 anos para as mulheres e de 35 anos para os homens.
    Com base nessas informações, elabore uma classe que receba a idade de uma pessoa, seu sexo e a quantidade de anos de contribuição.
    A seguir, calcule a quantidade de anos que falta de contribuição para se aposentar,
    ou então emita a mensagem: “você já tem o direito a aposentadoria”.
     */

    public static void main(String[] args) {

        final int IDADE_MASC_APOSENTAR = 65;
        final int IDADE_FEM_APOSENTAR = 60;
        final int TEMPO_CONTRIBUICAO_FEM = 30;
        final int TEMPO_CONTRIBUICAO_MASC = 35;


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu sexo: ");
        char sexo = sc.next().charAt(0);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite seu tempo de contribuição: ");
        int anosContribuidos = sc.nextInt();

        Pessoa pessoa = new Pessoa(idade, sexo, anosContribuidos);

        if(sexo == 'm' || sexo == 'M') {
            if(idade >= IDADE_MASC_APOSENTAR || (anosContribuidos >= TEMPO_CONTRIBUICAO_MASC && idade > 50)) {
                JOptionPane.showMessageDialog(null, "Você tem direito a aposentadoria");
            } else {
                int anosRestantes = TEMPO_CONTRIBUICAO_MASC - anosContribuidos;
                JOptionPane.showMessageDialog(null, "Faltam " + anosRestantes + " anos de contribuição");
            }
        } else if(sexo == 'f' || sexo == 'F') {
            if(idade >= IDADE_FEM_APOSENTAR || (anosContribuidos >= TEMPO_CONTRIBUICAO_FEM && idade > 45)) {
                JOptionPane.showMessageDialog(null, "Você tem direito a aposentadoria");
            } else {
                int anosRestantes = TEMPO_CONTRIBUICAO_FEM - anosContribuidos;
                JOptionPane.showMessageDialog(null, "Faltam " + anosRestantes + " anos de contribuição");
            }
        }
    }

    public static class Pessoa {
       Integer idade;
       char sexo;
       Integer anosContribuidos;

       public Pessoa() {

       }

       public Pessoa(Integer idade, char sexo, Integer anosContribuidos) {
           this.idade = idade;
           this.sexo = sexo;
           this.anosContribuidos = anosContribuidos;
       }
    }
}
