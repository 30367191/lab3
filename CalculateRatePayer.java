/**
 * 
 */
package gui;

import java.awt.EventQueue;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculateRatePayer {
	
	private JFrame frame;
	private JTextField textfield;
	private JTextField txt;

	protected JComboBox<String> comboBox;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateRatePayer window = new CalculateRatePayer();
					window.frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
					
				}
			}
		});

	}

	public CalculateRatePayer() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame("Calculate Property rate yearly total");
		frame.setBounds(100,100,414,514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("Select a property");
		lbl1.setBounds(15,16,193,20);
		frame.getContentPane().add(lbl1);
		
		JComboBox<String> list = new JComboBox<String>();
		list.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (list.getSelectedIndex() != 0) {
					System.out.append("Please Select One");
				}
			}
		});
		list.setModel(new DefaultComboBoxModel<String>(new String[] {"Please select"}));
		list.addItem("Residential");
		list.addItem("Commercial");
		list.addItem("Hospital");
		list.addItem("Industrial");
		list.addItem("SchoolCommunity");
		list.addItem("VacantLand");
		list.setSelectedItem(null);
		list.setBounds(258,16,100,26);
		frame.getContentPane().add(list);
		
		JLabel lbl2 = new JLabel("Charity Status:");
		lbl2.setBounds(15,92,228,20);
		frame.getContentPane().add(lbl2);
		
		JComboBox<Boolean> list1 = new JComboBox<Boolean>();
		list1.setModel(new DefaultComboBoxModel<Boolean>());
		list1.setBounds(258,89,100,26);
		list1.addItem(false);
		list1.addItem(true);
		list.setSelectedItem("True/False");
		frame.getContentPane().add(list1);
		
		JButton btn = new JButton("Calculate");
		
		btn.setBounds(120,230,140,22);
		frame.getContentPane().add(btn);
		JLabel lbl3 = new JLabel("Property value");
		lbl3.setBounds(15,182,193,20);;
		frame.getContentPane().add(lbl3);
		
	
		
		JLabel lbl4 = new JLabel("Property rate total is:");
		lbl4.setBounds(70,345,144,20);
		frame.getContentPane().add(lbl4);
		
	}
}