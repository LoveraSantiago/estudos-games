package lovera.estudos.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import lovera.estudos.main.MainGame;
import lovera.estudos.tresd.Demo3D;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
//		new LwjglApplication(new MainGame(), config);
		new LwjglApplication(new Demo3D(), config);
	}
}
