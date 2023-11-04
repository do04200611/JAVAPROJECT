import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import java.awt.Button;

public class Screen extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 431);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setForeground(Color.RED);
	
		contentPane.setBorder(new EmptyBorder(5, 5, 49, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setBounds(320, 10, 346, 80);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setLabelFor(this);
		lblNewLabel_2.setBackground(Color.CYAN);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 66));
		contentPane.add(lblNewLabel_2);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(371, 119, 195, 40);
		contentPane.add(formattedTextField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(369, 169, 197, 40);
		contentPane.add(passwordField);
		
		Button button = new Button("회원 가입");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(Color.BLUE);
		button.setBackground(Color.ORANGE);
		button.setActionCommand("");
		button.setBounds(262, 237, 212, 40);
		contentPane.add(button);
		
		Button button_1 = new Button("비밀번호를 잊으셨나요?");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setForeground(Color.BLUE);
		button_1.setBackground(Color.ORANGE);
		button_1.setActionCommand("");
		button_1.setBounds(525, 237, 212, 40);
		contentPane.add(button_1);
		
		Button button_2 = new Button("로그인");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new MainScreen().setVisible(true);
			}
		});
		button_2.setForeground(Color.BLUE);
		button_2.setBackground(Color.ORANGE);
		button_2.setActionCommand("");
		button_2.setBounds(615, 139, 212, 40);
		contentPane.add(button_2);
	}
}
