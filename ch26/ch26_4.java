package ch26;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class ch26_4 {
	static Frame frm = new Frame("ch26_4");
	static Label lab = new Label("OSAKA");
	public static void main(String[] args) {
		frm.setSize(300, 200);
		frm.setBackground(Color.yellow);
		frm.setForeground(Color.blue);
		frm.add(lab);
		frm.setVisible(true);

	}

}
