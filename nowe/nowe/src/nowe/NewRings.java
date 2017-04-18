package nowe;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class NewRings extends JFrame {

		public NewRings() throws HeadlessException 
		{
			setSize(640, 480);
			setLayout(new FlowLayout());
			JButton closeFrameButton= new JButton("Zakoncz");
			this.add(closeFrameButton);
			closeFrameButton.addActionListener(closeListener);
			
			JButton startButton= new JButton("Rysuj");
			this.add(startButton);
			startButton.setBounds(300,250,50,70);
			
			JButton imageButton= new JButton("Zapisz obrazek");
			this.add(imageButton);
			
			JLabel ramka= new JLabel("wybierz dlugosc fali swiatla");
			ramka.setBounds(220,151,100,100);
			add(ramka);
			
			JLabel ramka1= new JLabel("wybierz promien soczewki");
			ramka.setBounds(300,300,200,200);
			add(ramka1);
				
			String[] osrodki={"powietrze","szklo","woda"};
			JList<String> lista= new JList<String>(osrodki);
			lista.setBounds(566,0,70,70);
			add(lista);
			
			String[] jezyki={"polski","angielski","niemiecki","szwedzki","wloski"};
			JList<String> lista2= new JList<String>(jezyki);
			lista2.setBounds(566,0,70,70);
			add(lista2);
			
			String[] ilosc={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
			JList<String> lista3= new JList<String>(ilosc);
			lista3.setBounds(566,0,70,70);
			add(lista3);
			
			
			
			 final JSlider slider1 = new JSlider(1,30,10);
			 final JTextField textField= new JTextField();
			 slider1.addChangeListener(new ChangeListener() {
			       public void stateChanged(ChangeEvent e) {
			         System.out.println("Slider1: " + slider1.getValue());
			         JSlider source= (JSlider) e.getSource();
			         textField.setText(""+source.getValue());
			       }
			     });
			 	
			 	slider1.setMajorTickSpacing(9);
			 	slider1.setMinorTickSpacing(1);
			 	slider1.setPaintTicks(true);
			 	slider1.setPaintLabels(true);
			     getContentPane().add(slider1);
			     
			     add(textField);
			
			     final JSlider slider2 = new JSlider(1,2000,1500);
				 final JTextField textField2= new JTextField();
				 slider2.addChangeListener(new ChangeListener() {
				       public void stateChanged(ChangeEvent e) {
				         System.out.println("Slider2: " + slider2.getValue());
				         JSlider source= (JSlider) e.getSource();
				         textField2.setText(""+source.getValue());
				       }
				     });
				 	
				 	slider2.setMajorTickSpacing(2000);
				 	slider2.setMinorTickSpacing(100);
				 	slider2.setPaintTicks(true);
				 	slider2.setPaintLabels(true);
				     getContentPane().add(slider2);
				     
				     add(textField2);
			
		}
		ActionListener closeListener= new ActionListener() {
			public void actionPerformed(ActionEvent e){
				dispose();
				//setTitle("Przycisk wcisniety");
			}
		};
	
		
	
		public static void main(String[] args) {
			
			NewRings frame= new NewRings();
			//frame.setSize(640, 480);
			frame.setVisible(true);
			
		}
		} 




