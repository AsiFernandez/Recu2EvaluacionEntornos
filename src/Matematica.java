import java.util.ArrayList;

public class Matematica {
	
	
	private static  ArrayList<Integer> sumas = new ArrayList<Integer>();
	
	
	/**
	 * hara la suma de dos numeros, la mostrara, la guardara en un arraylist suma
	 * @param a  es el valor 1 de la suma 
	 * @param b  es el valor 2 de la suma
	 * @return
	 */
	public int suma(int a, int b){
		ArrayList<Integer> sumas = new ArrayList<Integer>();
		
		int resultado;
		resultado = a + b;
		return resultado;
		
	}
	
	
	
	/**
	 * hara una comparacion de dos numero  nos dira si el primer numero es mayor que el segundo
	 * @param a es el valor 1
	 * @param b es el valor 2
	 * @return nos retornara true en caso de que el numero a sea mayor que el numero b, sino devolvera false
	 */
	public boolean mayor(Integer a, Integer b){
		
		boolean esMayor = false;
		
		if (a > b) {
			esMayor=true;			
		}
		
		return esMayor;
		
	}
	
	
	/**
	 * Devolvera un arraylist con las sumas realizadas
	 * @return la sumas anteriormente guardadas en el ArrayList 
	 */
	public static  ArrayList<Integer> sumas(){
		
		return sumas;
		
	}
	
	
	
	
	
	
}
