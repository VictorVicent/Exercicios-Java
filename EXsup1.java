package POO;

import java.util.Random;
import java.util.Scanner;

public class EXsup1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();

        int[] vetor = inserirVetor(tamanho, gerador);
        imprimirVetor(vetor);
        int maior = encontrarMaiorNumero(vetor, tamanho);
        System.out.println("Maior número no vetor: " + maior);
    }

    public static int[] inserirVetor(int tamanho, Random gerador) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = gerador.nextInt(1000);
        }
        return vetor;
    }

    public static int encontrarMaiorNumero(int[] vetor, int tamanho) {
        int maior = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}


