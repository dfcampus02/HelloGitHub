
public class Baum {
	private int durchmesser;
	private int h�he;
	
	public static String  typ(){
		return "baum";
	}
	
	public Baum(int durchm, int hoehe) {
		this.durchmesser  = durchm;
		this.h�he = hoehe;
	}
	
	public void schneiden(int param){
		this.h�he -= param;
	}
	
	public int getDruchmesser(){
		return durchmesser;
	}
}
