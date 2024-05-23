package Esercizio2;

import Esercizio1.Dipendente;
import Esercizio1.enums.Dipartimento;
import interfaces.CheckIn;

public class DipendenteFullTime extends Dipendente implements CheckIn {


    public DipendenteFullTime( Dipartimento dipartimento)
    {
        super( dipartimento);

    }

    @Override
    public double calculateSalary() {
       return getStipendio();
    }


    @Override
    public void checkIn() {
        System.out.println("Lavoratore full time ha iniziato il turno di lavoro");
    }
}
