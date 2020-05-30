package cz.spsejecna.titera2.pocitadlo;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Frame implements ActionListener {
	
	int cnt = 0;
	JFrame frame = new JFrame("Počítadlo");
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JLabel label = new JLabel(Integer.toString(cnt), SwingConstants.CENTER);
	
	public Frame() {
		plus.addActionListener(this);
		plus.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		minus.addActionListener(this);
		minus.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		
		frame.add(minus);
		frame.add(label);
		frame.add(plus);
		
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setLayout(new GridLayout());
		frame.setSize(300, 300);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == plus) {
			cnt++;
			label.setText(Integer.toString(cnt));
		}
		if(e.getSource() == minus) {
			cnt--;
			label.setText(Integer.toString(cnt));
		}
		
	}

}
