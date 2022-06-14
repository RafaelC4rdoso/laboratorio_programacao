package atv1;

public class Dado {
    public static int faces;
    public static int sorteio;

    public static int lancar() {
        sorteio = (int)(Math.random() * faces + 1);
        return sorteio;
    }
}
