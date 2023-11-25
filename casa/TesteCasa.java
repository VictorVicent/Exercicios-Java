/*3. Crie uma classe Casa com os seguintes atributos: cor (String), porta1 (Porta), porta2 (Porta) e
porta3 (Porta). A classe deve possuir pelo menos um construtor, os métodos getters e setters
que você julgar necessários, e os métodos: void pintar(String c), int quantasPortasEstaoAbertas(). Crie uma casa e pinte-a. Defina as dimensões das portas da casa, abra e feche as mesmas
como desejar. Utilize o método quantasPortasEstaoAbertas() para imprimir o número de portas
abertas.*/

package casa;

public class TesteCasa {
    public static void main(String[] args) {
        // Cria três portas com dimensões diferentes
        Porta porta1 = new Porta(1.0, 2.0);
        Porta porta2 = new Porta(0.8, 2.1);
        Porta porta3 = new Porta(0.9, 2.2);

        // Cria uma casa com as portas criadas e a pinta de amarelo
        casa casa = new casa("amarelo", porta1, porta2, porta3);

        // Abre e fecha as portas como desejar
        porta1.abrir();
        porta2.fechar();
        porta3.abrir();

        // Imprime o número de portas abertas
        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
    }
}

