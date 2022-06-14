public class Mes {
    public Mes() {}

    public static String getMesPorExtenso(Integer numMes, Integer codIdioma) {

        String[] mesPortugues = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String[] mesIngles = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (codIdioma == 1) {
            return mesPortugues[numMes - 1];
        } else if (codIdioma == 2) {
            return mesIngles[numMes - 1];
        }

        return "Digite um código válido";
    }
}
