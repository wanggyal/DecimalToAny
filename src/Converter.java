import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class Converter {

	private JFrame frame;
	private JTextField decimal;
	private JTextField radix;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter window = new Converter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumberConverter = new JLabel("Number Converter");
		lblNumberConverter.setBounds(164, 6, 115, 16);
		frame.getContentPane().add(lblNumberConverter);
		
		JLabel lblEnterDecimalNumber = new JLabel("Enter decimal number:");
		lblEnterDecimalNumber.setBounds(29, 40, 143, 16);
		frame.getContentPane().add(lblEnterDecimalNumber);
		
		JLabel lblEnterDecimalRadix = new JLabel("Enter decimal Radix:");
		lblEnterDecimalRadix.setBounds(29, 77, 143, 16);
		frame.getContentPane().add(lblEnterDecimalRadix);
		
		decimal = new JTextField();
		decimal.setBounds(184, 35, 130, 26);
		frame.getContentPane().add(decimal);
		decimal.setColumns(10);
		
		radix = new JTextField();
		radix.setColumns(10);
		radix.setBounds(184, 72, 130, 26);
		frame.getContentPane().add(radix);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int decimal_num=Integer.parseInt(decimal.getText());
				int radix_num=Integer.parseInt(radix.getText());
				NumberConverter nc=new NumberConverter();
				nc.setValues(decimal_num,radix_num);
				if(radix_num>2||radix_num<16)
					{
					nc.convert_number();
					String temp=nc.printAnswer();
					
				JOptionPane.showMessageDialog(frame, temp,"Answer",JOptionPane.INFORMATION_MESSAGE);
			}
				else {
					JOptionPane.showMessageDialog(frame, "Invalid radix number!!!");
				}
			}
		});
		btnConvert.setBounds(133, 217, 117, 29);
		frame.getContentPane().add(btnConvert);
	}
}
