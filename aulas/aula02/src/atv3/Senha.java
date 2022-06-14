package atv3;

public class Senha {
    public static void main(String[] args) {
        final int MAIOR = 6;
        int sorteio;
        int total = 0;
        String senha = "";

        sorteio = (int)(Math.random() * MAIOR + 5);

        for (int i = 0; i < sorteio; i++) {
            senha += String.valueOf((int)(Math.random() * 10));
        }
        System.out.println(senha);
    }
}
