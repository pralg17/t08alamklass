public class Proov1{
  public static void main(String[] args){
    Autod auto1=new Autod();
 		auto1.mark="Mazda";
 		auto1.mudel="626";

    Autod auto2=new Autod();
    auto2.mark="Peugeot";
    auto2.mudel="405";

    Autod auto3=new Autod();
    auto3.mark="Ford";
    auto3.mudel="Sierra";

 		AutodEsinduses auto4=new AutodEsinduses();
 		auto4.mark="Toyota";
 		auto4.mudel="Yaris";
 		auto4.esindus="Elke Auto AS";

    AutodEsinduses auto5=new AutodEsinduses();
    auto5.mark="Škoda";
    auto5.mudel="Yeti";
    auto5.esindus="Moller Auto OÜ";

 		Autod[] autod=new Autod[5];
 		autod[0]=auto1;
 		autod[1]=auto2;
 		autod[2]=auto3;
    autod[3]=auto4;
    autod[4]=auto5;

 		for(Autod auto: autod){
 				System.out.println(auto.mark+" "+auto.mudel);
 				if(auto instanceof AutodEsinduses){
 					AutodEsinduses esinduses=(AutodEsinduses)auto;
 					System.out.println("-"+esinduses.esindus);
 	      }
 	  }
 }
}
/*
[taankomm@greeny t08alamklass]$ java Proov1
Mazda 626
Peugeot 405
Ford Sierra
Toyota Yaris
-Elke Auto AS
Škoda Yeti
-Moller Auto OÜ
*/
