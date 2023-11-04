import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ForgotId extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public ForgotId() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 431);
		contentPane = new JPanel();
		/*
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		*/
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("아이디 잊었을 때");
		contentPane.add(lblNewLabel_1, BorderLayout.SOUTH);
	}

}
