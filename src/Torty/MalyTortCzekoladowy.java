package Torty;

import Fabryki.TortFabryka;

/**
 * Created by Uzytkownik on 2017-06-16.
 */
public class MalyTortCzekoladowy extends Tort {
    TortFabryka fabryka;
    public MalyTortCzekoladowy(TortFabryka fabryka){
        this.fabryka=fabryka;

        this.cena=20.0;

    }
}
