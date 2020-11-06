package ch26_AWT;

import java.awt.GraphicsEnvironment;

public class ch26_7_1 {

	public static void main(String[] args) {
		GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();

		String[] fontFamilyNames = graphicsEnv.getAvailableFontFamilyNames();
		for (String fontFamilyName : fontFamilyNames)
			System.out.println(fontFamilyName);
	}

}
