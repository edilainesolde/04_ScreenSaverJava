package model;

import java.awt.Graphics2D;


public class Retangulo extends Forma {
    private int altura;
    private int base;


    //Construtor
    public Retangulo (int x, int y, int base, int altura) {
        //sempre inicia primeiro a classe pai, chamando o construtor da classe Forma
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    public void desenhar (Graphics2D g){
        g.setColor(cor);
        g.fillRect(x, y , base, altura);
    }
}
