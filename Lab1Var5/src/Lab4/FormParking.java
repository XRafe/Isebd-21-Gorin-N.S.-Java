package Lab4;

import java.awt.Color;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormParking {

	private JFrame frame;
	private Parking<ITransport> parking;
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
		parking = new Parking<>(16, panelParking.getWidth(), panelParking.getHeight());
		panelParking.setParking(parking);
		panelParking.setBounds(10, 11, 751, 504);
		frame.getContentPane().add(panelParking);

		PanelTakeShip PanelTakeShip = new PanelTakeShip();
		PanelTakeShip.setBorder(null);
		PanelTakeShip.setBounds(771, 282, 203, 195);
		frame.getContentPane().add(PanelTakeShip);
		
		
		JButton btnParkingSt = new JButton("\u041F\u0440\u0438\u043F\u0430\u0440\u043A\u043E\u0432\u0430\u0442\u044C \u043A\u043E\u0440\u0430\u0431\u043B\u044C");
		btnParkingSt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Color mainColor = JColorChooser.showDialog(null, "Choose a color", Color.GRAY);
				Ship ship = new Ship(100, 1000, mainColor);
				WaterCar.Wheel = false;
				WaterCar.Whistle = false;
				WaterCar.Decoreation = false;
				int place = parking.addoperator(ship);
				panelParking.repaint();

			}
		});
		btnParkingSt.setBounds(771, 13, 193, 43);
		frame.getContentPane().add(btnParkingSt);
		
		JButton btnParkingTun = new JButton("\u041F\u0440\u0438\u043F\u0430\u0440\u043A\u043E\u0432\u0430\u0442\u044C\r\n\u0442\u044E\u043D\u0438\u043D\u0433 \u043A\u043E\u0440\u0430\u0431\u043B\u044C");
		btnParkingTun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color mainColor = JColorChooser.showDialog(null, "Choose a color", Color.GRAY);
				Color dopColor = JColorChooser.showDialog(null, "Choose a color", Color.GRAY);
				WaterCar watercar = new WaterCar(300, 1000, mainColor, dopColor, true, true, true);
				int place = parking.addoperator(watercar);
				panelParking.repaint();

			}
		});
		btnParkingTun.setToolTipText("");
		btnParkingTun.setBounds(771, 70, 193, 43);
		frame.getContentPane().add(btnParkingTun);
		

		JButton btnPickUp = new JButton("\u0417\u0430\u0431\u0440\u0430\u0442\u044C");
		btnPickUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int planePosition = Integer.parseInt(textField.getText());
				ITransport WaterCar;
				if ((WaterCar = parking.removeoperator(planePosition)) != null) {
					WaterCar.SetPosition(0, 60, PanelTakeShip.getWidth(), PanelTakeShip.getHeight());
					PanelTakeShip.setShip(WaterCar);
				} else {
					PanelTakeShip.setShip(null);
				}
				PanelTakeShip.repaint();
				panelParking.repaint();
			}
		});
		btnPickUp.setBounds(776, 248, 91, 23);
		frame.getContentPane().add(btnPickUp);
		
		textField = new JTextField();
		textField.setBounds(836, 217, 31, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_Place = new JLabel("\u041C\u0435\u0441\u0442\u043E:");
		label_Place.setBounds(780, 220, 46, 14);
		frame.getContentPane().add(label_Place);
		
		JLabel label_pickup = new JLabel("\u0417\u0430\u0431\u0440\u0430\u0442\u044C \u043A\u043E\u0440\u0430\u0431\u043B\u044C:");
		label_pickup.setBounds(776, 183, 91, 14);
		frame.getContentPane().add(label_pickup);
		

		
	}
}
