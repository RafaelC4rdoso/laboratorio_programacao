import java.util.Scanner;

public class Reader {

    Scanner sc = new Scanner(System.in);

    public Integer readOptions() {
        System.out.print("DIGITE A OPERAÇÃO A EFETUAR: \n" +
                "1 - Adicionar uma série\n" +
                "2 - Remover uma série\n" +
                "3 - Listar séries vistas\n" +
                "4 - Listar séries não vistas\n" +
                "5 - Pesquisar uma série\n" +
                "6 - Mostrar todas as séries\n" +
                "DIGITE 7 PARA ENCERRAR\n" +
                "== ");
        Integer opt = sc.nextInt();
        return opt;
    }


}
