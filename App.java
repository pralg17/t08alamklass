public class App {
    public static void main(String[] args){

        Sportlane isik1 = new Sportlane();
        Isik isik2 = new Isik();
        isik2.Isik("Oscar August", "Heinla", "Eestlane", 24);

        isik1.Sportlane("Oscar August", "Heinla", "Eestlane", 24, "Kettaheide", "London MM KULD");

        System.out.println(isik1.toString());
        System.out.println(isik2.toString());
    }

}
/*
PS C:\Users\oscar\Desktop\Kool\JAVA\Klassid\t08alamklass> java App

Nimi: Oscar August Heinla
Spordiala: Kettaheide
Parim aavutus: London MM KULD

Nimi: Oscar August Heinla
Vanus: 24
Rahvus: Eestlane
*/