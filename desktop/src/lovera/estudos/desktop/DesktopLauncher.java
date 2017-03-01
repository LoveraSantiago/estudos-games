package lovera.estudos.desktop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import lovera.estudos.main.MainGame;
import lovera.estudos.pixelsize.LibGDXTest;
import lovera.estudos.superkoalio.SuperKoalio;
import lovera.estudos.tests.box2d.ApplyForce;
import lovera.estudos.tresd.ModelTest;
import lovera.estudos.utils.Executavel;

public class DesktopLauncher {

	private static Executavel executavel = Executavel.SUPER_KOALIO;

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
			case PIXEL_SIZE:
				app = new LibGDXTest();
				break;
			case SUPER_KOALIO:
				app = new SuperKoalio();
				break;
		}
		new LwjglApplication(app, config);
	}
}
