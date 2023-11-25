package POO;

import java.util.Scanner;

public class EX21 {
	public static void main(String[] args) {
		        
		        Scanner entrada = new Scanner(System.in);
		        
		        System.out.print("Passe aqui a primeira nota: ");
		        int n1 = entrada.nextInt();//lendo n1
		        
		        System.out.print("Passe aqui a segunda nota: ");
		        int n2 = entrada.nextInt();//lendo n2
		        
		        System.out.print("Passe aqui a terceira nota: ");
		        int n3 = entrada.nextInt();//lendo n3

		        
		        int media = calculoMedia(n1, n2, n3);//Chamando a função calculoMedia e armazenando o resultado na variável
		        
		        System.out.println("A média das notas é: " + media);
		        
		        if (media >= 7.0) {
		            System.out.println("Situação do Aluno: aprovado.");
		        } else {
		            System.out.println("Situação do Aluno: retido");
		        }
	}
		        
		        public static int calculoMedia(int n1, int n2, int n3) {
		            int media = (n1 + n2 + n3) / 3;//calculo
		            return media;//retorno
		        }
		    }

