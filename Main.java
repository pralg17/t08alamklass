public class Main{
    public static void main(String[] args){
        Album a1 = new Album("Mark ", "Valjak ", 1996, "mees");
        Album a2 = new Album("Katlin ", "Rebane ", 1997, "naine");

        Album[] Albums = new Album[2];
        Albums[0] = a1;
        Albums[1] = a2;

        for(Album p: Albums){
		System.out.println("nimi: " + p.name + p.perekonnanimi);
		System.out.println("vanus: " + p.synniaasta);
		System.out.println("sugu: " + p.sugu);
		System.out.println("");
        }
    }
}
