
public class Baum {
	private int durchmesser;
	private int höhe;
	
	public static String  typ(){
		return "baum";
	}
	
	public Baum(int durchm, int hoehe) {
		this.durchmesser  = durchm;
		this.höhe = hoehe;
	}
	
	public void schneiden(int param){
		this.höhe -= param;
	}
	
	public int getDruchmesser(){
		return durchmesser;
	}
}
