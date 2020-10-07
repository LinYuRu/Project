package ch26;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class ch26_7_2 {

	public static void main(String[] args) {
		GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();

		Font[] fonts = graphicsEnv.getAllFonts();
		for (Font font: fonts)
			System.out.println(font);

	}

}
