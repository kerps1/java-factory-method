package Torty;

import Fabryki.TortFabryka;

/**
 * Created by Uzytkownik on 2017-06-16.
 */
public class SredniTortKawowy extends Tort {
    TortFabryka fabryka;
    public SredniTortKawowy( TortFabryka fabryka){
        this.fabryka=fabryka;


        this.cena = 27.0;
    }
}
