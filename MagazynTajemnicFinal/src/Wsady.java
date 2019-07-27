

public enum Wsady {
	B122V("B122V"), B122V_B1010("B122/B1010"), B1010V("B1010V"),
	B1010V_B322V("B1010V/B322V"),B322V_B122V("B322/B122V"),
	B322V("B322V"), LF5("LF5"), LF8("LF8"), CS6("CS6");
	
	private String nazwa;
	
	
	Wsady(String nazwa){
		this.nazwa=nazwa;
		
	}
	

	public String getNazwa() {
		return nazwa;
	}
	
}
