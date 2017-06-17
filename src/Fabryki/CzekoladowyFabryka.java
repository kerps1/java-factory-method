package Fabryki;

import Skladniki.CiemnyBiszkopt;
import Skladniki.KremCzekoladowy;
import Skladniki.PolewaCzekoladowa;

/**
 * Created by Uzytkownik on 2017-06-16.
 */
public class CzekoladowyFabryka implements TortFabryka {

    @Override
    public Biszkopt stworzBiszkopt() {
        return new CiemnyBiszkopt();
    }

    @Override
    public Krem stworzKrem() {
        return new KremCzekoladowy();
    }

    @Override
    public Dodatki stworzDodatki() {
        return new PolewaCzekoladowa();
    }
}
