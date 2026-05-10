package com.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Eleccion {
    private ArrayList<Votante> votantes;
    private ArrayList<Candidato> candidatos;

    //constructures
    public Eleccion () {
        votantes = new ArrayList<>();
        candidatos = new ArrayList<>();
    }

    //methods
    public void agregarVotante(Votante votante) {
        votantes.add(votante);
    }
    public void agregarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }



    public void emitirVoto(Votante votante) {
        Scanner sc = new Scanner(System.in);

        if (votante.getYaVoto()) {
            System.out.println("Este votante ya voto.");
            return;
        }

        int opcion;

        do {
            System.out.println("Candidatos:");

            for (int i = 0; i < candidatos.size(); i++) {
                Candidato c = candidatos.get(i);
                System.out.println((i + 1) + ". " + c.getNombre() + " - " + c.getPartido());
            }

            System.out.print("Ingrese su opcion: ");
            opcion = sc.nextInt();

        } while (opcion < 1 || opcion > candidatos.size());

        candidatos.get(opcion - 1).sumarVotos();
        votante.setYaVoto(true);
    }

    public void mostrarResultados() {
        for (int i = 0; i < candidatos.size(); i++) {
            Candidato c = candidatos.get(i);
            System.out.println(c.getNombre() + ": " + c.getVotos() + " votos");
        }
    }

    public void mostrarGanador() {
        int i = 1;
        Candidato ganador = candidatos.get(0);

        while (i < candidatos.size()) {
            if (candidatos.get(i).getVotos() > ganador.getVotos()) {
                ganador = candidatos.get(i);
            }
            i++;
        }
        System.out.println("Ganador: " + ganador.getNombre());
    }
}
