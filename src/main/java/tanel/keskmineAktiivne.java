package main.java.tanel;

public class keskmineAktiivne extends Baas{

    public keskmineAktiivne(int kaal, int pikkus, int vanus){
        super(kaal, pikkus, vanus);
    }

    @Override
    public double aktiivususArv(){
        return 1.55;
    }

}
