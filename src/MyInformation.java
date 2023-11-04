import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class MyInformation extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public MyInformation() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("표예매");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("경기 일정 확인");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("표 예매 내역 확인");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("나의 정보");
		
		menuBar.add(mnNewMenu_3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 431);
		contentPane = new JPanel();
		/*
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		*/
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("나의 정보");
		contentPane.add(lblNewLabel);
	}

}
