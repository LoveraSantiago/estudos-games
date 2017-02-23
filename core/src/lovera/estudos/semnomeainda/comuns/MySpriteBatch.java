package lovera.estudos.semnomeainda.comuns;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MySpriteBatch {

    private static final MySpriteBatch mySpriteBatch;

    private final SpriteBatch spriteBatch;

    static{
        mySpriteBatch = new MySpriteBatch();
    }

    private MySpriteBatch(){
        this.spriteBatch = new SpriteBatch();
    }

    public static MySpriteBatch getInstance() {
        return mySpriteBatch;
    }

    public SpriteBatch getSpriteBatch(){
        return this.getSpriteBatch();
    }
}
