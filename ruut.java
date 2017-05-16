import java.util.*;
public class ruut extends klass{
	double kylg;
	
	public ruut(double kylg){
		this.kylg=kylg;
	}
	
@Override
	public double pindala(){
		return Math.pow(kylg, 2);
		
	}
@Override
	public double umbermoot(){
		return 4*kylg;
		
	}
	
}