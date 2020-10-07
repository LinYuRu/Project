package ch27;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ch27_3 {
	static Frame frm = new Frame("ch27_3");
	static Button btn = new Button("Press me, Plz");
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());
		frm.setSize(200, 120);
		frm.setBackground(Color.yellow);
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frm.setBackground(Color.gray);
			}
		});
		frm.add(btn);
		frm.setVisible(true);

	}

}
