package lovera.estudos.semnomeainda.atores.jogador;

import com.badlogic.gdx.InputProcessor;

class JogadorListener implements InputProcessor{

    private final ControleJogador controle;

    public JogadorListener(ControleJogador controle) {
        this.controle = controle;
    }

    @Override
    public boolean keyDown(int keycode) {
        this.controle.movimentarJogador(keycode);
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        this.controle.pararMovimentacao();
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
