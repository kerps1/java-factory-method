package Torty;

import Fabryki.TortFabryka;

/**
 * Created by Uzytkownik on 2017-06-16.
 */
public class SredniTortTruskawkowy extends Tort {
    TortFabryka fabryka;
    public SredniTortTruskawkowy( TortFabryka fabryka) {
        this.fabryka=fabryka;

        this.cena = 30.0;
    }
}
