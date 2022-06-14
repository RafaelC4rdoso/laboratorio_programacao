import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Atv3 {
    /*
    Usando a classe JOptionPane para entrada de dados,
    elabore uma classe que receba a nota de duas provas e de um trabalho.
    Calcule e mostre a média e o resultado final (aprovado ou reprovado).
    Para calcular a média utilize a fórmula seguinte: média = (nota da prova 1 + nota da prova 2 + nota do trabalho) / 3.
    Considere que a média mínima para aprovação é 6.
     */

    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da prova 1", null, JOptionPane.WARNING_MESSAGE));
        System.out.println(nota1);

        double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da prova 2", null, JOptionPane.WARNING_MESSAGE));
        System.out.println(nota1);

        double trabalho = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota do trabalho", null, JOptionPane.WARNING_MESSAGE));
        System.out.println(nota1);

        double media = (nota1 + nota2 + trabalho) / 3;

        if (media >= 6.0) {
            JOptionPane.showMessageDialog(null, "Aprovado", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado", "Resultado", JOptionPane.INFORMATION_MESSAGE);

        }
    }
}
