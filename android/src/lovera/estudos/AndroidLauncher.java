package lovera.estudos;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import lovera.estudos.main.MainGame;
import lovera.estudos.tests.box2d.ApplyForce;
import lovera.estudos.utils.Executavel;

public class AndroidLauncher extends AndroidApplication {

	private static Executavel executavel = Executavel.APPLYFORCE;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new MainGame(), config);

        switch (executavel){
            case DEMO3D:
                initialize(new MainGame(), config);
                break;
            case APPLYFORCE:
                initialize(new ApplyForce(), config);
                break;
        }
	}
}
