package main.java.tanel;

public class mitteAktiivne extends Baas{

    public mitteAktiivne(int kaal, int pikkus, int vanus){
        super(kaal, pikkus, vanus);
    }

    @Override
    public double aktiivususArv(){
        return 1.2;
    }

}
