package ch26_AWT;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ch26_1 {

	public static void main(String[] args) {
		Frame frm = new Frame("My First AWT program");
		frm.setSize(200, 150);
		
		frm.addWindowListener(new WindowAdapter() {
			public void windowclosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frm.setVisible(true);

	}

}
