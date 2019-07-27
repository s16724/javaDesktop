import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Proszki extends JFrame implements ActionListener {
	
	JPanel panel;
	@SuppressWarnings("rawtypes")
	JComboBox wsadyBox;
	@SuppressWarnings("rawtypes")
	JComboBox granulatBox;
	JLabel tekst;
	JLabel tekst1;
	JLabel tekst2;
	JLabel tekst3;
	JLabel tekst4;
	JTextField iloscSmakowJT;
	JTextField iloscGranulatuJT;
	static JTextField zlecenieJT;
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GUIProszki(JPanel proszkiZak) {
		
		String[] smakiEnum= {Wsady.LF5.getNazwa(),Wsady.LF8.getNazwa()
				,Wsady.CS6.getNazwa()};
		String[] rodzajeGranulatu= {Material.CUGRANULAT.getNazwa(),
				Material.KGHMCUGRANULAT.getNazwa(),Material.AURUBISCUGRANULAT.getNazwa()};
		
		granulatBox = new JComboBox(rodzajeGranulatu);
		wsadyBox= new JComboBox(smakiEnum);
		panel=proszkiZak;
		tekst=new JLabel("Wybierz smaki:");
		tekst1=new JLabel("Iloœæ smaków[szt]:");
		tekst2=new JLabel("Iloœæ granulatu[kg]:");
		tekst3=new JLabel("Partia granulatu:");
		tekst4=new JLabel("Numer zlecena:");
		iloscSmakowJT=new JTextField(10);
		iloscGranulatuJT=new JTextField(10);
		zlecenieJT =new JTextField(10);
		
		zlecenieJT.addActionListener(this);
		iloscSmakowJT.addActionListener(this);
		iloscGranulatuJT.addActionListener(this);
		wsadyBox.addActionListener(this);
		granulatBox.addActionListener(this);
		
		panel.add(tekst);
		panel.add(wsadyBox);
		panel.add(tekst1);
		panel.add(iloscSmakowJT);
		panel.add(tekst3);
		panel.add(granulatBox);
		panel.add(tekst2);
		panel.add(iloscGranulatuJT);
		panel.add(tekst4);
		panel.add(zlecenieJT);
		add(panel);	
	
	}
	public void actionPerformed(ActionEvent evt) {
		
		Object iloscGranulatSource =evt.getSource();
		Object numerZamowieniaSource =evt.getSource();
		Object wsadySelected = wsadyBox.getSelectedItem();
		Object iloscSmakowSource =evt.getSource();
		if (iloscSmakowSource == iloscSmakowJT || iloscGranulatSource == iloscGranulatuJT
				|| numerZamowieniaSource== zlecenieJT) {
	
			String iloscSmakow =iloscSmakowJT.getText();
			String iloscGranulatu =iloscGranulatuJT.getText();
			String rodzajGranulatu=(String) granulatBox.getSelectedItem();
			String smak=(String) wsadySelected;
		
			if(iloscSmakow.equals("")) {
				iloscSmakow="0";
			}
			if(iloscGranulatu.equals("")) {
				iloscGranulatu="0";
			}
			
			switch(smak) {
				case "LF5" :
					Zlecenie runLF5=new Zlecenie();
				try {
					runLF5.smakLF5(iloscGranulatu, iloscSmakow, rodzajGranulatu);
				} catch (FileNotFoundException e) {					
					e.printStackTrace();
				}				
					break;
				case "LF8" :
					Zlecenie runLF8=new Zlecenie();
				try {
					runLF8.smakLF8(iloscGranulatu, iloscSmakow, rodzajGranulatu);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}				
					break;
				case "CS6" :
					Zlecenie runCS6= new Zlecenie();
				try {
					runCS6.smakCS6(iloscGranulatu, iloscSmakow, rodzajGranulatu);
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
					break;
					
				default:
					System.out.println("B³¹d komendy switch");
			}
		
		}
		
		else {
			// to siê nie powinno wydarzyæ ;-)
			System.out.println("B³¹d!!! To nic takiego:P!!");
		}
	}

}
