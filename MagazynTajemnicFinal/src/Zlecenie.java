import java.io.FileNotFoundException;
import java.text.NumberFormat;

public class Zlecenie {
	
	private double cynaKg;
	private double olowKg;
	private double cup15Kg;
	private double bizmutKg;
	private double cuWlewkiKg;
	private float nikielKg;

	public void WsadB122V(String iloscGranulatu, String iloscWsadu, String rodzajGranulatu) throws FileNotFoundException{
		
		int liczbaSztuk=Integer.parseInt(iloscWsadu);
		double cuGranulatKg=Double.parseDouble(iloscGranulatu);
		cuWlewkiKg=(537*(double)liczbaSztuk)-cuGranulatKg;
		olowKg=147*liczbaSztuk;
		cynaKg=14*liczbaSztuk;
		cup15Kg= 2.5*liczbaSztuk;
		Tabelka t = new Tabelka();
		t.RysujTabelkeLana( cuWlewkiKg, olowKg, cynaKg, cup15Kg, cuGranulatKg, rodzajGranulatu);
	}

	public void WsadB122V_B1010V(String iloscGranulatu, String iloscWsadu,String rodzajGranulatu) 
			throws FileNotFoundException {
		
		int liczbaSztuk=Integer.parseInt(iloscWsadu);
		double cuGranulatKg=Double.parseDouble(iloscGranulatu);
		cuWlewkiKg=(646*(double)liczbaSztuk)-cuGranulatKg;
		cynaKg=117*liczbaSztuk;
		cup15Kg= 2.5*liczbaSztuk;
		olowKg=0;
		Tabelka t = new Tabelka();
		t.RysujTabelkeLana( cuWlewkiKg, olowKg, cynaKg, cup15Kg, cuGranulatKg, rodzajGranulatu);
	   
	}

	public void WsadB1010V(String iloscGranulatu, String iloscWsadu, String rodzajGranulatu)
			throws FileNotFoundException {
		
		int liczbaSztuk=Integer.parseInt(iloscWsadu);
		double cuGranulatKg=Double.parseDouble(iloscGranulatu);
		cuWlewkiKg=(565*(double)liczbaSztuk)-cuGranulatKg;
		olowKg=70*liczbaSztuk;
		cynaKg=63*liczbaSztuk;
		cup15Kg= 2.5*liczbaSztuk;
		Tabelka t = new Tabelka();
		t.RysujTabelkeLana(cuWlewkiKg, olowKg, cynaKg, cup15Kg, cuGranulatKg, rodzajGranulatu);
	}

	public void WsadB1010V_B322V(String iloscGranulatu, String iloscWsadu, String rodzajGranulatu)
			throws FileNotFoundException {
		
		int liczbaSztuk=Integer.parseInt(iloscWsadu);
		double cuGranulatKg=Double.parseDouble(iloscGranulatu);
		cuWlewkiKg=(646*(double)liczbaSztuk)-cuGranulatKg;
		olowKg=210*liczbaSztuk;
		cup15Kg= 2.5*liczbaSztuk;
		cynaKg=0;
		Tabelka t = new Tabelka();
		t.RysujTabelkeLana( cuWlewkiKg, olowKg, cynaKg, cup15Kg, cuGranulatKg, rodzajGranulatu);
		
	}

	public void WsadB322V(String iloscGranulatu, String iloscWsadu, String rodzajGranulatu) 
			throws FileNotFoundException {
		
		int liczbaSztuk=Integer.parseInt(iloscWsadu);
		double cuGranulatKg=Double.parseDouble(iloscGranulatu);
		cuWlewkiKg=(552*(double)liczbaSztuk)-cuGranulatKg;
		olowKg=125*liczbaSztuk;
		cynaKg=21*liczbaSztuk;
		cup15Kg= 2.5*liczbaSztuk;
		Tabelka t = new Tabelka();
		t.RysujTabelkeLana( cuWlewkiKg, olowKg, cynaKg, cup15Kg, cuGranulatKg, rodzajGranulatu);
	}

	public void WsadB322V_B122V(String iloscGranulatu, String iloscWsadu, String rodzajGranulatu)
			throws FileNotFoundException {
		
		int liczbaSztuk=Integer.parseInt(iloscWsadu);
		double cuGranulatKg=Double.parseDouble(iloscGranulatu);
		cuWlewkiKg=(538*(double)liczbaSztuk)-cuGranulatKg;
		olowKg=160*liczbaSztuk;
		cup15Kg= 2.5*liczbaSztuk;
		cynaKg=0;
		Tabelka t = new Tabelka();
		t.RysujTabelkeLana( cuWlewkiKg, olowKg, cynaKg, cup15Kg, cuGranulatKg, rodzajGranulatu);
		
	}

	public void smakLF8(String iloscGranulatu, String iloscSmakow, String rodzajGranulatu) throws FileNotFoundException {
		
		
		NumberFormat form = NumberFormat.getInstance(); 
		form.setMaximumFractionDigits(2);
		float liczbaSztuk=Float.parseFloat(iloscSmakow);
		double cuGranulatKg=Double.parseDouble(iloscGranulatu);
		cynaKg=44*liczbaSztuk;
		nikielKg=(float) (5.3* liczbaSztuk);
		bizmutKg=0;
		cup15Kg=1.7*(double)liczbaSztuk;
		Tabelka t = new Tabelka();
		t.RysujTabelkeProszki(cuGranulatKg,cynaKg,nikielKg,bizmutKg,cup15Kg,rodzajGranulatu);
		System.out.println("Cyna ="+cynaKg+"\n"+
		"nikiel= "+nikielKg+"\n"+
		"bizmut = "+bizmutKg+"\n"+
		"cup15= "+cup15Kg+"\n");
	}

	public void smakLF5(String iloscGranulatu, String iloscSmakow, String rodzajGranulatu) throws FileNotFoundException {

		double liczbaSztuk=Double.parseDouble(iloscSmakow);
		double cuGranulatKg=Double.parseDouble(iloscGranulatu);
		cynaKg=61.7*liczbaSztuk;
		nikielKg=0;
		bizmutKg=19.3*liczbaSztuk;
		cup15Kg=3*liczbaSztuk;
		Tabelka t = new Tabelka();
		t.RysujTabelkeProszki(cuGranulatKg,cynaKg,nikielKg,bizmutKg,cup15Kg,rodzajGranulatu);
	}
	public void smakCS6(String iloscGranulatu, String iloscSmakow, String rodzajGranulatu) throws FileNotFoundException {
		int liczbaSztuk=Integer.parseInt(iloscSmakow);
		double cuGranulatKg=Double.parseDouble(iloscGranulatu);
		cynaKg=35*liczbaSztuk;
		nikielKg=0;
		bizmutKg=19.3*(double)liczbaSztuk;
		cup15Kg=3*(double)liczbaSztuk;
		Tabelka t = new Tabelka();
		t.RysujTabelkeProszki(cuGranulatKg,cynaKg,nikielKg,bizmutKg,cup15Kg,rodzajGranulatu);
	}
	
}
