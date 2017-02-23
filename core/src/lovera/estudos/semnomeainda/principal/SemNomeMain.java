package lovera.estudos.semnomeainda.principal;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import lovera.estudos.semnomeainda.comuns.MyCamera;
import lovera.estudos.semnomeainda.comuns.MySpriteBatch;

public class SemNomeMain extends ApplicationAdapter{

    private MyCamera myCamera;
    private SpriteBatch spriteBatch;

    @Override
    public void create() {
        this.myCamera = MyCamera.getInstance();
        this.spriteBatch = MySpriteBatch.getInstance().getSpriteBatch();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        this.spriteBatch.begin();
//        this.spriteBatch.draw(img, 0, 0);
        this.spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {
        this.myCamera.resize(width, height);
    }

    @Override
    public void dispose() {
        this.spriteBatch.dispose();
    }
}
