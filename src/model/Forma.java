package model;

import java.awt.Color;
import java.awt.Graphics2D;


public abstract class Forma {
    //Atributos
    protected  int x;
    protected int y;
    protected int velx;
    protected int vely;
    protected Color cor;

    //Construtor
    public Forma (int x, int y){
        this.x = x;
        this.y = y;
        velx = 0;
        vely = 0;
        cor = new Color (255, 0 , 0);
    }
    //Métodos

    public abstract void desenhar (Graphics2D g);



}
