import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.DropMode;

//----------------------------------Part 1--------------------------------------------------
//Ranxell
public class PizzaOrderingSystem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaOrderingSystem frame = new PizzaOrderingSystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PizzaOrderingSystem() {
		setBackground(Color.WHITE);
		setResizable(false);
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("PIZZA ORDERING SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 555);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		double[][] arrValue = {{90.00,110.00,130.00},
								{110.00,130.00,150.00},
								{130.00,150.00,170.00}};

//----------------------------------Part 2--------------------------------------------------
//Neriza		
		JLabel lblNewLabel = new JLabel("SELECT FLAVOR");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblNewLabel.setBounds(34, 23, 109, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdoHawaiian  = new JRadioButton("HAWAIIAN");
		rdoHawaiian.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdoHawaiian.setBorderPainted(true);
		rdoHawaiian.setHideActionText(true);
		rdoHawaiian.setBackground(UIManager.getColor("Button.background"));
		rdoHawaiian.setSelected(true);
		rdoHawaiian.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		JRadioButton rdoHamAndCheese = new JRadioButton("HAM AND CHEESE");
		rdoHamAndCheese.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdoHamAndCheese.setBorderPainted(true);
		rdoHamAndCheese.setBackground(UIManager.getColor("Button.background"));
		rdoHamAndCheese.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		JRadioButton rdoPepperoni = new JRadioButton("PEPPERONI");
		rdoPepperoni.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdoPepperoni.setBorderPainted(true);
		rdoPepperoni.setBackground(UIManager.getColor("Button.background"));
		rdoPepperoni.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		
		final ButtonGroup flavorButtonGroup = new ButtonGroup();
        flavorButtonGroup.add(rdoHawaiian);
        flavorButtonGroup.add(rdoHamAndCheese);
        flavorButtonGroup.add(rdoPepperoni);
        
//----------------------------------Part 3--------------------------------------------------
//-Abigania
		JRadioButton rdoSmall  = new JRadioButton("SMALL-SIZED");
		rdoSmall.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdoSmall.setBorderPainted(true);
		rdoSmall.setBackground(UIManager.getColor("Button.background"));
		rdoSmall.setSelected(true);
		rdoSmall.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		JLabel lblSmallPrice = new JLabel("");
		
		JRadioButton rdoMedium = new JRadioButton("MEDIUM-SIZED");
		rdoMedium.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdoMedium.setBorderPainted(true);
		rdoMedium.setBackground(UIManager.getColor("Button.background"));
		rdoMedium.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		JLabel lblMediumPrice = new JLabel("");
		
		JRadioButton rdoLarge = new JRadioButton("LARGE-SIZED");
		rdoLarge.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdoLarge.setBorderPainted(true);
		rdoLarge.setBackground(UIManager.getColor("Button.background"));
		rdoLarge.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		JLabel lblLargePrice = new JLabel("");
		
		rdoHawaiian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdoHawaiian) {
					lblSmallPrice.setText("90.00");
					lblMediumPrice.setText("110.00");
					lblLargePrice.setText("130.00");
					if(rdoHawaiian.isSelected()) {
						rdoHamAndCheese.setSelected(false);
						rdoPepperoni.setSelected(false);
					}
				}
			}
		});
