package Torty;

import Fabryki.TortFabryka;

/**
 * Created by Uzytkownik on 2017-06-16.
 */
public class DuzyTortKawowy extends Tort {
    TortFabryka fabryka;
   public DuzyTortKawowy(TortFabryka fabryka){
       this.fabryka = fabryka;

        this.cena = 32.0;

    }
}
