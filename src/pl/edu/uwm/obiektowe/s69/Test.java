package pl.edu.uwm.obiektowe.s69;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public boolean test() {
        List<Osoba> osoby = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String name = "osoba " + String.valueOf(i);
            String nazwisko = "nazwisko" + String.valueOf(i);
            Date dataUrodzenia = new Date(0);

            if (i == 0) {
                name = "STUDENCIE O INDEKSIE 69, TWOJE IMIE";
                nazwisko = "STUDENCIE O INDEKSIE 69, TWOJE NAZWISKO";
            } else if (i == 1) {
                name = "Lady";
                nazwisko = "Gaga";
            }

            Osoba osoba = new Osoba(name, nazwisko, dataUrodzenia);

            if (i > 2) {
                 osoba = new Pracownik(osoba, "programista", 6900);
            }


            osoby.add(osoba);
        }

        osoby.forEach((osoba -> {
            System.out.println(osoba.toString());
        }));

        int sumaPensji = 0;
        for (Osoba osoba : osoby) {
            if (osoba instanceof Pracownik) {
                Pracownik pracownik = (Pracownik) osoba;
                sumaPensji += pracownik.pensja;
            }
        }


        // true czyli test sie udał - tak se wymyśliłem o
        return true;
    }
}
