package Fabryki;

import Skladniki.BialyBiszkopt;
import Skladniki.KremTruskawkowy;
import Skladniki.Truskawki;

/**
 * Created by Uzytkownik on 2017-06-16.
 */
public interface TortFabryka {
    public Biszkopt stworzBiszkopt();
    public Krem stworzKrem();
    public Dodatki stworzDodatki();
}
