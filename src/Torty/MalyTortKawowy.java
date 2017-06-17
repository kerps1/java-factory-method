package Torty;

import Fabryki.TortFabryka;

/**
 * Created by Uzytkownik on 2017-06-16.
 */
public class MalyTortKawowy extends Tort {
    TortFabryka fabryka;
    public MalyTortKawowy(TortFabryka fabryka){
        this.fabryka=fabryka;

        this.cena = 22.0;
    }
}
