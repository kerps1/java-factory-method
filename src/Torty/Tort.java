package Torty;

import Fabryki.Biszkopt;
import Fabryki.Dodatki;
import Fabryki.Krem;

/**
 * Created by Uzytkownik on 2017-06-16.
 */
public abstract class Tort {

    public String nazwa;
    Biszkopt biszkopt;
    Krem krem;
    Dodatki dodatki;
    public double cena;

    public void setNazwa(String nazwa){
        this.nazwa=nazwa;
    }
   public String getNazwa(){
        return nazwa;
    }
   public double iloscTortow(int ilosc){
        double iloscTortow=this.cena*ilosc;
        return iloscTortow;
    }
    public String toString() {
        return "Rodzaj zamówionego tortu:["+nazwa+"] Cena za sztukę:["+cena+"] Cena za zestaw:[";
    }
}
