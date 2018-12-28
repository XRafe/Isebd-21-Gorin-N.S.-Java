package Lab;

import java.awt.Color;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class FormParking {

	private JFrame frame;
	private MultiLevelParking parking;
	private final int countLevel = 3;
	WaterCar WaterCar = new WaterCar();
	
	private JTextField textField;
	PanelParking panelParking = new PanelParking();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormParking window = new FormParking();
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
	public FormParking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 980, 553);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panelParking = new PanelParking();
		panelParking.setBackground(Color.WHITE);
		parking = new MultiLevelParking(countLevel, panelParking.getWidth(), panelParking.getHeight());
		
		panelParking.setParking(parking.get(0));
		panelParking.setBounds(10, 11, 751, 504);
		frame.getContentPane().add(panelParking);

		PanelTakeShip PanelTakeShip = new PanelTakeShip();
		PanelTakeShip.setBorder(null);
		PanelTakeShip.setBounds(771, 368, 203, 147);
		frame.getContentPane().add(PanelTakeShip);
		
		DefaultListModel listModel = new DefaultListModel();
		for (int i = 1; i <= countLevel; i++) {
			listModel.addElement("Уровень " + i);
		}
		JList list = new JList(listModel);
		list.setBounds(771, 36, 191, 126);
		frame.getContentPane().add(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setSelectedIndex(0);
		list.addListSelectionListener(e -> {
			panelParking.setParking(parking.get(list.getSelectedIndex()));
			panelParking.repaint();
		});
		
		JButton btnParkingSt = new JButton("\u041F\u0440\u0438\u043F\u0430\u0440\u043A\u043E\u0432\u0430\u0442\u044C \u043A\u043E\u0440\u0430\u0431\u043B\u044C");
		btnParkingSt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Color mainColor = JColorChooser.showDialog(null, "Choose a color", Color.GRAY);
				Ship ship = new Ship(100, 1000, mainColor);
				WaterCar.Wheel = false;
				WaterCar.Whistle = false;
				WaterCar.Decoreation = false;
				int place = parking.get(list.getSelectedIndex()).addoperator(ship);
				panelParking.repaint();

			}
		});
		btnParkingSt.setBounds(771, 173, 193, 43);
		frame.getContentPane().add(btnParkingSt);
		
		JButton btnParkingTun = new JButton("\u041F\u0440\u0438\u043F\u0430\u0440\u043A\u043E\u0432\u0430\u0442\u044C\r\n\u0442\u044E\u043D\u0438\u043D\u0433 \u043A\u043E\u0440\u0430\u0431\u043B\u044C");
		btnParkingTun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color mainColor = JColorChooser.showDialog(null, "Choose a color", Color.GRAY);
				Color dopColor = JColorChooser.showDialog(null, "Choose a color", Color.GRAY);
				WaterCar watercar = new WaterCar(300, 1000, mainColor, dopColor, true, true, true);
				int place = parking.get(list.getSelectedIndex()).addoperator(watercar);
				panelParking.repaint();

			}
		});
		btnParkingTun.setToolTipText("");
		btnParkingTun.setBounds(771, 227, 193, 43);
		frame.getContentPane().add(btnParkingTun);
		

		JButton btnPickUp = new JButton("\u0417\u0430\u0431\u0440\u0430\u0442\u044C");
		btnPickUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int planePosition = Integer.parseInt(textField.getText());
				ITransport WaterCar;
				if ((WaterCar = parking.get(list.getSelectedIndex()).removeoperator(planePosition)) != null) {
					WaterCar.SetPosition(0, 60, PanelTakeShip.getWidth(), PanelTakeShip.getHeight());
					PanelTakeShip.setShip(WaterCar);
				} else {
					PanelTakeShip.setShip(null);
				}
				PanelTakeShip.repaint();
				panelParking.repaint();
			}
		});
		btnPickUp.setBounds(771, 334, 91, 23);
		frame.getContentPane().add(btnPickUp);
		
		textField = new JTextField();
		textField.setBounds(831, 306, 31, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_Place = new JLabel("\u041C\u0435\u0441\u0442\u043E:");
		label_Place.setBounds(771, 309, 46, 14);
		frame.getContentPane().add(label_Place);
		
		JLabel label_pickup = new JLabel("\u0417\u0430\u0431\u0440\u0430\u0442\u044C \u043A\u043E\u0440\u0430\u0431\u043B\u044C:");
		label_pickup.setBounds(771, 281, 121, 14);
		frame.getContentPane().add(label_pickup);
		
		JLabel label_lvl = new JLabel("\u0423\u0440\u043E\u0432\u043D\u0438:");
		label_lvl.setBounds(771, 11, 46, 14);
		frame.getContentPane().add(label_lvl);
		

		

		
	}
}
