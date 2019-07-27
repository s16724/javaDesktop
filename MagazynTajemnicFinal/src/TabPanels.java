
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class TabPanels extends JFrame {
	
	public TabPanels(){
	 super("Zak³adki");
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setSize(200,330);
	 JPanel przyjmijZak=new JPanel();
	 JPanel lanaZak=new JPanel();
	 JPanel proszkiZak=new JPanel();
	 JTabbedPane tabs= new JTabbedPane();
	 WpiszWytop wytop = new WpiszWytop();
	 wytop.GUIPrzyjmij(przyjmijZak);
	 Lana lana= new Lana();
	 lana.GUILana(lanaZak);
	 Proszki proszki=new Proszki();
	 proszki.GUIProszki(proszkiZak);
	 tabs.addTab("Wytop", przyjmijZak);
	 tabs.addTab("Lana", lanaZak);
	 tabs.addTab("Proszki", proszkiZak);
	 add(tabs);
	 setVisible(true);
	}


}
