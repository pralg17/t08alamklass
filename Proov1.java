public class Proov1{
	public static void main(String[] args){
	Puu[] puud = new Puu[4];
		puud[0] = new Kuusk("Harilik kuusk", "Picea abies", "kuni 30 m");
		puud[1]  = new Vaher("M2givaher", "Acer pseudoplatanus", "12-25 m");
		puud[2]  = new Pirn("Harilik pirnipuu", "Pyrus communis 'Kadi'", "kuni 20 m");
		puud[3]  = new Kuusk("Must kuusk", "Picea mariana", "10 m");
		((Pirn)puud[2]).vili = "Vili punane. Viljaliha mahlane ja magus.";
		((Pirn)puud[2]).sort = "Sygissort";
		
		for(int i = 0; i < puud.length; i++){
			System.out.println(puud[i].misTyyp() + ": " + puud[i].nimetus + ", " + puud[i].ladinaKeeles +
			                   " k6rgus: " + puud[i].k6rgus);
			if((puud[i].misTyyp()).equals("Viljapuu")){
				System.out.println("  Kirjeldus: " + ((Viljapuu)puud[i]).sort + ", " + ((Viljapuu)puud[i]).vili);
			}
		}
		System.out.println();
		System.out.println("Puid kokku: " + Puu.puudeArv + ", okaspuid: " + Okaspuu.okaspuudeArv + 
		      " ja lehtpuid: " + Lehtpuu.lehtpuudeArv + ", neist viljapuid: " + Viljapuu.viljapuudeArv);
	}
}

/*

[karinrik@greeny t08alamklass]$ java Proov1
Okaspuu: Harilik kuusk, Picea abies k6rgus: kuni 30 m
Lehtpuu: M2givaher, Acer pseudoplatanus k6rgus: 12-25 m
Viljapuu: Harilik pirnipuu, Pyrus communis 'Kadi' k6rgus: kuni 20 m
  Kirjeldus: Sygissort, Vili punane. Viljaliha mahlane ja magus.
Okaspuu: Must kuusk, Picea mariana k6rgus: 10 m

Puid kokku: 4, okaspuid: 2 ja lehtpuid: 2, neist viljapuid: 1

*/