import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Lana  extends JFrame implements ActionListener {
	
	
	
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
	JTextField iloscWsadowJT;
	JTextField iloscGranulatuJT;
	static JTextField zlecenieJT;
	

	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void GUILana(JPanel lanaZak) {

		String[] wsadyEnum= {Wsady.B122V.getNazwa(),Wsady.B122V_B1010.getNazwa()
				,Wsady.B1010V.getNazwa(),Wsady.B1010V_B322V.getNazwa(),Wsady.B322V.getNazwa()
				,Wsady.B322V_B122V.getNazwa()};
		String[] rodzajeGranulatu= {Material.CUGRANULAT.getNazwa(),
				Material.KGHMCUGRANULAT.getNazwa(),Material.AURUBISCUGRANULAT.getNazwa()};
		
		granulatBox = new JComboBox(rodzajeGranulatu);
		wsadyBox= new JComboBox(wsadyEnum);
		panel=lanaZak;
		tekst=new JLabel("Wybierz wsady:");
		tekst1=new JLabel("Iloœæ wsadów[szt]:");
		tekst2=new JLabel("Iloœæ granulatu[kg]:");
		tekst3=new JLabel("Partia granulatu:");
		tekst4=new JLabel("Numer zlecena:");
		iloscWsadowJT=new JTextField(10);
		iloscGranulatuJT=new JTextField(10);
		zlecenieJT =new JTextField(10);
		
		zlecenieJT.addActionListener(this);
		wsadyBox.addActionListener(this);
		granulatBox.addActionListener(this);
		iloscWsadowJT.addActionListener(this);
		iloscGranulatuJT.addActionListener(this);		
		
		panel.add(tekst);
		panel.add(wsadyBox);
		panel.add(tekst1);
		panel.add(iloscWsadowJT);
		panel.add(tekst3);
		panel.add(granulatBox);
		panel.add(tekst2);
		panel.add(iloscGranulatuJT);
		panel.add(tekst4);
		panel.add(zlecenieJT);
		add(panel);	
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent evt){
		
		Object granulatSource=evt.getSource();
		Object wsadySource=evt.getSource();
		Object wsadySelected = wsadyBox.getSelectedItem();
		Object granulatSelected = granulatBox.getSelectedItem();
		Object numerZamowieniaSource=evt.getSource();
		
		if (wsadySource == iloscWsadowJT || granulatSource == iloscGranulatuJT || 
				numerZamowieniaSource== zlecenieJT)  {
			String iloscWsadu =iloscWsadowJT.getText(); 
			String iloscGranulatu =iloscGranulatuJT.getText();
			String rodzajGranulatu=(String) granulatSelected;
			String wsad=(String) wsadySelected;
			
			if(iloscWsadu.equals("")) {
				iloscWsadu="0";
			}
			if(iloscGranulatu.equals("")) {
				iloscGranulatu="0";
			}
			
			switch(wsad) {
			case "B122V" :
				Zlecenie run122=new Zlecenie();
				try {
					run122.WsadB122V(iloscGranulatu, iloscWsadu, rodzajGranulatu);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case "B122/B1010" :
				Zlecenie run122_1010=new Zlecenie();
				try {
					run122_1010.WsadB122V_B1010V(iloscGranulatu, iloscWsadu, rodzajGranulatu);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case "B1010V" :
				Zlecenie run1010=new Zlecenie();
				try {
					run1010.WsadB1010V(iloscGranulatu, iloscWsadu,rodzajGranulatu);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case "B1010V/B322V" :
				Zlecenie run1010_322=new Zlecenie();
				try {
					run1010_322.WsadB1010V_B322V(iloscGranulatu, iloscWsadu,rodzajGranulatu);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case "B322V" :
				Zlecenie run322=new Zlecenie();
				try {
					run322.WsadB322V(iloscGranulatu, iloscWsadu,rodzajGranulatu);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case "B322/B122V" :
				Zlecenie run322_122=new Zlecenie();
				try {
					run322_122.WsadB322V_B122V(iloscGranulatu, iloscWsadu,rodzajGranulatu);
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
