package atv1;

public class atv1 {
    public static void main(String[] args) {

        //Método 1
        Integer faces = 6;
        Integer sorteio = 0;
        Integer total = 0;

        for (int i = 0; i < 3; i++) {
            total += sorteio = (int)(Math.random() * 6 + 1);
        }
        System.out.println(total);

        //Método 2
        total = 0;
        Dado.faces = 6;
        for (int i = 0; i < 3; i++) {
            total += Dado.lancar();
        }
        System.out.println(total);
    }
}
