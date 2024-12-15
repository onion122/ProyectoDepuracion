package kata1;

public class FizzBuzz {

    public static void main(String[] args) {
    	
/* Para la kata fizz buzz he definido un bucle for
 * que comienza en 1 y va sumando de 1 en 1 hasta llegar a
 * 100, en cada número se verificará lo de dentro del 
 * bucle.*/
        for (int i = 1; i <= 100; i++) {
        	
/* Si el número es divisible entre 15, significa que es
 * divisible tanto por tres como por 5, a lo que el programa
 * responderá FizzBuzz.*/
            if (i % 15 == 0) {
            	
                System.out.println("FizzBuzz");
                
// Si es divisible entre 3 responderá Fizz.  
            } else if (i % 3 == 0) {
            	
                System.out.println("Fizz");
                
// Y si es divisible entre 5 imprimirá Buzz.
            } else if (i % 5 == 0) {
            	
                System.out.println("Buzz");
                
/* Si no es divisible por ninguno de los dos, imprimirá el número
 * sin más.*/
            } else {
            	
                System.out.println(i);
                
            }    
        }
    }
}
