package Esercizio3;

import interfaces.CheckIn;

public class Volontario implements CheckIn {
    private String nome;
    private int eta;
    private String CV;

    public Volontario(int eta, String nome, String CV) {
        this.eta = eta;
        this.nome = nome;
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volantario " + this.nome + " ha iniziato il suo turno di lavoro");
    }
}
