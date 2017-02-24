package lovera.estudos.semnomeainda.atores.mapas;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;

import lovera.estudos.semnomeainda.comuns.MapaLeitor;
import lovera.estudos.semnomeainda.comuns.MyCamera;
import lovera.estudos.semnomeainda.comuns.MySpriteBatch;
import lovera.estudos.semnomeainda.comuns.contratos.TipoDesenhavel;

public class MapaCasa implements TipoDesenhavel{

    private TiledMapRenderer renderer;
    private OrthographicCamera camera;

    private final SpriteBatch spriteBatch;

    public MapaCasa(){
        this.renderer = MapaLeitor.getInstance().lerMapa(Mapas.CASA, .1f);
        this.camera = MyCamera.getInstance().getCamera();

        this.spriteBatch = MySpriteBatch.getInstance().getSpriteBatch();
    }

    @Override
    public void meDesenhar() {
        this.spriteBatch.begin();

        this.renderer.setView(this.camera);
        this.renderer.render();

        this.spriteBatch.end();
    }
}
