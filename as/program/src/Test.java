import builder.SerieBuilder;
import model.Serie;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<Serie> series = new ArrayList<>();
        SerieBuilder sb = new SerieBuilder();

        Reader reader = new Reader();
        Integer x = 1;

        do {
            Scanner sc = new Scanner(System.in);
            Integer option = reader.readOptions();

            switch (option) {
                case 1:
                    series.add(sb.build());
                    break;
                case 2:
                    System.out.println("Digite o nome da série a ser removida: ");
                    String remove = sc.nextLine();
                    Serie removeObject = null;
                    for (Serie serie : series) {
                        if (serie.getTitulo().equalsIgnoreCase(remove)) {
                            removeObject = serie;
                        }
                    }
                    series.remove(removeObject);
                    break;
                case 3:
                    for (Serie serie : series) {
                        if (serie.getVista()) {
                            System.out.println("==== SÉRIE VISTAS ====");
                            System.out.println(serie.getTitulo());
                            System.out.println("======================");

                        }
                    }
                    break;
                case 4:
                    for (Serie serie : series) {
                        if (!serie.getVista()) {
                            System.out.println("==== SÉRIE NÃO VISTAS ====");
                            System.out.println(serie.getTitulo());
                            System.out.println("===========================");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome da série que deseja pesquisar: ");
                    String search = sc.nextLine();
                    for (Serie serie : series) {
                        if (serie.getTitulo().equalsIgnoreCase(search)) {
                            System.out.println(serie);
                        }
                    }
                    break;

                case 6:
                    for (Serie serie : series) {
                        System.out.println(serie.toString());
                    }
                    break;

                case 7:
                    x = 7;
            }
        } while (x != 7);


    }
}
