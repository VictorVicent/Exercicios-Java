package retangulo;

public class Main {
	 public static void main(String[] args) {
	        Retangulo retangulo1 = new Retangulo();
	        Retangulo retangulo2 = new Retangulo(5, 10);
	        Retangulo retangulo3 = new Retangulo(3, 8, 2, 4);
	        Retangulo retangulo4 = new Retangulo(7, 6, 1, 3);
	        
	        System.out.println("Área do retângulo 1: " + retangulo1.calcularArea());
	        System.out.println("Área do retângulo 2: " + retangulo2.calcularArea());
	        System.out.println("Área do retângulo 3: " + retangulo3.calcularArea());
	        System.out.println("Área do retângulo 4: " + retangulo4.calcularArea());
	        
	        if (retangulo1.temInterseccao(retangulo2)) {
	            System.out.println("Os retângulos 1 e 2 se interceptam");
	        } else {
	            System.out.println("Os retângulos 1 e 2 não se interceptam");
	        }
	        
	        if (retangulo3.temInterseccao(retangulo4)) {
	            System.out.println("Os retângulos 3 e 4 se interceptam");
	        } else {
	        	
	        }
	    }
}