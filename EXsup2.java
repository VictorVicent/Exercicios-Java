package POO;
import java.util.Random;
import java.util.Scanner;

public class EXsup2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();

        System.out.print("Digite o número de linhas da matriz: ");
        int lin = input.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int col = input.nextInt();

        int[][] matriz = preencherMatriz(lin, col, gerador);
        int menor = encontrarMenorNumero(matriz);

        System.out.println("Menor número na matriz: " + menor);

        System.out.println("Matriz:");
        imprimirMatrizHorizontal(matriz);
        System.out.println();
        //imprimirMatrizVertical(matriz);
    }

    public static int[][] preencherMatriz(int lin, int col, Random gerador) {
        int[][] matriz = new int[lin][col];
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = gerador.nextInt(1000);
            }
        }
        return matriz;
    }

    public static int encontrarMenorNumero(int[][] matriz) {
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static void imprimirMatrizHorizontal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
/*
    public static void imprimirMatrizVertical(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        } */ 
  }
