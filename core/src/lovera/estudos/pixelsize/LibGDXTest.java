package lovera.estudos.pixelsize;


import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

//public class LibGDXTest extends ApplicationAdapter {
//    SpriteBatch batch;
//    Texture texture;
//
//    public void create () {
//        batch = new SpriteBatch();
//        texture = new Texture(Gdx.files.internal("data/badlogic.jpg"));
//    }
//
//    public void render () {
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        batch.begin();
//        batch.draw(texture, 0, 0);
//        batch.end();
//    }
//
//    public void dispose () {
//        texture.dispose();
//        batch.dispose();
//    }
//}

//public class LibGDXTest extends ApplicationAdapter {
//    final float VIRTUAL_WIDTH = 1280; // +++
//    final float VIRTUAL_HEIGHT = 720; // +++
//
//    OrthographicCamera cam; // +++
//    SpriteBatch batch;
//    Texture texture;
//
//    public void create () {
//        batch = new SpriteBatch();
//        texture = new Texture(Gdx.files.internal("data/badlogic.jpg"));
//        cam = new OrthographicCamera(); //
//        cam.setToOrtho(false, VIRTUAL_WIDTH, VIRTUAL_HEIGHT); // +++
//        batch.setProjectionMatrix(cam.combined); // +++
//    }
//
//    public void render () {
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//        batch.begin();
//        batch.draw(texture, 0, 0);
//        batch.end();
//    }
//
//    public void dispose () {
//        texture.dispose();
//        batch.dispose();
//    }
//}

public class LibGDXTest extends ApplicationAdapter {
    final float VIRTUAL_HEIGHT = 720;

    OrthographicCamera cam;
    SpriteBatch batch;
    Texture texture;

    public void create () {
        batch = new SpriteBatch();
        texture = new Texture(Gdx.files.internal("data/badlogic.jpg"));
        cam = new OrthographicCamera();
    }

    public void resize (int width, int height) { // +++
        cam.setToOrtho(false, VIRTUAL_HEIGHT * width / (float)height, VIRTUAL_HEIGHT); // +++
        batch.setProjectionMatrix(cam.combined); // +++
    } // +++

    public void render () {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(texture, 0, 0);
        batch.end();
    }

    public void dispose () {
        texture.dispose();
        batch.dispose();
    }
}