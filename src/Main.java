import Esercizio1.Dipendente;
import Esercizio1.enums.Dipartimento;
import Esercizio2.DipendenteFullTime;
import Esercizio2.DipendentePartTime;
import Esercizio2.Dirigente;
import Esercizio3.Volontario;
import interfaces.CheckIn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //---------------------------ESERCIZIO2---------------------------------//

        //Dipendente dipendente1 = new Dipendente(1200, Dipartimento.VENDITE);
        //Dipendente dipendente2 = new Dipendente(1000,Dipartimento.PRODUZIONE);
        //Dipendente dipendente3 = new Dipendente(1500, Dipartimento.AMMINISTRAZIONE);

        //Dipendente[] dipendenti={dipendente1,dipendente2,dipendente3};

        //for (int i = 0; i < dipendenti.length; i++) {
         //   System.out.println("Matricola: " + dipendenti[i].getMatricola());

        //---------------------------ESERCIZIO2---------------------------------//

        DipendentePartTime dipendentePartTime1 = new DipendentePartTime(Dipartimento.PRODUZIONE,80);
        DipendenteFullTime dipendenteFullTime = new DipendenteFullTime(Dipartimento.PRODUZIONE);
        Dirigente dirigente = new Dirigente(Dipartimento.AMMINISTRAZIONE);

        Dipendente[] dipendenti = {dipendenteFullTime,dipendentePartTime1,dirigente};
        int stipendiTotali= 0;
        for (int i = 0; i < dipendenti.length; i++) {
            stipendiTotali += dipendenti[i].calculateSalary();
        }
        System.out.println("Totali stipendi: " + stipendiTotali);

    //---------------------------ESERCIZIO3---------------------------------//

    Volontario volontario1 = new Volontario(28,"Mario", "Volontario full time");
    Volontario volontario2 = new Volontario(25,"Giovanni", "Volontario part time");
    DipendentePartTime dipendentePartTime2 = new DipendentePartTime(Dipartimento.PRODUZIONE,50);
DipendenteFullTime dipendenteFullTime2 = new DipendenteFullTime(Dipartimento.VENDITE);

    CheckIn[] checkIns = {volontario1, dipendentePartTime2, volontario2, dipendenteFullTime2};
        for (int i = 0; i <checkIns.length ; i++) {
            checkIns[i].checkIn();

        }
        }
    }
