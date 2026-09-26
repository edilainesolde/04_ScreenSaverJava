package model;

import java.awt.Color;
import java.awt.Graphics2D;


public class Forma {
    //Atributos
    private int x;
    private int y;
    private int velx;
    private int vely;
    private Color cor;

    //Construtor
    public Forma (int x, int y){
        this.x = x;
        this.y = y;
        this.velx = 0;
        this.vely = 0;
        this.cor = new Color (255, 0 , 0);
    }
    //Métodos
    public void setVelocidade(int velx, int vely){
        this.velx = velx;
        this.vely = vely;
    }
    public void desenhar (Graphics2D g){
        g.setColor(cor);
        g.fillRect(x, y, 100, 50);
    }
}
