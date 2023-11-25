package POO;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidade = 7;
        int[] idades = new int[quantidade];
        int[] pesos = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a ª" + (i + 1) + " idade: ");
            idades[i] = input.nextInt();

            System.out.print("Digite o " + (i + 1) + " peso em KG: ");
            pesos[i] = input.nextInt();
        }

        resultado(idades, pesos, quantidade);
    }

    public static void resultado(int[] idades, int[] pesos, int quantidade) {
        int contador = 0;

        int soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma += idades[i];
        }

        int media = soma / quantidade;

        System.out.println("Os pesos maiores que 90 são: ");
        for (int i = 0; i < quantidade; i++) {
            if (pesos[i] >= 90) {
                System.out.println(pesos[i]);
                contador++;
            }
        }
        System.out.println("A quantidade de pessoas com peso maior que 90KG é de: " + contador);

        System.out.println("A medias das idades é :" + media);
    }
}
