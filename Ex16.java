package POO;

import java.util.Scanner;

public class Ex16 {

    /*public static String LKM(int x, int y, double z) {
        int totallitro = (int) Math.ceil(x / (double) y); 
        int valortotal = (int) Math.round(totallitro * z); 
        return "A quantidade de Litros que voce vai precisar é de: " + totallitro + "L de gasolina, e o valor vai ser de: " + valortotal+"R$";
    }*/

    public static void main(String[] args) {
     /*  Scanner input = new Scanner(System.in);

        System.out.print("Digite a distancia que voce quer percorrer em km: ");
        int distancia = input.nextInt();

        System.out.print("Digite quantos KM seu carro faz por litro: ");
        int kmrodado = input.nextInt();

        System.out.print("Digite o preço do litro da gasolina no posto que voce vai abastecer com a seguinte formatação: xx.xx: ");
        double preco = input.nextDouble();

        System.out.println(LKM(distancia, kmrodado, preco));

        input.close();
    }*/
    	
    int distancia = 520;
    int kmrodado = 12;
    double valorgas = 1.50;
    int totallitro = distancia/kmrodado;
    double valortotal = totallitro * valorgas;
    
    System.out.println("A quantidade em litros que voce vai precisar é de: "+ totallitro +" o valor que voce vai gastar é de: "+valortotal+"R$");

}}