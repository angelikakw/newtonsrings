package NewtonRings;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Configurations extends JPanel {
	JLabel label;
	
	private JButton
	b1 = new JButton("Zapisz obrazek"),
	b2 = new JButton("Rysuj pr¹¿ki"),
	b3 = new JButton("Zakoñcz");

	private JComboBox<String> osrodki = new JComboBox<String>();
	
	private JComboBox<String> jezyki = new JComboBox<String>();
	
	private JSlider okregi = new JSlider(1,30,10);
	private JTextField textField = new JTextField(10);
	
	private JSlider fala = new JSlider(1,2000,1500);
	private JTextField textField2= new JTextField(10);
	
	
	
	public Configurations() {
		this.setPreferredSize(new Dimension(1280, -500));
		
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		
		osrodki.setEditable(true);
		osrodki.addItem("Wybierz oœrodek");
		osrodki.addItem("Powietrze");
		osrodki.addItem("Szk³o");
		osrodki.addItem("Woda");
		add(osrodki);
		
		jezyki.setEditable(true);
		jezyki.addItem("Wybierz jezyk");
		jezyki.addItem("Polski");
		jezyki.addItem("Angielski");
		jezyki.addItem("Niemiecki");
		jezyki.addItem("W³oski");
		jezyki.addItem("Szwedzki");
		add(jezyki);
			
		okregi.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println("Slider1: " + okregi.getValue());
				JSlider source= (JSlider) e.getSource();
				textField.setText(""+source.getValue());
			}
		});
				 	
		okregi.setMajorTickSpacing(4);
		okregi.setMinorTickSpacing(1);
		okregi.setPaintTicks(true);
		okregi.setPaintLabels(true);		  
	
		add(textField);
		add(okregi);
		
		fala.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println("Slider2: " + fala.getValue());
				JSlider source= (JSlider) e.getSource();
				textField2.setText(""+source.getValue());
			}
		});
		 	
		fala.setMajorTickSpacing(500);
		fala.setMinorTickSpacing(10);
		fala.setPaintTicks(true);
		fala.setPaintLabels(true);
		     
		add(textField2);
		add(fala);
		
	}
	
}
