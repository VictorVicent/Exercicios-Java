/*
2. Crie uma classe Porta com os seguintes atributos: aberta (boolean), cor (String), altura (float) e
largura (float). A classe deve possuir pelo menos um construtor e os métodos: void abrir(), void
fechar(), void pintar(String c), boolean estaAberta(), void setAltura(float a) e void
setLargura(float l). Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas
dimensões e use o método estaAberta() para verificar se ela está aberta.
*/

public class Porta {


    private boolean aberta;
    private String cor;
    private float altura;
    private float largura;

    public Porta(boolean aberta, String cor, float altura, float largura) {
        this.aberta = aberta;
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
    }

      public boolean estaAberta() {
        return this.aberta;
    }



    public void abrir() {
        this.aberta = true;
        System.out.println("A porta foi aberta. Não esqueça de fecha-la!");
    }

    public void fechar() {
        this.aberta = false;
        System.out.println("A porta foi fechada. Até a próxima vez!");
    }

    public void pintar(String c) {
        this.cor = cor;
        System.out.println("A porta foi pintada de " + cor + ".");
    }


    public void setAltura(float altura) {
        this.altura = altura;
        System.out.println("A altura da porta foi alterada para " + altura + ".");
    }

    public void setLargura(float largura) {
        this.largura = largura;
        System.out.println("A largura da porta foi alterada para " + largura + ".");
    }

    public static void main(String[] args) {
        Porta porta = new Porta(false, "vermelho", 2.1F, 0.8F);

        porta.abrir();
        System.out.println("Condição da Porta: " + porta.estaAberta());

        porta.fechar();
        System.out.println("Condição da Porta: " + porta.estaAberta());

        porta.abrir();
        System.out.println("Condição da Porta: " + porta.estaAberta());

        porta.pintar("");

        porta.setAltura(2.2f);
        porta.setLargura(0.9f);
    }
}