package lovera.estudos.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import lovera.estudos.utils.Executavel;
import lovera.estudos.main.MainGame;
import lovera.estudos.semnomeainda.principal.SemNomeMain;
import lovera.estudos.tests.box2d.ApplyForce;

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
			case SEMNOME:
				new LwjglApplication(new SemNomeMain(), config);
				break;
		}
	}
}
