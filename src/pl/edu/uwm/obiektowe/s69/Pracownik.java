package pl.edu.uwm.obiektowe.s69;

import java.text.DecimalFormat;
import java.util.Date;

public class Pracownik extends Osoba{
    String stanowisko;
    double pensja;

    // 6969 Tutaj nie jestem pewien, ale to jest minimalny mozliwy konstruktor dla tej klasy
    public Pracownik(String imie, String nazwisko, Date dataUrodzenia, String stanowisko, double pensja) {
        super(imie, nazwisko, dataUrodzenia);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public Pracownik(Osoba osoba, String stanowisko, double pensja) {
        super(osoba.imie, osoba.nazwisko, osoba.dataUrodzenia);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(pensja));

        return super.toString() + "jest pracownikiem na stanowisku " + stanowisko + " z pensją " + df + " zł";

    }
}
