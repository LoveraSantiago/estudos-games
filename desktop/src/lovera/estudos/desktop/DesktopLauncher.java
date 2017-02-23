package lovera.estudos.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import lovera.estudos.desktop.utils.Executavel;
import lovera.estudos.main.MainGame;
import lovera.estudos.tests.box2d.ApplyForce;
import lovera.estudos.tresd.Demo3D;

public class DesktopLauncher {

	private static Executavel executavel = Executavel.APPLYFORCE;

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		switch (executavel){
			case DEMO3D:
				new LwjglApplication(new MainGame(), config);
				break;
			case APPLYFORCE:
				new LwjglApplication(new ApplyForce(), config);
				break;
		}
	}
}
