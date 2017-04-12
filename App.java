public class App {
    public static void main(String[] args){

        Isik isik1 = new Isik();
        isik1.lisaisik("Oscar August", "Heinla", "Eestlane", 24);


        Sportlane sport1 = new Sportlane();
        sport1.lisaSport("Kettaheide", "London MM KULD");

        System.out.println(sport1.toString());
        System.out.println(isik1.toString());
    }

}
/*
PS C:\Users\oscar\Desktop\Kool\JAVA\Klassid\video_järgi> java App

Spordiala: Kettaheide
Parim aavutus: London MM KULD

Nimi: Oscar August Heinla
Vanus: 24
Rahvus: Eestlane
*/