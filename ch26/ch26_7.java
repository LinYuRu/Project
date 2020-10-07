package ch26;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

public class ch26_7 {
	static Frame frm = new Frame("ch26_7");
	static Label lab = new Label("JAVA王者歸來");

	public static void main(String[] args) {
		frm.setLayout(null);
		frm.setSize(300, 200);
		frm.setBackground(Color.yellow);
		lab.setForeground(Color.blue);
		lab.setBackground(Color.pink);
		lab.setAlignment(Label.CENTER);
		lab.setLocation(50, 80);
		lab.setSize(150, 50);
		lab.setFont(new Font("Serief", Font.BOLD + Font.ITALIC, 18));
		frm.add(lab);
		frm.setVisible(true);

	}

}
