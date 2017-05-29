public class Kasutus{
 	
     public static void main(String[] args){
 		Car c1 = new Car("Rävala","Audi","A7","2017");
		Car c2 = new Car("Olümpia", "Mercedes","GLC","2016");
 		Car c3 = new Car("Mustamäe haigla", "Porsche","Panamera","2015");
 		Car c4 = new Car("Lennujaam", "BMW","X6","2014");
 		
 		Car[] Cars = new Car[4];
 		Cars[0] = c1;
 		Cars[1] = c2;
 		Cars[2] = c3;
 		Cars[3] = c4;
 		
 		for(Car c: Cars){
 		System.out.println("Auto: "+c.nimi+", "+c.autoMark+", "+c.mudel+", "+c.aasta);
 		}
 	}
 } 