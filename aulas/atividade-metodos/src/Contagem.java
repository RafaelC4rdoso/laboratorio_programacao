import java.util.concurrent.TimeUnit;

public class Contagem {

    public static void contar() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void contar(Integer fim) {
        for (int i = 1; i <= fim; i++) {
            System.out.println(i);
        }
    }

    public static void contar(Integer inicio, Integer fim) {
        if (inicio > fim) {
            System.out.println("Variavel de inicio não pode ser maior que o fim");
        } else {
            for (int i = inicio; i <= fim; i++) {
                System.out.println(i);
            }
        }
    }

    public static void contar(Integer inicio, Integer fim, Integer pausa) throws InterruptedException {
        if (inicio > fim) {
            System.out.println("Variavel de inicio não pode ser maior que o fim");
        } else {
            for (int i = inicio; i <= fim; i++) {
                TimeUnit.SECONDS.sleep(pausa);
                System.out.println(i);
            }
        }
    }
}
