package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Little Project";
		cfg.width = 1920;
		cfg.height = 1080;
		new LwjglApplication(new Game(), config);
	}
}
