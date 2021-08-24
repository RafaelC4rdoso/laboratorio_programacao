import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        Double peso = sc.nextDouble();

        Double pesoLua = peso * 0.17;
        System.out.println("Seu peso na lua é: " + pesoLua);
    }
}
