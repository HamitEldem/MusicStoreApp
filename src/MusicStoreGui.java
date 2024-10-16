import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

public class MusicStoreGui extends JFrame {
	// Instruments and customer
	Instrument guitar;
	Instrument piano;
	Instrument drums;
	Instrument violin;
	Customer customer;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField budgetInput;

	/**
	 * Create the frame for Music Store GUI.
	 */
	public MusicStoreGui(Instrument guitar, Instrument piano, Instrument drums, Instrument violin, Customer customer) {
		this.guitar = guitar;
		this.piano = piano;
		this.drums = drums;
		this.violin = violin;
		this.customer = customer;
		
		// Set default properties for JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 935, 439);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(215, 232, 241));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));

		// Set content pane and layout
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Title label
		JLabel lblNewLabel = new JLabel("Hamit Music");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel.setBounds(63, 6, 127, 16);
		contentPane.add(lblNewLabel);
		
		// Welcome message
		JLabel lblNewLabel_1 = new JLabel("Welcome back " + customer.customerName + "!");
		lblNewLabel_1.setBounds(45, 34, 183, 16);
		contentPane.add(lblNewLabel_1);
		
		// Header panel
		JPanel panel = new JPanel();
		panel.setBackground(new Color(216, 108, 108));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(0, 0, 226, 70);
		contentPane.add(panel);
		
		// Customer's budget panel
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(216, 108, 108));
		panel_1.setBounds(0, 72, 226, 101);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Your Budget:");
		lblNewLabel_2.setBounds(6, 38, 109, 16);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel(""+ customer.getWalletBalance() + " TL");
		lblNewLabel_3.setBounds(108, 39, 93, 16);
		panel_1.add(lblNewLabel_3);
		
		// Instrument details panel
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(216, 108, 108));
		panel_2.setBounds(0, 175, 226, 100);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		// Status messages panel
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBackground(new Color(135, 179, 226));
		panel_6.setBounds(229, 277, 706, 134);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Last Operation:");
		lblNewLabel_9.setBounds(6, 6, 108, 122);
		panel_6.add(lblNewLabel_9);
		
		JLabel statusLabel = new JLabel("");
		statusLabel.setBounds(126, 59, 574, 16);
		panel_6.add(statusLabel);
		
		// Available instruments list
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Guitar", "Violin", "Drums", "Piano"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(6, 6, 46, 76);
		panel_2.add(list);
		
		// Instrument prices list
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {guitar.getPrice() + "TL", violin.getPrice() + "TL", drums.getPrice() + "TL", piano.getPrice() + "TL"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBounds(55, 6, 73, 76);
		panel_2.add(list_1);
		
		// Instrument stock list
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {guitar.getStockQuantity() + "pcs.", violin.getStockQuantity() + "pcs.", drums.getStockQuantity() + "pcs.", piano.getStockQuantity() +"pcs."};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_2.setBounds(133, 6, 87, 76);
		panel_2.add(list_2);
		
		// Add budget panel
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(216, 111, 111));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(0, 277, 226, 134);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Add Budget");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblNewLabel_4.setBounds(55, 6, 117, 26);
		panel_3.add(lblNewLabel_4);
		
		budgetInput = new JTextField();
		budgetInput.setBounds(123, 34, 86, 26);
		panel_3.add(budgetInput);
		budgetInput.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Enter the amount:");
		lblNewLabel_5.setBounds(6, 39, 116, 16);
		panel_3.add(lblNewLabel_5);
		
		JButton budgetSubmitBtn = new JButton("ADD");
		budgetSubmitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Add funds to customer's wallet
				customer.addFunds(Double.parseDouble(budgetInput.getText()));
				lblNewLabel_3.setText(customer.getWalletBalance() + " TL");
				budgetInput.setText("");
				statusLabel.setText("The transaction completed successfully! Funds have been added to your account!!!");
			}
		});
		budgetSubmitBtn.setBounds(55, 72, 117, 29);
		panel_3.add(budgetSubmitBtn);
		
		// Shop title panel
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBackground(new Color(135, 179, 226));
		panel_4.setBounds(229, 0, 706, 70);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("SHOP");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_6.setBounds(334, 23, 61, 16);
		panel_4.add(lblNewLabel_6);
		
		// Shopping section panel
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(new Color(135, 179, 226));
		panel_5.setBounds(229, 72, 706, 203);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Select the Product: ");
		lblNewLabel_7.setBounds(240, 10, 133, 16);
		panel_5.add(lblNewLabel_7);
		
		JComboBox<Instrument> InstrumentComboBox = new JComboBox<>();
		InstrumentComboBox.addItem(guitar);
		InstrumentComboBox.addItem(piano);
		InstrumentComboBox.addItem(violin);
		InstrumentComboBox.addItem(drums);
		InstrumentComboBox.setBounds(367, 6, 121, 27);
		panel_5.add(InstrumentComboBox);

		JLabel lblNewLabel_8 = new JLabel("Enter the amount:");
		lblNewLabel_8.setBounds(240, 53, 115, 16);
		panel_5.add(lblNewLabel_8);
		
		JSpinner amountInput = new JSpinner();
		amountInput.setBounds(367, 48, 121, 27);
		panel_5.add(amountInput);
		
		JButton payBtn = new JButton("PAY");
		payBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Attempt to purchase selected instrument and quantity
				if(customer.purchaseInstrument((Instrument)InstrumentComboBox.getSelectedItem(), (int)amountInput.getValue())) {
					lblNewLabel_3.setText(customer.getWalletBalance() + " TL");
					statusLabel.setText("The transaction completed successfully! Enjoy your new instrument(s)!!!");
				} else {
					statusLabel.setText("The transaction is unsuccessful! Not enough balance!!! ");
				}
			}
		});
		payBtn.setBounds(294, 105, 151, 63);
		panel_5.add(payBtn);
	}
}