package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Login() {
		int value = 100;
		int widht = 900;
		int height = 600;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(value, value, widht, height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane TelaDeBloqueio = new JLayeredPane();
		TelaDeBloqueio.setBounds(0, 0, 884, 561);
		contentPane.add(TelaDeBloqueio);

	}
}
