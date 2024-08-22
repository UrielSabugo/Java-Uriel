package GoL;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TableroTest {
    @Override
    @Test
    @Before
    public void testTablero() {
      
        var tablero = new Tablero(3, 3);
        ArrayList<ArrayList<Celula>> celdas = tablero.getCelda();

        assertEquals(5, celdas.size(), "El número de filas debe ser 3.");
        assertEquals(5, celdas.get(0).size(), "El número de columnas debe ser 5.");
        
        // Verificar que todas las celdas están inicialmente muertas
        for (ArrayList<Celula> fila : celdas) {
            for (Celula celula : fila) {
                assertFalse(celula.getViva(), "Todas las celdas deben estar inicialmente muertas.");
            }
        }
    }

    @Test
    public void testSetCelula() {
        Tablero tablero = new Tablero(3, 3);
        tablero.setCelula(2, 3, true);
        
        assertTrue(tablero.getCelda().get(2).get(3).getViva(), "La célula en (2, 3) debe estar viva.");
    }

    @Test
    public void testSetCelulaFueraDeRango() {
        Tablero tablero = new Tablero(3, 3);
        tablero.setCelula(10, 10, true);
        
        // No debe lanzar una excepción ni cambiar el estado de alguna celda válida
        assertFalse(tablero.getCelda().get(0).get(0).getViva(), "La célula en (0, 0) debe estar muerta.");
    }
}
