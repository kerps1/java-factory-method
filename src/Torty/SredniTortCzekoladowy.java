package Torty;

import Fabryki.TortFabryka;

/**
 * Created by Uzytkownik on 2017-06-16.
 */
public class SredniTortCzekoladowy extends Tort  {
    TortFabryka fabryka;
    public SredniTortCzekoladowy( TortFabryka fabryka) {
        this.fabryka=fabryka;

        this.cena =25.0;
    }
}
