import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTable.PrintMode;



@SuppressWarnings("serial")
public class Tabelka extends JFrame implements ActionListener   {
	
	JTable tabela ;
	JButton drukujButton;
	private String zlecenie;
	
	public void RysujTabelkeLana(double cuWlewkiKg, double olowKg, double cynaKg, double cup15Kg, double cuGranulatKg, String rodzajGranulatu) 
	 throws FileNotFoundException  {
		
	
		setTitle("Rozliczenie");
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    setSize(new Dimension(440, 250));
        JPanel okno =new JPanel();
        drukujButton=new JButton("Drukuj");
       
       
		if (cuGranulatKg==0) {
			UkladTabel t = new UkladTabel();
			tabela=t.jesliGranualt(cuWlewkiKg, olowKg, cynaKg, cup15Kg);		
		}
		else if (cuWlewkiKg==0) {
			UkladTabel t = new UkladTabel();
			tabela=t.jesliWlewki(cuGranulatKg,cuWlewkiKg, olowKg, cynaKg, cup15Kg, rodzajGranulatu);
		}
		else if (olowKg==0) {
			UkladTabel t = new UkladTabel();
			tabela=t.jesliOlow(cuGranulatKg,cuWlewkiKg, cynaKg, cup15Kg, rodzajGranulatu);
		}
		else {
			UkladTabel t =new UkladTabel();
			tabela=t.jesliElse(cuGranulatKg,cuWlewkiKg, olowKg, cynaKg, cup15Kg, rodzajGranulatu);			
		}
		tabela.getColumnModel().getColumn(0).setMaxWidth(25);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(105);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(40);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(70);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(25);
		JScrollPane scroll = new JScrollPane(tabela);
		scroll.setPreferredSize(new Dimension(420, 150));
		
		drukujButton.addActionListener(this);  
	
		okno.add(scroll);
		okno.add(drukujButton);
		add(okno);
		setVisible(true); 		
	}
	public void RysujTabelkeProszki(double cuGranulatKg, double cynaKg, double nikielKg, double bizmutKg, double cup15Kg,
			String rodzajGranulatu) throws FileNotFoundException {
		
		setTitle("Rozliczenie");
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    setSize(new Dimension(440, 250));
        JPanel okno =new JPanel();
        drukujButton=new JButton("Drukuj");
        if(nikielKg==0) {
        	UkladTabel t =new UkladTabel();
        	tabela=t.jesliNikiel(cuGranulatKg,cynaKg,bizmutKg,cup15Kg,rodzajGranulatu);
        }
        else if (bizmutKg==0) {
        	UkladTabel t =new UkladTabel();
        	tabela=t.jesliBizmut(cuGranulatKg,cynaKg,nikielKg,cup15Kg,rodzajGranulatu);
        }
        tabela.getColumnModel().getColumn(0).setMaxWidth(25);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(40);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(70);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(25);
        JScrollPane scroll = new JScrollPane(tabela);
		scroll.setPreferredSize(new Dimension(420, 150));

		drukujButton.addActionListener(this);  
	
		okno.add(scroll);
		okno.add(drukujButton);
		add(okno);
		setVisible(true); 
		
	}
	public String getDate(){
		Calendar cal = Calendar.getInstance();
        int d=cal.get(Calendar.DAY_OF_MONTH);
        int m=cal.get(Calendar.MONTH);
        int r=cal.get(Calendar.YEAR);
        String data=d+"."+(m+1)+"."+r;
        return data;
	}
	
public void actionPerformed(ActionEvent akcja) {
	
	
	if (Lana.zlecenieJT.getText().equals("")) {
		zlecenie = Proszki.zlecenieJT.getText();
		System.out.println(zlecenie);
	}
	else if (Proszki.zlecenieJT.getText().equals("")) {
		zlecenie= Lana.zlecenieJT.getText();
		System.out.println(zlecenie);
	}
	
	try {
      tabela.print(PrintMode.NORMAL,
    		  new MessageFormat("REJESTR POBRANYCH MATERIA£ÓW"),
    		  new MessageFormat("Nr zlecenia: "+zlecenie+" Data: "+getDate()+" Formularz 19a" ));
    		 
    }
	catch (Exception e) {
       System.err.println("blad");
	}
}


	
}
	