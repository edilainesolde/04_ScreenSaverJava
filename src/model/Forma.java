package model;

import java.awt.Color;
import java.awt.Graphics2D;


public abstract class Forma {
    //Atributos
    protected  int x;
    protected int y;
    protected int velx;
    protected int vely;
    protected int altura;
    protected int largura;
    protected Color cor;

    //Construtor
    public Forma (int x, int y, int largura, int altura){
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
        velx = 4;
        vely = 1;
        cor = new Color (255, 0 , 0);
    }
    //Métodos

    public abstract void desenhar (Graphics2D g);

    public void mover (int width, int height){

        x += velx;
        if (x < 0 || (x + largura) > width){
            velx = -velx;
        }

    }
}