//----------------------------------Part 4--------------------------------------------------	
//-Barril
		final ButtonGroup sizeButtonGroup = new ButtonGroup();
        sizeButtonGroup.add(rdoSmall);
        sizeButtonGroup.add(rdoMedium);
        sizeButtonGroup.add(rdoLarge);
		
		rdoHamAndCheese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdoHamAndCheese) {
					lblSmallPrice.setText("110.00");
					lblMediumPrice.setText("130.00");
					lblLargePrice.setText("150.00");
					if(rdoHamAndCheese.isSelected()) {
						rdoPepperoni.setSelected(false);
						rdoHawaiian.setSelected(false);
					}
				}
			}
		});
		
		rdoPepperoni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==rdoPepperoni) {
					lblSmallPrice.setText("130.00");
					lblMediumPrice.setText("150.00");
					lblLargePrice.setText("170.00");
					if(rdoPepperoni.isSelected()) {
						rdoHawaiian.setSelected(false);
						rdoHamAndCheese.setSelected(false);
					}
				}
			}
		});
		
		rdoSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdoSmall.isSelected()) {
					rdoMedium.setSelected(false);
					rdoLarge.setSelected(false);
				}
			}
		});
		
		rdoMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdoMedium.isSelected()) {
					rdoLarge.setSelected(false);
					rdoSmall.setSelected(false);
				}
			}
		});
		
		rdoLarge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdoLarge.isSelected()) {
					rdoSmall.setSelected(false);
					rdoMedium.setSelected(false);
				}
			}
		});
		rdoHawaiian.setBounds(34, 58, 139, 23);
		contentPane.add(rdoHawaiian);
		
		rdoHamAndCheese.setBounds(33, 84, 140, 23);
		contentPane.add(rdoHamAndCheese);
		
		rdoPepperoni.setBounds(34, 109, 139, 23);
		contentPane.add(rdoPepperoni);

//----------------------------------Part 5--------------------------------------------------
//Juliana
		JLabel lblSelectSize = new JLabel("SELECT SIZE");
		lblSelectSize.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblSelectSize.setBounds(34, 149, 83, 14);
		contentPane.add(lblSelectSize);
		
		rdoSmall.setBounds(34, 179, 139, 23);
		contentPane.add(rdoSmall);
		
		lblSmallPrice.setBounds(202, 179, 46, 23);
		contentPane.add(lblSmallPrice);
		
		rdoMedium.setBounds(34, 204, 139, 23);
		contentPane.add(rdoMedium);
		
		lblMediumPrice.setBounds(202, 204, 46, 23);
		contentPane.add(lblMediumPrice);
		
		rdoLarge.setBounds(34, 229, 139, 23);
		contentPane.add(rdoLarge);
		
		lblLargePrice.setBounds(202, 229, 46, 23);
		contentPane.add(lblLargePrice);
		
		JLabel lblNewLabel2 = new JLabel("SELECT ADD-ONS");
		lblNewLabel2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblNewLabel2.setBounds(25, 275, 118, 14);
		contentPane.add(lblNewLabel2);
		
		double[] AddOns = {5.00,10.00,15.00,20.00,25.00};
		
		JCheckBox chkPepper = new JCheckBox("PEPPER");
		chkPepper.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chkPepper.setBorderPainted(true);
		chkPepper.setBackground(UIManager.getColor("Button.background"));
		chkPepper.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		chkPepper.setBounds(34, 311, 139, 23);
		contentPane.add(chkPepper);
		
		JCheckBox chkOnions = new JCheckBox("ONIONS");
		chkOnions.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chkOnions.setBorderPainted(true);
		chkOnions.setBackground(UIManager.getColor("Button.background"));
		chkOnions.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		chkOnions.setBounds(34, 336, 139, 23);
		contentPane.add(chkOnions);
		
		JCheckBox chkBlackOlives = new JCheckBox("BLACK OLIVES");
		chkBlackOlives.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chkBlackOlives.setBorderPainted(true);
		chkBlackOlives.setBackground(UIManager.getColor("Button.background"));
		chkBlackOlives.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		chkBlackOlives.setBounds(34, 361, 139, 23);
		contentPane.add(chkBlackOlives);

