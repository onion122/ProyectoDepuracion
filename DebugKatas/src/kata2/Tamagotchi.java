package kata2;

public class Tamagotchi {
	
// La clase Tamagotchi tiene los siguientes atributos.
	private int hambre;
	
	private int energía;
	
	private int humor;

// En el constructor inicializamos a 4 los atributos.
	public Tamagotchi() {
		
		hambre = 4;
		
		energía = 4;
		
		humor = 4;
		
	}
	
/* En contra de las instrucciones, creamos el método estado que nos
 * ayudará a simplificar el código, si nos ahorramos este método
 * sólamente tendríamos que introducir su contenido donde aparece
 * estado en los demás métodos y funcionaría igual.*/
	private String estado() {
		String estado;
		
		if (humor > 8) {
			
			estado = ":-)";
			
		} else if (energía < 3) {
			
			estado = "(-_-)";
			
		} else if (energía == 0) {
			
			estado = "(-_-) zZZ";
			
		} else if (humor < 2) {
			
			estado = "ఠ_ఠ";
			
		} else {
			
			estado = ":-|";
			
		}
		
		return estado;
		
	}
	
/* El método comer resta 2 puntos a comer y a la energía 1 punto,
 * posteriormente nos devuelve el estado.*/
	public String comer() {
		
		hambre -= 2;
		
		energía--;
		
		return estado();
		
	}
	
/* El método jugar suma 1 punto al hambre y al humor, y resta 1 punto
 * a la energía, luego nos devuelve el estado.*/
	public String jugar() {
		
		hambre++;
		
		humor++;
		
		energía--;
		
		return estado();
		
	}
	
/* El método dormir suma 2 puntos a la energía, nos devuelve el estado 
 * de dormido.*/
	public String dormir() {
		
		energía += 2;
		
		return "(-_-) zZZ";
		
	}
	
	public static void main(String[] args) {

/* Ahora probamos nuestro tamagotchi simplificado, imprimiendo directamente
 * los resultados de los métodos que hemos hecho.
 * Al no tener límites se pueden imprimir todos los que se quieran y no 
 * funciona tan bien como uno original pero nos sirve para ver el funcionamiento.*/
		Tamagotchi manolo = new Tamagotchi();
		
		System.out.println(manolo.jugar());
		System.out.println(manolo.jugar());
		System.out.println(manolo.jugar());
		System.out.println(manolo.dormir());
		System.out.println(manolo.dormir());
		System.out.println(manolo.dormir());
		System.out.println(manolo.comer());
		System.out.println(manolo.jugar());
		System.out.println(manolo.jugar());
		System.out.println(manolo.jugar());
		System.out.println(manolo.jugar());
		System.out.println(manolo.dormir());


	}

}
