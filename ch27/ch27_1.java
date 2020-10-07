package ch27;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ch27_1 {
	static Frame frm = new Frame("ch27_1");
	static Button btn = new Button("PUSH ME, Plz");
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());
		frm.setSize(200, 120);
		frm.setBackground(Color.yellow);
		frm.add(btn);
		frm.setVisible(true);;

	}

}
