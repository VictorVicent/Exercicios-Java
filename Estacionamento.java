/*
4. Um estacionamento cobra R$ 5,00 de taxa mínima para estacionar por 1 hora. O estacionamento cobra um adicional 
de R$ 3,00 para cada hora ou parte de hora que exceda o período de 1
hora. A taxa máxima para um período de 24 horas é de R$ 50,00. Assuma que nenhum carro
permanece estacionado por mais de 24 horas. Escreva um programa em Java que exiba o custo
do estacionamento para cada cliente que estacionou seu carro neste estacionamento. Você deve
informar por quanto tempo cada cliente permaneceu com seu carro estacionado. O programa
deve exibir a taxa do cliente atual e no final exibir o total arrecadado pelo estacionado no dia. O
programa deve utilizar um método double calcularTaxa(int horas) para determinar a
taxa de cada cliente e um método double obterFaturamentoDiaro() para determinar o
faturamento diário do estacionamento.
*/

package POO;
import java.util.Scanner;

public class Estacionamento {
    private static final double minimo = 5.0;
    private static final double adicionalhora = 3.0;
    private static final double maximadia = 50.0;

    private double faturamentoDiario = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estacionamento estacionamento = new Estacionamento();

        System.out.print("Quantos clientes estacionaram hoje? ");
        int numClientes = scanner.nextInt();

        for (int i = 1; i <= numClientes; i++) {
            System.out.print("Quantas horas o cliente " + i + " permaneceu estacionado? ");
            int horas = scanner.nextInt();

            double taxa = estacionamento.calcularTaxa(horas);
            System.out.printf("Taxa do cliente %d: R$ %.2f\n", i, taxa);

            estacionamento.faturamentoDiario += taxa;
        }

        System.out.printf("Faturamento diário: R$ %.2f\n", estacionamento.obterFaturamentoDiario());

        scanner.close();
    }

    public double calcularTaxa(int horas) {
        double taxa = minimo;

        if (horas > 1) {
            taxa += (horas - 1) * adicionalhora;
        }

        if (taxa > maximadia) {
            taxa = maximadia;
        }

        return taxa;
    }

    public double obterFaturamentoDiario() {
        return faturamentoDiario;
    }
}