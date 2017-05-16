import java.util.*;
public class ring extends klass{
	double raadius;
	
	public ring(double raadius){
		this.raadius=raadius;
	}
	
@Override
	public double pindala(){
		return Math.PI * Math.pow(raadius, 2);
		
	}
@Override
	public double umbermoot(){
		return 2*Math.PI*raadius;
		
	}
	
}