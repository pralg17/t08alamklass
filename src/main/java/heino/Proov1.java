//package heino;

public class Proov1 {

    public static void main(String[] args) {
        Isik isik = new Isik();
        isik.setEesNimi("Heino");
        isik.setPereNimi("Pärn");
        isik.setStatus("Tudeng");
        isik.setVanus(23);

        Tootaja tootaja = new Tootaja();
        tootaja.setEesNimi("Heino");
        tootaja.setPereNimi("Pärn");
        tootaja.setStatus("Töötaja");
        tootaja.setVanus(22);
        tootaja.setEttevote("Skype");
        tootaja.setRoll("Projektijuht");
        tootaja.setPalgad(new Double[] {1243.0, 1224.0, 2443.5, 2111.0, 903.5, 300.5});

        System.out.println(isik.toString());
        System.out.println(tootaja.toString());



    }
}

/*
[heinparn@greeny heino]$ javac *.java
[heinparn@greeny heino]$ java Proov1
Nimi: Heino Pärn
Vanus: 23

Nimi: Heino Pärn
Vanus: 22
Staatus: Töötaja
Ettevote: Skype
Roll: Projektijuht
Keskmine Palk: 1370.9166666666667
Palgad: [1243.0, 1224.0, 2443.5, 2111.0, 903.5, 300.5]


*/
