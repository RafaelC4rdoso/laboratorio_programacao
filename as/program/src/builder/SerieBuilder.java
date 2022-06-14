package builder;

import model.Serie;

import java.util.Scanner;


public class SerieBuilder {

    Scanner sc;

    public Serie build() {
        sc = new Scanner(System.in);

        System.out.print("DIGITE O TÍTULO DA SÉRIE: ");
        String titulo = sc.nextLine();

        System.out.print("DIGITE A SINOPSE: ");
        String sinopse = sc.nextLine();

        System.out.print("A SÉRIE JÁ FOI ASSISTIDA? (SIM / NÃO): ");
        String check = sc.nextLine();

        System.out.print("DIGITE A QUANTIDADE DE TEMPORADAS: ");
        Integer temporadas = sc.nextInt();

        System.out.print("DIGITE O TOTAL DE EPISÓDIOS: ");
        Integer numEpisodios = sc.nextInt();
        System.out.println();

        Serie serie = new Serie(titulo, temporadas, numEpisodios, sinopse);
        serie.isVista(check);

        return serie;
    }
}
