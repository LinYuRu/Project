package ch26;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class ch26_6 {
	static Frame frm = new Frame("ch26_6");
	static Label lab1 = new Label();
	static Label lab2 = new Label();
	public static void main(String[] args) {
		frm.setLayout(null);
		frm.setSize(300, 200);
		frm.setBackground(Color.yellow);
		lab1.setText("JAVA");
		lab1.setForeground(Color.blue);
		lab1.setBounds(50, 50, 100, 100);
		lab2.setText("Python");
		lab2.setForeground(Color.red);
		lab2.setBounds(50, 100, 100, 30);
		frm.add(lab1);
		frm.add(lab2);
		frm.setVisible(true);

	}

}
