import java.util.Scanner;

public class Main {
    public static Soidukipark soidukipark; 

    public static void main(String[] args) {
        soidukipark = new Soidukipark();
        
        Scanner scanner = new Scanner(System.in);
        String küsimus = "";

        while (!küsimus.equals("e")) {
            System.out.println("\nVali kasutus:");
            System.out.println("1: Kuva sõidukiparki");
            System.out.println("2: Lisa sõiduk parki");
            System.out.println("3: Muuda sõidukit");
            System.out.println("4: Kustuta sõiduk pargist");
            System.out.println("e: Välju süsteemist.");

            küsimus = scanner.nextLine();

            switch (küsimus) {
                case "1" :
                    soidukipark.prindiPargiSisu();
                    break;
                case "2" :
                    lisaSõidukParki();
                    break;
                case "3" :
                    muudaSõidukit();
                    break;
                case "4" :
                    kustutaSõiduk();
                    break;
             }
        }
    }

    public static void lisaSõidukParki() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta mudel:");
        String mudel = scanner.nextLine();

        System.out.println("Sisesta kubatuur:");
        String kubatuur = scanner.nextLine();
        System.out.println(mudel + " " + kubatuur);
        Soiduk mingiSuvalineVärgens = new Auto(mudel, kubatuur);
        soidukipark.lisaSoiduk(mingiSuvalineVärgens);
    }

    public static void muudaSõidukit() {
        Scanner scanner = new Scanner(System.in);
        soidukipark.prindiPargiSisu();

        System.out.println("\nVali Sõiduk, mida muuta:");
        int positsioon = Integer.parseInt(scanner.nextLine());

        System.out.println("Uus väärtus: ");

        String uusVäärtus = scanner.nextLine();
        soidukipark.muudaSoidukit(positsioon, uusVäärtus);
    }

    public static void kustutaSõiduk() {
        Scanner scanner = new Scanner(System.in);
        soidukipark.prindiPargiSisu();
        System.out.println("\nVali Sõiduk, mida kustutada:");
        soidukipark.kustutaSoiduk(scanner.nextInt());
    }
    
}

/*

Vali kasutus:
1: Kuva sõidukiparki
2: Lisa sõiduk parki
3: Muuda sõidukit
4: Kustuta sõiduk pargist
e: Välju süsteemist.
2
Sisesta mudel:
nissan
Sisesta kubatuur:
34
nissan 34

Vali kasutus:
1: Kuva sõidukiparki
2: Lisa sõiduk parki
3: Muuda sõidukit
4: Kustuta sõiduk pargist
e: Välju süsteemist.
1
0 Auto Audi | 2.5T | Paagi seis: 100%
1 Auto BMW | Paagi seis: 100%
2 Auto Audi | 3.0TDI | Paagi seis: 100%
3 Auto VW | 1.8 | Paagi seis: 100%
4 Auto nissan | 34 | Paagi seis: 100%

Vali kasutus:
1: Kuva sõidukiparki
2: Lisa sõiduk parki
3: Muuda sõidukit
4: Kustuta sõiduk pargist
e: Välju süsteemist.
3
0 Auto Audi | 2.5T | Paagi seis: 100%
1 Auto BMW | Paagi seis: 100%
2 Auto Audi | 3.0TDI | Paagi seis: 100%
3 Auto VW | 1.8 | Paagi seis: 100%
4 Auto nissan | 34 | Paagi seis: 100%

Vali Sõiduk, mida muuta:
1
Uus väärtus:
40

Vali kasutus:
1: Kuva sõidukiparki
2: Lisa sõiduk parki
3: Muuda sõidukit
4: Kustuta sõiduk pargist
e: Välju süsteemist.
1
0 Auto Audi | 2.5T | Paagi seis: 100%
1 Auto BMW | Paagi seis: 40%
2 Auto Audi | 3.0TDI | Paagi seis: 100%
3 Auto VW | 1.8 | Paagi seis: 100%
4 Auto nissan | 34 | Paagi seis: 100%

Vali kasutus:
1: Kuva sõidukiparki
2: Lisa sõiduk parki
3: Muuda sõidukit
4: Kustuta sõiduk pargist
e: Välju süsteemist.
4
0 Auto Audi | 2.5T | Paagi seis: 100%
1 Auto BMW | Paagi seis: 40%
2 Auto Audi | 3.0TDI | Paagi seis: 100%
3 Auto VW | 1.8 | Paagi seis: 100%
4 Auto nissan | 34 | Paagi seis: 100%

Vali Sõiduk, mida kustutada:
3

Vali kasutus:
1: Kuva sõidukiparki
2: Lisa sõiduk parki
3: Muuda sõidukit
4: Kustuta sõiduk pargist
e: Välju süsteemist.
1
0 Auto Audi | 2.5T | Paagi seis: 100%
1 Auto BMW | Paagi seis: 40%
2 Auto Audi | 3.0TDI | Paagi seis: 100%
3 Auto nissan | 34 | Paagi seis: 100%


*/