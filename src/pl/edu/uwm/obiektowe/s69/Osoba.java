package pl.edu.uwm.obiektowe.s69;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Osoba {
    String imie;
    String nazwisko;
    Date dataUrodzenia;
    int wiek;

    public Osoba(String imie, String nazwisko, Date dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.wiek = obliczWiek(dataUrodzenia);
    }

    private int obliczWiek(Date dataUrodzenia) {
        return 69;
    }

    @Override
    public String toString() {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());

        return "Osoba " + imie + " " + nazwisko + " urodzona " + date + ", wiek " + wiek;
    }
}
