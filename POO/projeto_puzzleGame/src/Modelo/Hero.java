package Modelo;

import Controler.SoundPlayer;
import Auxiliar.Consts;
import Auxiliar.Desenho;
import Controler.ControleDeJogo;
import Controler.Tela;
import Modelo.Tiro;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;

public class Hero extends Personagem implements Serializable {

    protected int life_quant = 0;
    protected int quant_keys = 0;
    protected int quant_weapons = 0;
    protected int opened_doors = 0;
    protected int opponents_killed = 0;
    protected int doorMissionQuant;
    protected int opponentMissionQuant;
    private int iContaIntervalos;
    private int orientation;
    public SoundPlayer effects = new SoundPlayer();

    public Hero(String sNomeImagePNG, int doorMissionQuant, int opponentMissionQuant) {
        super(sNomeImagePNG);
        this.doorMissionQuant = doorMissionQuant;
        this.opponentMissionQuant = opponentMissionQuant;
        orientation = 2; // Começa atirando para baixo

    }

    public void autoDesenho() {
        super.autoDesenho();

    }

    public void gunFire() {
        Tiro f = new Tiro("tiro_up.png", orientation);
        // f.decide_direction(orientation);
        f.setPosicao(pPosicao.getLinha(), pPosicao.getColuna());
        Desenho.acessoATelaDoJogo().addPersonagem(f);
    }

    public boolean faseFinalizada() {
        if (opened_doors >= this.doorMissionQuant && opponents_killed >= this.opponentMissionQuant) {
            return true;
        } else {
            return false;
        }
    }

    public void voltaAUltimaPosicao() {
        this.pPosicao.volta();

    }

    private long lastHitTime = 1000;
    private static final long INVINCIBILITY_DURATION = 2000; // 3 seconds, for example

    public void hit() {
        voltaAUltimaPosicao();
        subtract_lifeQuant();
        lastHitTime = System.currentTimeMillis();
    }

    public boolean canMove() {
        return System.currentTimeMillis() - lastHitTime > INVINCIBILITY_DURATION;
    }

    public boolean setPosicao(int linha, int coluna) {
        if (this.pPosicao.setPosicao(linha, coluna)) {
            if (!Desenho.acessoATelaDoJogo().ehPosicaoValida(this.getPosicao(), false, 0)) {
                this.voltaAUltimaPosicao();
            }
            return true;
        }
        return false;
    }

    /*
     * TO-DO: este metodo pode ser interessante a todos os personagens que se movem
     */
    private boolean validaPosicao() {
        if (!Desenho.acessoATelaDoJogo().ehPosicaoValida(this.getPosicao(), false, 0)) {
            this.voltaAUltimaPosicao();
            return false;
        }
        return true;
    }

    /*
     * 1 -> direita
     * 2 -> baixo
     * 3 -> esquerda
     * 4 -> cima
     */
    public ArrayList<String> UPAnimationFrames = new ArrayList<>();
    {
        UPAnimationFrames.add("olha_cima.png");
        UPAnimationFrames.add("up1.png");
        UPAnimationFrames.add("up2.png");
    }

    // public String[] UPAnimationFrames =
    // {"olha_cima.png","up1.png","up2.png","olha_cima.png","up1.png","up2.png","olha_cima.png","up1.png","up2.png","olha_cima.png","up1.png","up2.png","olha_cima.png","up1.png","up2.png","olha_cima.png","up1.png","up2.png"};
    public boolean moveUp() {
        if (super.moveUp()) {
            this.orientation = 4;

            // Atualizar o quadro da animação
            currentAnimationFrame = (currentAnimationFrame + 1) % UPAnimationFrames.size();
            // Mudar a imagem para o quadro atual da animação
            this.mudar_imagem(UPAnimationFrames.get(currentAnimationFrame));

            return validaPosicao();
        }
        return false;
    }

    public ArrayList<String> DownAnimationFrames = new ArrayList<>();
    {
        DownAnimationFrames.add("olha_baixo.png");
        DownAnimationFrames.add("down1.png");
        DownAnimationFrames.add("down2.png");
    }

    public boolean moveDown() {
        if (super.moveDown()) {
            this.orientation = 2;
            // Atualizar o quadro da animação
            currentAnimationFrame = (currentAnimationFrame + 1) % DownAnimationFrames.size();
            // Mudar a imagem para o quadro atual da animação
            this.mudar_imagem(DownAnimationFrames.get(currentAnimationFrame));

            return validaPosicao();
        }
        return false;
    }

    public ArrayList<String> rightAnimationFrames = new ArrayList<>();
    {
        rightAnimationFrames.add("olha_direita.png");
        rightAnimationFrames.add("right1.png");
        rightAnimationFrames.add("right2.png");
    }
    public int currentAnimationFrame = 0;

    public boolean moveRight() {
        if (super.moveRight()) {
            this.orientation = 1;

            // Atualizar o quadro da animação
            currentAnimationFrame = (currentAnimationFrame + 1) % rightAnimationFrames.size();
            // Mudar a imagem para o quadro atual da animação
            this.mudar_imagem(rightAnimationFrames.get(currentAnimationFrame));

            return validaPosicao();
        }
        return false;
    }

    public ArrayList<String> leftAnimationFrames = new ArrayList<>();
    {
        leftAnimationFrames.add("olha_esquerda.png");
        leftAnimationFrames.add("left1.png");
        leftAnimationFrames.add("left2.png");
    }

    public boolean moveLeft() {
        if (super.moveLeft()) {
            this.orientation = 3;

            // Atualizar o quadro da animação
            currentAnimationFrame = (currentAnimationFrame + 1) % leftAnimationFrames.size();
            // Mudar a imagem para o quadro atual da animação
            this.mudar_imagem(leftAnimationFrames.get(currentAnimationFrame));

            return validaPosicao();
        }
        return false;
    }

    public void addKey() {
        this.quant_keys++;
    }

    public void addWeapon() {
        this.quant_weapons++;
    }

    public void subtractKey() {
        this.quant_keys--;
    }

    public void printQuantKey() {
        System.out.format("Quantidade de chaves e: %d", this.quant_keys);
    }

    public void printQuantWeapo() {
        System.out.format("Quantidade de arma e: %d", this.quant_weapons);

    }

    public int getKeyQuant() {
        return this.quant_keys;
    }

    public int getWeaponQuant() {
        return this.quant_weapons;
    }

    public void add_doorOpened() {
        this.opened_doors++;
    }

    public int getEnemiesKilled() {
        return this.opponents_killed;
    }

    public void add_opponent_killed() {
        this.opponents_killed++;
    }

    public void add_lifeQuant() {
        this.life_quant++;
    }

    public void subtract_lifeQuant() {
        this.life_quant--;
    }

    public int getLifeQuant() {
        return this.life_quant;
    }
}
