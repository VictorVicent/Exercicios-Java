/*3. Crie uma classe Casa com os seguintes atributos: cor (String), porta1 (Porta), porta2 (Porta) e
porta3 (Porta). A classe deve possuir pelo menos um construtor, os métodos getters e setters
que você julgar necessários, e os métodos: void pintar(String c), int quantasPortasEstaoAbertas(). Crie uma casa e pinte-a. Defina as dimensões das portas da casa, abra e feche as mesmas
como desejar. Utilize o método quantasPortasEstaoAbertas() para imprimir o número de portas
abertas.*/

package casa;

public class casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public casa(String cor, Porta porta1, Porta porta2, Porta porta3) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta porta2) {
        this.porta2 = porta2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta porta3) {
        this.porta3 = porta3;
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public int quantasPortasEstaoAbertas() {
        int cont = 0;
        if (porta1.estaAberta()) {
            cont++;
        }
        if (porta2.estaAberta()) {
            cont++;
        }
        if (porta3.estaAberta()) {
            cont++;
        }
        return cont;
    }
}

