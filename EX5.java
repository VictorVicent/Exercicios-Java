package POO;

public class EX5 {

	public static void main(String[] args) {
		        int soma = calculoDaSomaDosPares(100);  
		        System.out.println("Calculo da soma dos primeiros 50 números pares: " + soma);
		    }
	// função soma que recebe o parâmetro(limite até onde vai)
    public static int calculoDaSomaDosPares(int max) {
        int soma = 0;
        for (int i = 2; i <= max; i += 2) {
            soma += i;
        }
        return soma;
    }
}


