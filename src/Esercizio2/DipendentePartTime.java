package Esercizio2;

import Esercizio1.Dipendente;
import Esercizio1.enums.Dipartimento;
import interfaces.CheckIn;

public class DipendentePartTime extends Dipendente implements CheckIn {
    private double oreDiLavoro ;
    private double pagaOraria = 15;

    public DipendentePartTime( Dipartimento dipartimento, double oreDiLavoro) {
        super(dipartimento);
        this.oreDiLavoro = oreDiLavoro;

    }


    @Override
    public double calculateSalary() {
        return oreDiLavoro * pagaOraria;

    }

    @Override
    public void checkIn() {
        System.out.println("Lavoratore part time ha iniziato il turno di lavoro");
    }
}
