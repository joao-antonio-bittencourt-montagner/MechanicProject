package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Login implements ActionListener{

	private static JLabel user,pass,sucess;
	private static JTextField userText, passText;
	private static JButton loginButton;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		try {
			
			frame.setSize(500,500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			
			panel.setLayout(null);
			
			user = new JLabel("Username: ");
			user.setBounds(10, 20, 80, 25);
			panel.add(user);
			
			userText = new JTextField();
			userText.setBounds(100, 20, 165, 25);
			panel.add(userText);
			
			pass = new JLabel("PassWord: ");
			pass.setBounds(10, 50, 80, 25);
			panel.add(pass);
			
			passText = new JPasswordField();
			passText.setBounds(100, 50, 165, 25);
			panel.add(passText);
			
			loginButton= new JButton("Login");
			loginButton.setBounds(100, 80, 80, 25);
			loginButton.addActionListener(new Login());
			panel.add(loginButton);
			
			sucess = new JLabel("");
			sucess.setBounds(10, 110, 300,25);
			panel.add(sucess);
			
			frame.setVisible(true);
			
		}catch(Exception e){
			sucess.setText(e.getMessage()); 
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String pass = passText.getText();	

		
		if (user.equals("João") && pass.equals("123")){
			userText.setText("");
			passText.setText("");
			sucess.setText("Usuário: [" + user + "] Senha: ["+ pass +"]");
			user = null;
			pass =  null;
			
		} else {
			sucess.setText("Try again, buddy");
			
		}
	}
}
