package lovera.estudos.desktop;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import lovera.estudos.tresd.ModelTest;
import lovera.estudos.utils.Executavel;
import lovera.estudos.main.MainGame;
import lovera.estudos.semnomeainda.principal.SemNomeMain;
import lovera.estudos.tests.box2d.ApplyForce;

public class DesktopLauncher {

	private static Executavel executavel = Executavel.SEMNOME;

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		ApplicationListener app = null;

		switch (executavel){
			case DEMO3D:
				app = new MainGame();
				break;
			case MODELTEST:
				app = new ModelTest();
				break;
			case APPLYFORCE:
				app = new ApplyForce();
				break;
			case SEMNOME:
				app = new SemNomeMain();
				break;
		}
		new LwjglApplication(app, config);
	}
}
