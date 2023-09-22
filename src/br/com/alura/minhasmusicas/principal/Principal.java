package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musicas= new Musica();
        musicas.setTitulo("Grana,fama e valor");
        musicas.setCantor("Mc Daniel");

        for(int i =0; i<1000;i++){
            musicas.reproducao();
        }
        for(int i =0 ; i<1000;i++){
            musicas.curti();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Entrevista com Thor");
        podcast.setApresentador("Mitico e Igão");

    }
}
