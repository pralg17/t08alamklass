package main.java.tanel;
public abstract class Baas{
    int k;
    int p;
    int v;

    public Baas(int kaal, int pikkus, int vanus){
        k = kaal;
        p = pikkus;
        v = vanus;
    }
    
    public abstract double aktiivususArv();

    public double kaloriVajadus(){
        return (655+(9.6*k)+(1.8*p)+(4.7*v))*aktiivususArv();
    };
}