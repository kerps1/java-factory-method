package Torty;

import Fabryki.CzekoladowyFabryka;
import Fabryki.TortFabryka;

/**
 * Created by Uzytkownik on 2017-06-16.
 */
public class DuzyTortCzekoladowy extends Tort {

    TortFabryka fabryka;
   public DuzyTortCzekoladowy(TortFabryka fabryka) {
       this.fabryka = fabryka;

        this.cena = 30.0;
    }


}
