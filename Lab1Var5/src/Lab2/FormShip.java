package Lab1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class FormShip {

	
	public static boolean DrawShip = false;
	private JFrame frame;
	private JPanel Panel;
	
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

	private void Draw() {
        
		Panel.repaint();
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
		
		Panel = new Panel();
		Panel.setBackground(Color.WHITE);
		Panel.setBounds(10, 11, 527, 432);
		frame.getContentPane().add(Panel);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rnd = new Random();
                Ship Ship = new Ship(rnd.nextInt(200) + 100, rnd.nextInt(1000) + 1000, Color.BLUE, Color.BLUE);
				Ship.SetPosition(rnd.nextInt(90) + 100, rnd.nextInt(90) + 100, Panel.getWidth(), Panel.getHeight());
				DrawShip = true;
				Draw();
				 
			}
		});
		btnCreate.setBounds(547, 11, 158, 60);
		frame.getContentPane().add(btnCreate);
		
		JButton btnUp = new JButton("");
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ship.MoveTransport(Direction.Up);
		        Draw();
			}
		});
		btnUp.setIcon(new ImageIcon("C:\\Users\\\u0421\u0435\u0440\u0433\u0435\u0439\\Desktop\\up.png"));
		btnUp.setBounds(593, 272, 47, 47);
		frame.getContentPane().add(btnUp);
		
		JButton btnL = new JButton("");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ship.MoveTransport(Direction.Left);
		        Draw();
			}
		});
		btnL.setIcon(new ImageIcon("C:\\Users\\\u0421\u0435\u0440\u0433\u0435\u0439\\Desktop\\left.png"));
		btnL.setBounds(547, 318, 47, 47);
		frame.getContentPane().add(btnL);
		
		JButton btnR = new JButton("");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ship.MoveTransport(Direction.Right);
		        Draw();
			}
		});
		btnR.setIcon(new ImageIcon("C:\\Users\\\u0421\u0435\u0440\u0433\u0435\u0439\\Desktop\\right.png"));
		btnR.setBounds(639, 318, 47, 47);
		frame.getContentPane().add(btnR);
		
		JButton btnD = new JButton("");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ship.MoveTransport(Direction.Down);
		        Draw();
			}
		});
		btnD.setIcon(new ImageIcon("C:\\Users\\\u0421\u0435\u0440\u0433\u0435\u0439\\Desktop\\down.png"));
		btnD.setBounds(593, 365, 47, 47);
		frame.getContentPane().add(btnD);
	}
}