import java.util.*;

public abstract class Tekstid{
	List<String> tekstid = new ArrayList<String>();
	public void lisa(String tekst){
		tekstid.add(tekst);
	}
	
	public abstract int TekstiOmadus(String tekst);	
	public int KuiPikk(){
		int vastus = tekstid.size();
		for(int i=0; i<tekstid.size(); i++){
			vastus=TekstiOmadus(tekstid.get(i));
		}
		return vastus;
	}
	
	public int MituA(){
		int paljuA = 0;
		for (int i = 0; i < tekstid.size(); i++) {
			String s = tekstid.get(i);
			for(int koht=0; koht<s.length(); koht++){
				//Ei otsi suuri tähti
				if (s.charAt(koht) == 'a') {
					paljuA++;
				}
			} 
		}
		return paljuA;
	}
	
	public int MituM(){
		int paljuM = 0;
		for (int i = 0; i < tekstid.size(); i++) {
			String s = tekstid.get(i);
			for(int koht=0; koht<s.length(); koht++){
				//Ei otsi suuri tähti
				if (s.charAt(koht) == 'm') {
					paljuM++;
				}
			} 
		}
		return paljuM;
	}
	
	public int Protsent(){
		int kokkuTähed = KuiPikk();
		int kokkuA = MituA();
		int paljuPunkt = 0;
		
		for (int i = 0; i < tekstid.size(); i++) {
			String s = tekstid.get(i);
			for(int koht=0; koht<s.length(); koht++){
				if (s.charAt(koht) == '.') {
					paljuPunkt++;
				}
			} 
		}
		
		int kokku = kokkuTähed - paljuPunkt;
		int vastus = ((kokkuA * 100) / kokku);
		return vastus;
	}
	
	
}