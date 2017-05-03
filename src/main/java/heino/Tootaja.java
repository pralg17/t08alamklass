//package heino;

import java.util.Arrays;
import java.util.jar.JarEntry;

class Tootaja extends Isik {
    private String ettevote;
    private String roll;
    private Double keskminePalk;
    private Double[] palk;

    public void setPalgad(Double[] palk){
        this.palk = palk;
        setKeskminePalk(palk);
    }

    public Double[] getPalgad() {
        return palk;
    }

    private void setKeskminePalk(Double[] palk){
        Double sum = 0.0;
        for (Double item: palk){
            sum += item;
        }
        this.keskminePalk = sum/palk.length;
    }

    public Double getKeskminePalk() {
        return keskminePalk;
    }

    public String geEttevote() {
        return ettevote;
    }

    public void setEttevote(String ettevote) {
        this.ettevote = ettevote;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }


    @Override
    public String toString() {
        return "Nimi: " + getNimi() + "\nVanus: " + getVanus() + "\nStaatus: " + getStatus() + "\nEttevote: " + ettevote +
                "\nRoll: " + roll + "\nKeskmine Palk: " + keskminePalk + "\nPalgad: " + Arrays.toString(palk)+ "\n";

    }
}
