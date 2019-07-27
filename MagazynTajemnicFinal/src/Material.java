

public enum Material {
	BIZMUT(1209901,"Bizmut"),
	CUGRANULAT(1201923,"Cu granulat"),
	KGHMCUGRANULAT(1208579,"Cu granulat KGHM"),
	AURUBISCUGRANULAT(1208120,"Cu granulat Aurubis"),
	CUP15(1204963,"CuP15"),
	CUWLEWKI(1209048,"Cu wlewki"),
	CYNA(1208456,"Cyna Sn"),
	NIKIEL(1203083,"Nikiel dyski"),
	OLOW(1201928,"O³ów Pb");
	
	private int id;
	private String nazwa;
	
	Material(int id,String nazwa) {
		this.id=id;
		this.nazwa=nazwa;
	}
	public int getId() {
		return id;
	}
	public String getNazwa() {
		return nazwa;
	}	
}
