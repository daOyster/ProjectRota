package com.oyster.Rota;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Rota";
		cfg.width = 800*9/16;
		cfg.height = 800;
		
		new LwjglApplication(new RotaGame(), cfg);
	}
}
