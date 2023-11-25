/*
5. Escreva uma classe que contenha um método chamado drawSquare que exibe um quadrado
sólido de asteriscos no vídeo cujo lado é especificado por um parâmetro side. Por exemplo, se
side for igual a 4, o método exibe:
****
****
****
****
6. Acrescente uma nova versão do método drawSquare à classe do exercício anterior que desenha um quadrado preenchido com o caractere dado pelo parâmetro fillCharacter. Portanto,
se side for igual a 5 e fillCharacter for '#', o método deve exibir:
#####
#####
#####
#####
#####
Escreva um programa para testar as duas versões do método do método drawSquare.
*/
public class Quadradin {

	
    public static void drawSquare(int side) {
        for(int i = 0; i < side; i++) {// anda pelas linhas do quadrado
            for(int j = 0; j < side; j++) {// anda pelas colunas do quadrado
                System.out.print("* ");// mostra o asterisco
            }
            System.out.println();// quebra a linha depois de mostrar a linha de asteriscos
        }
    }
     
    public static void drawSquare(int side, char fillCharacter) {
        for(int i = 0; i < side; i++) {
            for(int j = 0; j < side; j++) {
                System.out.print(fillCharacter + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int side = 5;
        char fillCharacter = '#';
        drawSquare(4);// faz um quadrado 
        System.out.println();
        drawSquare(side, fillCharacter);//Faz o outro quadrado 
    }
}