//----------------------------------Part 6--------------------------------------------------
//Grio
		
		JCheckBox chkGreenPeppers = new JCheckBox("GREEN PEPPERS");
		chkGreenPeppers.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chkGreenPeppers.setBorderPainted(true);
		chkGreenPeppers.setBackground(UIManager.getColor("Button.background"));
		chkGreenPeppers.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		chkGreenPeppers.setBounds(34, 386, 139, 23);
		contentPane.add(chkGreenPeppers);
		
		JCheckBox chkExtraCheese = new JCheckBox("EXTRA CHEESE");
		chkExtraCheese.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chkExtraCheese.setBorderPainted(true);
		chkExtraCheese.setBackground(UIManager.getColor("Button.background"));
		chkExtraCheese.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 10));
		chkExtraCheese.setBounds(34, 412, 139, 23);
		contentPane.add(chkExtraCheese);
		
		JTextArea txtAOrderSummary = new JTextArea();
		txtAOrderSummary.setEditable(false);
		txtAOrderSummary.setFont(new Font("Courier New", Font.PLAIN, 13));
		txtAOrderSummary.setText("PIZZA FLAVOR  :\r\n\r\nPIZZA SIZE    :\r\n\r\nADD ONS :  \r\n\r\n\r\nTOTAL PRICE  :");
		txtAOrderSummary.setBounds(310, 47, 286, 218);
		contentPane.add(txtAOrderSummary);
		
		JLabel lblNewLabel3 = new JLabel("ORDER SUMMARY");
		lblNewLabel3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblNewLabel3.setBounds(310, 23, 122, 14);
		contentPane.add(lblNewLabel3);

		JButton btnCreateOrder = new JButton("CREATE ORDER");
		btnCreateOrder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCreateOrder.setSelected(true);
		btnCreateOrder.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCreateOrder.setBounds(29, 457, 247, 34);
		contentPane.add(btnCreateOrder);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setBounds(27, 47, 249, 92);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1.setBounds(28, 167, 248, 98);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1.setBounds(25, 299, 251, 148);
		contentPane.add(lblNewLabel_1_1_1);
		
//----------------------------------Part 7--------------------------------------------------
//Sean
		btnCreateOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hawaiian = "HAWAIIAN", hamAndCheese = "HAM AND CHEESE", pepperoni = "PEPPERONI", flavor = "";
				String small = "SMALL", medium = "MEDIUM", large = "LARGE", size = "";
				double value1 = 0, value2 = 0, total = 0, add = 0;
				String addOns = "";

				if (e.getSource() == btnCreateOrder) {
				    if (rdoHawaiian.isSelected()) {
				        value1 = 0;
				        flavor = hawaiian;
				    } else if (rdoHamAndCheese.isSelected()) {
				        value1 = 1;
				        flavor = hamAndCheese;
				    } else if (rdoPepperoni.isSelected()) {
				        value1 = 2;
				        flavor = pepperoni;
				    }

				    if (rdoSmall.isSelected()) {
				        value2 = 0;
				        size = small;
				    } else if (rdoMedium.isSelected()) {
				        value2 = 1;
				        size = medium;
				    } else if (rdoLarge.isSelected()) {
				        value2 = 2;
				        size = large;
				    }

				    if (chkPepper.isSelected()) {
				        add += 5;
				        addOns += "\n\tPEPPER\r";
				    }
				    if (chkOnions.isSelected()) {
				        add += 10;
				        addOns += "\n\tONIONS\r";
				    }
				    if (chkBlackOlives.isSelected()) {
				        add += 15;
				        addOns += "\n\tBLACK OLIVES\r";
				    }
				    if (chkGreenPeppers.isSelected()) {
				        add += 20;
				        addOns += "\n\tGREEN PEPPERS\r";
				    }
				    if (chkExtraCheese.isSelected()) {
				        add += 25;
				        addOns += "\n\tEXTRA CHEESE\r";
				    }
				    total = arrValue[(int) value1][(int) value2] + add;
				    txtAOrderSummary.setText("PIZZA FLAVOR :\t" + flavor + "\n" +
				                              "\nPIZZA SIZE :\t" + size + "\n" +
				                              "\nADD ONS :\t" + addOns + "\n" +
				                              "\n\nTOTAL PRICE :\t" + total + " pesos");
				}

				}
			
		});
		
		setLocationRelativeTo(null);
		
	}
}