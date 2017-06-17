package Fabryki;


import Skladniki.BialyBiszkopt;
import Skladniki.KremTruskawkowy;
import Skladniki.Truskawki;

public class TruskawkowyFabryka implements TortFabryka {
    @Override
    public Biszkopt stworzBiszkopt() {
        return new BialyBiszkopt();
    }

    @Override
    public Dodatki stworzDodatki() {
        return new Truskawki();
    }

    @Override
    public Krem stworzKrem() {
        return new KremTruskawkowy();
    }
}
