package Torty;

import Fabryki.TortFabryka;

/**
 * Created by Uzytkownik on 2017-06-16.
 */
public class DuzyTortTruskawkowy extends Tort {
    TortFabryka fabryka;
    public DuzyTortTruskawkowy(TortFabryka fabryka){
        this.fabryka=fabryka;

        this.cena=35.0;
}}
