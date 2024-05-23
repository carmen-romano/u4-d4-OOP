package Esercizio1;

import Esercizio1.enums.Dipartimento;
import interfaces.CheckIn;

import java.util.Random;

public abstract class Dipendente {

    private  int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente( Dipartimento dipartimento) {
        Random random = new Random();
        this.matricola = random.nextInt(1, 1000);
        this.stipendio = 1800;
        this.dipartimento = dipartimento;
    }


    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }
    public abstract  double calculateSalary();
}

