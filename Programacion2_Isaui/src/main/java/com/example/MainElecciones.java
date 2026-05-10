package com.example;

public class MainElecciones {
    public static void main(String[] args) {
        Eleccion eleccion = new Eleccion();

        Candidato c1 = new Candidato("Ana", "Partido Verde");
        Candidato c2 = new Candidato("Luis", "Partido Azul");

        Votante v1 = new Votante("V001");
        Votante v2 = new Votante("V002");

        eleccion.agregarCandidato(c1);
        eleccion.agregarCandidato(c2);

        eleccion.agregarVotante(v1);
        eleccion.agregarVotante(v2);

        eleccion.emitirVoto(v1);
        eleccion.emitirVoto(v2);

        eleccion.mostrarResultados();
        eleccion.mostrarGanador();
    }
}
