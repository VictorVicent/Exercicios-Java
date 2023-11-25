package retangulo;

public class Retangulo {
    private double altura;
    private double largura;
    private double posX;
    private double posY;
    
    public Retangulo() {
        this.altura = 0;
        this.largura = 0;
        this.posX = 0;
        this.posY = 0;
    }
    
    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
        this.posX = 0;
        this.posY = 0;
    }
    
    public Retangulo(double altura, double largura, double posX, double posY) {
        this.altura = altura;
        this.largura = largura;
        this.posX = posX;
        this.posY = posY;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getLargura() {
        return largura;
    }
    
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public double getPosX() {
        return posX;
    }
    
    public void setPosX(double posX) {
        this.posX = posX;
    }
    
    public double getPosY() {
        return posY;
    }
    
    public void setPosY(double posY) {
        this.posY = posY;
    }
    
    public double calcularArea() {
        return altura * largura;
    }
    
    public boolean temInterseccao(Retangulo outro) {
        if (this.posX + this.largura < outro.posX || this.posX > outro.posX + outro.largura) {
            return false;
        }
        if (this.posY + this.altura < outro.posY || this.posY > outro.posY + outro.altura) {
            return false;
        }
        return true;
    }
}