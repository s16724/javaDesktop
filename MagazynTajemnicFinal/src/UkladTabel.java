
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;


@SuppressWarnings("serial")
public class UkladTabel extends JFrame   {
	
	JPanel panel;
	JTable tabela ;
	JButton drukujButton;
	String nazwaWlewki=Material.CUWLEWKI.getNazwa();
	int idWlewki=Material.CUWLEWKI.getId();
	String nazwaOlow=Material.OLOW.getNazwa();
	int idOlow=Material.OLOW.getId();
	String nazwaCyna=Material.CYNA.getNazwa();
	int idCyna=Material.CYNA.getId();
	String nazwaCup15=Material.CUP15.getNazwa();
	int idCup15=Material.CUP15.getId();
	String nazwaBizmut=Material.BIZMUT.getNazwa();
	int idBizmut=Material.BIZMUT.getId();
	String nazwaNikiel=Material.NIKIEL.getNazwa();
	int idNikiel=Material.NIKIEL.getId();
	int idGranulat;
	String empty="   ";
	Object[][] wiersze;
	String[] kolumny;
	
	
	public JTable jesliGranualt(double cuWlewkiKg, double olowKg, double cynaKg, double cup15Kg) 
			throws FileNotFoundException  {
		
		Object[][] wiersze={
				
				{new Integer(1),nazwaWlewki,idWlewki,odczytajPlik(nazwaWlewki),cuWlewkiKg,null},
				{new Integer(2),nazwaOlow,idOlow,odczytajPlik(nazwaOlow),olowKg,null},
				{new Integer(3),nazwaCyna,idCyna,odczytajPlik(nazwaCyna),cynaKg,null},
				{new Integer(4),nazwaCup15,idCup15,odczytajPlik(nazwaCup15),cup15Kg,null},
				{new Integer(5),empty,empty,empty,empty,empty},
				{new Integer(6),empty,empty,empty,empty,empty},
				{new Integer(7),empty,empty,empty,empty,empty},
				{new Integer(8),empty,empty,empty,empty,empty},
				{new Integer(9),empty,empty,empty,empty,empty},
				{new Integer(10),empty,empty,empty,empty,empty},
				{new Integer(11),empty,empty,empty,empty,empty},
		};
	
		String[] kolumny =
			{
	    		"Lp.", "Nazwa materia³u", "Nr.Sap", "Partia", "Waga","Uwagi"
			};
		
		tabela=new JTable(wiersze,kolumny);
		
		return tabela;
	}
	public JTable jesliElse(double cuGranulatKg, double cuWlewkiKg, double olowKg, double cynaKg, double cup15Kg, String rodzajGranulatu) throws FileNotFoundException {

		getCuId(rodzajGranulatu);
		
		
		Object[][] wiersze={
				{new Integer(1),rodzajGranulatu,idGranulat,odczytajPlik(rodzajGranulatu),cuGranulatKg,null},
				{new Integer(2),nazwaWlewki,idWlewki,odczytajPlik(nazwaWlewki),cuWlewkiKg,null},
				{new Integer(3),nazwaOlow,idOlow,odczytajPlik(nazwaOlow),olowKg,null},
				{new Integer(4),nazwaCyna,idCyna,odczytajPlik(nazwaCyna),cynaKg,null},
				{new Integer(5),nazwaCup15,idCup15,odczytajPlik(nazwaCup15),cup15Kg,null},
				{new Integer(6),empty,empty,empty,empty,empty},
				{new Integer(7),empty,empty,empty,empty,empty},
				{new Integer(8),empty,empty,empty,empty,empty},
				{new Integer(9),empty,empty,empty,empty,empty},
				{new Integer(10),empty,empty,empty,empty,empty},
				{new Integer(11),empty,empty,empty,empty,empty},

	
		};
	
		String[] kolumny =
			{
	    		"Lp.", "Nazwa materia³u", "Nr.Sap", "Partia", "Waga","Uwagi"
			};
		
		tabela=new JTable(wiersze,kolumny);
		
		return tabela;
		
	}
	public JTable jesliWlewki(double cuGranulatKg, double cuWlewkiKg, double olowKg, double cynaKg, double cup15Kg,
			String rodzajGranulatu) throws FileNotFoundException {
		
		getCuId(rodzajGranulatu);
		Object[][] wiersze={
				{new Integer(1),rodzajGranulatu,idGranulat,odczytajPlik(rodzajGranulatu),cuGranulatKg,null},
				{new Integer(2),nazwaOlow,idOlow,odczytajPlik(nazwaOlow),olowKg,null},
				{new Integer(3),nazwaCyna,idCyna,odczytajPlik(nazwaCyna),cynaKg,null},
				{new Integer(4),nazwaCup15,idCup15,odczytajPlik(nazwaCup15),cup15Kg,null},
				{new Integer(5),empty,empty,empty,empty,empty},
				{new Integer(6),empty,empty,empty,empty,empty},
				{new Integer(7),empty,empty,empty,empty,empty},
				{new Integer(8),empty,empty,empty,empty,empty},
				{new Integer(9),empty,empty,empty,empty,empty},
				{new Integer(10),empty,empty,empty,empty,empty},
				{new Integer(11),empty,empty,empty,empty,empty},
		};
	
		String[] kolumny =
			{
	    		"Lp.", "Nazwa materia³u", "Nr.Sap", "Partia", "Waga","Uwagi"
			};
		
		tabela=new JTable(wiersze,kolumny);
		
		return tabela;
		
	}
	public JTable jesliOlow(double cuGranulatKg, double cuWlewkiKg, double cynaKg, double cup15Kg,
			String rodzajGranulatu) throws FileNotFoundException {
	
		getCuId(rodzajGranulatu);		
		Object[][] wiersze={
				{new Integer(1),rodzajGranulatu,idGranulat,odczytajPlik(rodzajGranulatu),cuGranulatKg,null},
				{new Integer(2),nazwaWlewki,idWlewki,odczytajPlik(nazwaWlewki),cuWlewkiKg,null},
				{new Integer(3),nazwaCyna,idCyna,odczytajPlik(nazwaCyna),cynaKg,null},
				{new Integer(4),nazwaCup15,idCup15,odczytajPlik(nazwaCup15),cup15Kg,null},
				{new Integer(5),empty,empty,empty,empty,empty},
				{new Integer(6),empty,empty,empty,empty,empty},
				{new Integer(7),empty,empty,empty,empty,empty},
				{new Integer(8),empty,empty,empty,empty,empty},
				{new Integer(9),empty,empty,empty,empty,empty},
				{new Integer(10),empty,empty,empty,empty,empty},
				{new Integer(11),empty,empty,empty,empty,empty},
	
		};
	
		String[] kolumny =
			{
	    		"Lp.", "Nazwa materia³u", "Nr.Sap", "Partia", "Waga","Uwagi"
			};
		
		tabela=new JTable(wiersze,kolumny);		
		return tabela;
	}		
	public JTable jesliNikiel(double cuGranulatKg, double cynaKg, double bizmutKg, double cup15Kg, String rodzajGranulatu)
			throws FileNotFoundException {
		
		getCuId(rodzajGranulatu);		
		Object[][] wiersze={
				{new Integer(1),rodzajGranulatu,idGranulat,odczytajPlik(rodzajGranulatu),cuGranulatKg,null},				
				{new Integer(3),nazwaCyna,idCyna,odczytajPlik(nazwaCyna),cynaKg,null},
				{new Integer(3),nazwaBizmut,idBizmut,odczytajPlik(nazwaBizmut),bizmutKg,null},
				{new Integer(4),nazwaCup15,idCup15,odczytajPlik(nazwaCup15),cup15Kg,null},
				{new Integer(5),empty,empty,empty,empty,empty},
				{new Integer(6),empty,empty,empty,empty,empty},
				{new Integer(7),empty,empty,empty,empty,empty},
				{new Integer(8),empty,empty,empty,empty,empty},
				{new Integer(9),empty,empty,empty,empty,empty},
				{new Integer(10),empty,empty,empty,empty,empty},
				{new Integer(11),empty,empty,empty,empty,empty},
	
		};
	
		String[] kolumny =
			{
	    		"Lp.", "Nazwa materia³u", "Nr.Sap", "Partia", "Waga","Uwagi"
			};
		
		tabela=new JTable(wiersze,kolumny);
		
		return tabela;
	}
	public JTable jesliBizmut(double cuGranulatKg, double cynaKg, double nikielKg, double cup15Kg,
			String rodzajGranulatu) throws FileNotFoundException {
	
		getCuId(rodzajGranulatu);		
		Object[][] wiersze={
				{new Integer(1),rodzajGranulatu,idGranulat,odczytajPlik(rodzajGranulatu),cuGranulatKg,null},				
				{new Integer(3),nazwaCyna,idCyna,odczytajPlik(nazwaCyna),cynaKg,null},
				{new Integer(3),nazwaNikiel,idNikiel,odczytajPlik(nazwaNikiel),nikielKg,null},
				{new Integer(4),nazwaCup15,idCup15,odczytajPlik(nazwaCup15),cup15Kg,null},
				{new Integer(5),empty,empty,empty,empty,empty},
				{new Integer(6),empty,empty,empty,empty,empty},
				{new Integer(7),empty,empty,empty,empty,empty},
				{new Integer(8),empty,empty,empty,empty,empty},
				{new Integer(9),empty,empty,empty,empty,empty},
				{new Integer(10),empty,empty,empty,empty,empty},
				{new Integer(11),empty,empty,empty,empty,empty},
		};
	
		String[] kolumny =
			{
	    		"Lp.", "Nazwa materia³u", "Nr.Sap", "Partia", "Waga","Uwagi"
			};
		
		tabela=new JTable(wiersze,kolumny);
		
		return tabela;
	}

	
	public int getCuId(String rodzajGranulatu){
		if(rodzajGranulatu.equals(Material.CUGRANULAT.getNazwa())) {
			idGranulat=Material.CUGRANULAT.getId();
		}
		else if(rodzajGranulatu.equals(Material.KGHMCUGRANULAT.getNazwa())) {
			idGranulat=Material.KGHMCUGRANULAT.getId();
		}
		else if(rodzajGranulatu.equals(Material.AURUBISCUGRANULAT.getNazwa())) {
			idGranulat=Material.AURUBISCUGRANULAT.getId();
		}
		return idGranulat;
	}


public String odczytajPlik(String nazwaPliku) throws FileNotFoundException {
	boolean file=czyPlikIstnieje(nazwaPliku+".txt");
	if(file==true) {
	File plikDane = new File(nazwaPliku+".txt");
	String odczyt = "";
	@SuppressWarnings("resource")
	Scanner skaner = new Scanner(plikDane);
	odczyt=skaner.nextLine();
	return odczyt;	
	}
	else {
		JOptionPane.showMessageDialog(null, "Brakuje pliku zawieraj¹cego wytop!!" );
		return "Brak wytopu";
	}
 }
	private static boolean czyPlikIstnieje(String nazwaPliku) {
       
        File f = new File(nazwaPliku);
        return f.exists() && f.isFile();
    
 	}

	
}
