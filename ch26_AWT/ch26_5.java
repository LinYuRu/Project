package ch26_AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class ch26_5 {
	static Frame frm = new Frame("ch26_4");
	static Label lab = new Label("OSAKA", Label.CENTER);
	public static void main(String[] args) {
		frm.setSize(300, 200);
		frm.setBackground(Color.yellow);
		frm.setForeground(Color.blue);
		frm.add(lab);
		frm.setVisible(true);
	}
}
