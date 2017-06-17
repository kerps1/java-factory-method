package Torty;

import Fabryki.TortFabryka;

/**
 * Created by Uzytkownik on 2017-06-16.
 */
public class MalyTortTruskawkowy extends Tort {
    TortFabryka fabryka;
    public MalyTortTruskawkowy(TortFabryka fabryka) {
        this.fabryka=fabryka;

        this.cena =25.0;
    }
}
