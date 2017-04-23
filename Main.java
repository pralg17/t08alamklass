public class Main{
	public static void main(String[] args){
		Eepika gilgames = new Eepika("Gilgames", 193, true, "Homeros");
		gilgames.misAutorOn();
		gilgames.kasOnEraamat();
		
		Dramaatika faust = new Dramaatika("Faust", 95, false, "Johann Wolfgang von Goethe");
		faust.misAutorOn();
		faust.kasOnEraamat();
		
		Lyyrika sonetid = new Lyyrika("Sonetid", 154, true, "William Shakespeare");
		sonetid.misAutorOn();
		sonetid.kasOnEraamat();
		
	}
}
