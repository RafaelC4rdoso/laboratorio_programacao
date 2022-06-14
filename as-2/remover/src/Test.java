import model.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao", "9999999", "exemplo@gmail.com");
        Aluno aluno2 = new Aluno("Mauro", "9999999", "exemplo@gmail.com");
        Aluno aluno3 = new Aluno("Julia", "9999999", "exemplo@gmail.com");
        Aluno aluno4 = new Aluno("Amanda", "9999999", "exemplo@gmail.com");
        Aluno aluno5 = new Aluno("Jose", "9999999", "exemplo@gmail.com");
        Aluno aluno6 = new Aluno("Carlos", "9999999", "exemplo@gmail.com");
        Aluno aluno7 = new Aluno("Tatiana", "9999999", "exemplo@gmail.com");

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);
        alunos.add(aluno7);

        alunos.forEach(System.out::println);
        System.out.println("--------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um nome para remover da lista: ");
        String name = sc.next();

        alunos = ListRemover.removeByName(alunos, name);
        System.out.println("--------------------------------");
        alunos.forEach(System.out::println);
    }
}
