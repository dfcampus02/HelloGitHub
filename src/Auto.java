
public class Auto {
	
	private String modell;
	private double preis;
	
	public Auto(){
	
	}
	
	public Auto(String modell, double preis){
		this.modell = modell;
		this.preis = preis;
	}
	
	public Auto(String modell){
		this.modell = modell;
		this.preis = 0;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		if(modell != ""){
			this.modell = modell;
		}else{
			this.modell = "default";
		}
		
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}


}
