import java.lang.Math;

public class NthRoot {
	private double nroot;
	private double number;
	
	public NthRoot(){
		
	}
	
	public NthRoot(double n, double r){
		number = n;
		nroot = r;
	}
	
	public void setRoot(double r){
		nroot = r;
	}
	
	public void setNumber(double n){
		number = n;
	}
	
	public double Calculate(){
		return Math.pow(Math.exp (1/nroot),Math.log(number));
	}
}
