import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Refund extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Refund() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 431);
		
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
		
		JMenuItem mntmNewMenuItem = new JMenuItem("로그아웃");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Screen().setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem);
		contentPane = new JPanel();
		/*
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		*/
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("환불하기");
		contentPane.add(lblNewLabel);
	}

}
