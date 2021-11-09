package opg4;

public class Tidspunkt extends Bestilling {
	
	private String dato;
	private String tidspunkt;

	public Tidspunkt(String kundenavn, int kontaktnummer, String adresse, String dato, String tidspunkt) {
		super(kundenavn, kontaktnummer, adresse);
		this.dato = dato;
		this.tidspunkt = tidspunkt;
	}

	public void skrivUt() {
		
	}
}
