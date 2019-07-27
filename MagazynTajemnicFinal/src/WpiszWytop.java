

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class WpiszWytop extends JFrame implements ActionListener{
	
	JPanel panel;
	JLabel tekst;
	JLabel tekst1;
	@SuppressWarnings("rawtypes")
	JComboBox wytopBox;
	JTextField field;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void GUIPrzyjmij(JPanel przyjmijZak) {
	
	String[] formats= {Material.CUGRANULAT.getNazwa(),Material.KGHMCUGRANULAT.getNazwa(),
			Material.CUWLEWKI.getNazwa(),Material.AURUBISCUGRANULAT.getNazwa(),
			Material.OLOW.getNazwa(),Material.NIKIEL.getNazwa(),
			Material.CUP15.getNazwa(),Material.CYNA.getNazwa(),Material.BIZMUT.getNazwa()};
	
	
	wytopBox= new JComboBox(formats);
	panel=przyjmijZak;
	tekst=new JLabel("Wybierz materia³:");
	tekst1=new JLabel("Podaj wytop:");
	field=new JTextField(10);
	
	field.addActionListener(this);
	wytopBox.addActionListener(this);

	panel.add(tekst);
	panel.add(wytopBox);
	panel.add(tekst1);
	panel.add(field);
	add(panel);	
}
	public void actionPerformed(ActionEvent evt) {
	Object source =evt.getSource();
	Object selected = wytopBox.getSelectedItem();
	String wytop=field.getText();
	
	
	
	if (source == field) {
		FileWriter fileWriter = null;
		String filePath=selected+".txt";
		try {
			fileWriter = new FileWriter(filePath);
			fileWriter.write(wytop);
			fileWriter.close();
			JOptionPane.showMessageDialog(null, "Partia: "+wytop+
					" zosta³a zapisana do pliku: "+selected +"!!" );
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		
	
	}
	else {
		// to siê nie powinno wydarzyæ ;-)
		System.out.println("B³¹d!!! To nic takiego:P!!");
	}
}
}
