package main.java.tanel;
import java.util.*;
public class Rakendus{

    public static void main(String[] arg){

        Baas inimene1 = new mitteAktiivne(50, 180, 25);
        Baas inimene2 = new keskmineAktiivne(50,180,25);
        System.out.println("Mitte aktiivse inimese kalorivajadus: " + inimene1.kaloriVajadus());
        System.out.println("Aktiivse inimese kalorivajadus: " + inimene2.kaloriVajadus() + "\n");

    }

}

/*
NÄIDISINIMENE : kaal 50
                pikkus 180
                vanus 25
                
Mitte aktiivse inimese kalorivajadus: 1891.8
Aktiivse inimese kalorivajadus: 2443.5750000000003

*/