package POO;


import java.util.Scanner;


public class Matriz {

	
    public static void main(String[] args) {
    	
    	Scanner mat = new Scanner(System.in);

    	
        System.out.print("Registre aqui a quantidade de linhas da sua matriz: ");
        int linhas = mat.nextInt();

        System.out.print("Registre aqui a quantidade de colunas da matriz: ");
        int colunas = mat.nextInt();

        
        int[][] matriz = populaMatriz(linhas, colunas);
        percorrerMatriz(matriz);
    }

    public static int[][] populaMatriz(int linhas, int colunas) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Digite o valor da posição desejada [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static void percorrerMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

}