package model;

import java.awt.Graphics2D;


public class Retangulo extends Forma {
    private int largura;
    private int altura;


    //Construtor
    public Retangulo (int x, int y, int largura, int altura) {
        //sempre inicia primeiro a classe pai, chamando o construtor da classe Forma
        super(x, y, largura, altura);
        this.largura = largura;
        this.altura = altura;
    }
    public void desenhar (Graphics2D g){
        g.setColor(cor);
        g.fillRect(x, y , largura, altura);
    }
}
