package opg4;

public class SnarestMulig extends Bestilling {
	
	private int maxtid;

	
	public SnarestMulig(String kundenavn, int kontaktnummer, String adresse, int maxtid) {
		super(kundenavn, kontaktnummer, adresse);
		this.maxtid = maxtid;
		
	}


	public void skrivUt() {
		
	}
}
