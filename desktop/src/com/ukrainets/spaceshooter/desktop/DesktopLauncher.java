package com.ukrainets.spaceshooter.desktop;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.ukrainets.spaceshooter.SpaceShooter;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowSizeLimits(360,640,360,640);
		new Lwjgl3Application(new SpaceShooter(), config);
	}
}
