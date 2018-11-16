import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class FormShip {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormShip window = new FormShip();
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
	public FormShip() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 723, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 527, 432);
		frame.getContentPane().add(panel);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(547, 11, 158, 60);
		frame.getContentPane().add(btnCreate);
		
		JButton btnUp = new JButton("");
		btnUp.setIcon(new ImageIcon("C:\\Users\\\u0421\u0435\u0440\u0433\u0435\u0439\\Desktop\\up.png"));
		btnUp.setBounds(593, 272, 47, 47);
		frame.getContentPane().add(btnUp);
		
		JButton btnL = new JButton("");
		btnL.setIcon(new ImageIcon("C:\\Users\\\u0421\u0435\u0440\u0433\u0435\u0439\\Desktop\\left.png"));
		btnL.setBounds(547, 318, 47, 47);
		frame.getContentPane().add(btnL);
		
		JButton btnR = new JButton("");
		btnR.setIcon(new ImageIcon("C:\\Users\\\u0421\u0435\u0440\u0433\u0435\u0439\\Desktop\\right.png"));
		btnR.setBounds(639, 318, 47, 47);
		frame.getContentPane().add(btnR);
		
		JButton btnD = new JButton("");
		btnD.setIcon(new ImageIcon("C:\\Users\\\u0421\u0435\u0440\u0433\u0435\u0439\\Desktop\\down.png"));
		btnD.setBounds(593, 365, 47, 47);
		frame.getContentPane().add(btnD);
	}
}
