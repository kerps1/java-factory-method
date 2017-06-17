package Zamawianie;
import Fabryki.CzekoladowyFabryka;
import Fabryki.KawowyFabryka;
import Fabryki.TortFabryka;
import Fabryki.TruskawkowyFabryka;
import Torty.*;
/**
 * Created by Uzytkownik on 2017-06-16.
 */
public class Zamow {
    public Tort stworzTort(String style, String type, int ilosc) {
        Tort tort = null;

        if (style.equals("Czekoladowy")) {
            if (type.equals("Duzy")) {
                TortFabryka fabryka = new CzekoladowyFabryka();
                tort = new DuzyTortCzekoladowy(fabryka);
                tort.setNazwa("Duzy Tort Czekoladowy");
            }
            if (type.equals("Sredni")) {
                TortFabryka fabryka = new CzekoladowyFabryka();
                tort = new SredniTortCzekoladowy(fabryka);
                tort.setNazwa("Sredni Tort Czekoladowy");
            }
            if (type.equals("Maly")) {
                TortFabryka fabryka = new CzekoladowyFabryka();
                tort = new MalyTortCzekoladowy(fabryka);
                tort.setNazwa("Maly Tort Czekoladowy");
            }

    }

        if (style.equals("Truskawkowy")) {
            if (type.equals("Duzy")) {
                TortFabryka fabryka = new TruskawkowyFabryka();
                tort = new DuzyTortTruskawkowy(fabryka);
                tort.setNazwa("Duzy Tort Truskawkowy");
            }
            if (type.equals("Sredni")) {
                TortFabryka fabryka = new TruskawkowyFabryka();
                tort = new SredniTortTruskawkowy(fabryka);
                tort.setNazwa("Sredni Tort Truskawkowy");
            }
            if (type.equals("Maly")) {
                TortFabryka fabryka = new TruskawkowyFabryka();
                tort = new MalyTortTruskawkowy(fabryka);
                tort.setNazwa("Maly Tort Truskawkowy");
            }

        }
        if (style.equals("Kawowy")) {
            if (type.equals("Duzy")) {
                TortFabryka fabryka = new KawowyFabryka();
                tort = new DuzyTortKawowy(fabryka);
                tort.setNazwa("Duzy Tort Kawowy");
            }
            if (type.equals("Sredni")) {
                TortFabryka fabryka = new KawowyFabryka();
                tort = new SredniTortCzekoladowy(fabryka);
                tort.setNazwa("Sredni Tort Kawowy");
            }
            if (type.equals("Maly")) {
                TortFabryka fabryka = new KawowyFabryka();
                tort = new MalyTortKawowy(fabryka);
                tort.setNazwa("Maly Tort Kawowy");
            }


        }
        else System.out.println("Wybrano zły tort, do wyboru (Maly/Sredni/Duzy) (Czekoladowy/Truskawkowy/Kawowy) (ilosc).");

        tort.iloscTortow(ilosc);
        tort.toString();
        return tort;
    }
}