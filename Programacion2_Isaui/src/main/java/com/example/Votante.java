package com.example;

public class Votante {
    private String idVotante;
    private boolean yaVoto;

    //constructures
    public Votante (String idVotante){
        this.idVotante = idVotante;
        this.yaVoto = false;
    }

    //getters
    public String getIdVotantante() {return idVotante;}
    public boolean getYaVoto() {return yaVoto;}

    //setters
    public void setYaVoto(boolean yaVoto) {this.yaVoto = yaVoto;}
}
