import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MatematicaTest  {

	
	/**
	 * Fallara en el caso de que el resultado esperado no sea el mismo que el que aparece
	 * o cuando en vez de un int introduzcamos un string
	 */

	@Test
	public void testSuma() {
		
		Matematica suma = new Matematica();
		
		int resultado = suma.suma(6, 6);
		int resultadoEsperado = 12;
		
		assertEquals(resultado, resultadoEsperado);
		
	}
	
	
	/**
	 * Fallara en el caso de que el primer numero sea menor que el segundo numero
	 * 
	 */
	@Test	
	public void testMayor(){
		
		Matematica esMayor = new Matematica();
		
		assertTrue(esMayor.mayor(6, 2));
	}
	
	
	/**
	 * Fallara en el caso de que el ArrayList este vacio
	 */
	@Test
	public void testSumas(){
		
		
		ArrayList<Integer> listaSumas = Matematica.sumas();
		assertNotNull(listaSumas);
	}

}
