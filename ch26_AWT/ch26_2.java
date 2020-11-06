package ch26_AWT;

import java.awt.Color;
import java.awt.Frame;

public class ch26_2 {
	static Frame frm = new Frame("ch26_2");

	public static void main(String[] args) {
		frm.setSize(200, 152);
		frm.setBackground(Color.yellow);
		frm.setLocation(200, 100);
		frm.setVisible(true);
		frm.setName("myWin");
		
		System.out.println("Frame x : " + frm.getX());
		System.out.println("Frame y : " + frm.getY());
		System.out.println("Frame Height : " + frm.getHeight());
		System.out.println("Frame Width : " + frm.getWidth());
		System.out.println("Frame Name : " + frm.getName());
		System.out.println("Frame bg-Color : " + frm.getBackground());
		
		frm.setBackground(new Color(255, 100, 100));

	}

}
