package lovera.estudos.semnomeainda.comuns;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MyCamera {

    private static final MyCamera myCamera;

    private final OrthographicCamera camera;
    private final Viewport viewport;

    private final int LARGURA_TELA = 30;
    private final int HALTURA_TELA = 10;

    static{
        myCamera = new MyCamera();
    }

    private MyCamera(){
        this.camera = new OrthographicCamera();
        this.viewport = new StretchViewport(LARGURA_TELA, HALTURA_TELA, this.camera);
        this.viewport.apply();

        this.camera.position.set(this.camera.viewportWidth / 2f, this.camera.viewportHeight / 2f, 0);
        this.camera.update();
    }

    public static MyCamera getInstance() {
        return myCamera;
    }

    public void resize(int width, int heigth){
        this.viewport.update(width, heigth);
    }

    public OrthographicCamera getCamera() {
        return camera;
    }
}
