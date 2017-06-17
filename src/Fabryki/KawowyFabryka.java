package Fabryki;


import Skladniki.BialyBiszkopt;
import Skladniki.KremKawowy;
import Skladniki.ZiarnaKawy;


/**
 * Created by Uzytkownik on 2017-06-16.
 */
public class KawowyFabryka  implements TortFabryka {
    @Override
    public Biszkopt stworzBiszkopt() {
        return new BialyBiszkopt();
    }

    @Override
    public Dodatki stworzDodatki() {
        return new ZiarnaKawy();
    }

    @Override
    public Krem stworzKrem() {
        return new KremKawowy();
    }

}
