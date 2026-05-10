package com.example;

public class Candidato {
    //attributes
    private String nombre;
    private String partido;
    private int votos = 0;

    //constructures
    public Candidato (String nombre, String partido) {
        this.nombre = nombre;
        this.partido = partido;
        this.votos = votos;
    }

    //getters
    public String getNombre() {return nombre;}
    public String getPartido() {return partido;}
    public int getVotos() {return votos;}

    //setters
    public void sumarVotos() {votos++;}
}
