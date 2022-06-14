package model;

import java.util.ArrayList;

public class Serie {

    private String titulo;
    private Integer temporadas;
    private Integer numEpisodios;
    private String sinopse;
    private Boolean isVista;


    public Serie() {}

    public Serie(String titulo, Integer temporadas, Integer numEpisodios, String sinopse) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.numEpisodios = numEpisodios;
        this.sinopse = sinopse;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public Integer getNumEpisodios() {
        return numEpisodios;
    }

    public void setNumEpisodios(Integer numEpisodios) {
        this.numEpisodios = numEpisodios;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Boolean getVista() {
        return isVista;
    }

    public void isVista(String opcao) {
        if (opcao.equalsIgnoreCase("sim")) {
            isVista = true;
        } else if (opcao.equalsIgnoreCase("não") || opcao.equalsIgnoreCase("nao")) {
            isVista = false;
        }
    }

    public String formatVista() {
        if (isVista) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    @Override
    public String toString() {
        return  "==============================\n" +
                "Título = " + this.titulo + "\n" +
                "Temporadas = " + this.temporadas + "\n" +
                "Número de episódios = " + this.numEpisodios + "\n" +
                "Sinopse = " + this.sinopse + "\n" +
                "Foi vista? = " + formatVista() + "\n" +
                "===============================\n";

    }
}
