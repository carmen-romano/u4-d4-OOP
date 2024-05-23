package Esercizio2;

import Esercizio1.Dipendente;
import Esercizio1.enums.Dipartimento;
import interfaces.CheckIn;

public class Dirigente extends Dipendente implements CheckIn {

    public Dirigente( Dipartimento dipartimento) {
        super( dipartimento);
    }

    @Override
    public double calculateSalary() {
        return getStipendio() + 1500;
    }

    @Override
    public void checkIn() {
        System.out.println("Dirigente ha iniziato il turno di lavoro");
    }
}
