package Archivos;
import static org.junit.Assert.assertEquals; 
import org.junit.Test;

public class ArchivoBaseTest {

    @Test
    public void testCarpetaNombreTamanio() {
        Carpeta c1 = new Carpeta(64, "c1");
        c1.setNombre("c1");
        c1.setTamanio(64);
        assertEquals("c1", c1.getNombre()); 
        assertEquals(64, c1.getTamanio());   
    }

    @Test
    public void testArchivoNombreTamanio() {
        Archivo a1 = new Archivo(10, "a1");
        a1.setNombre("a1");
        a1.setTamanio(10);
        assertEquals("a1", a1.getNombre());  
        assertEquals(10, a1.getTamanio());     
    }

    @Test
    public void testNuevaCarpetaUcp() {
        Carpeta ucp = new Carpeta(64, "Ucp");
        Carpeta Materias = new Carpeta(64, "Materias");
        Archivo TP1 = new Archivo(164, "TP1");
        Archivo Calendario = new Archivo(320, "Calendario");
        //agregamos contenido al array
        Materias.agregarContenido(TP1);
        Materias.agregarContenido(Calendario);
        ucp.agregarContenido(Materias);

        //carpeta ucp
        ucp.setNombre("Ucp");
        ucp.setTamanio(64);
        assertEquals("Ucp", ucp.getNombre()); 
        assertEquals(64, ucp.getTamanio());  
        
        //carpeta Materias
        Materias.setNombre("Materias");
        Materias.setTamanio(64);
        assertEquals("Materias", Materias.getNombre()); 
        assertEquals(64, Materias.getTamanio()); 

        //archivo TP1
        TP1.setNombre("TP1");
        TP1.setTamanio(164);
        assertEquals("TP1",TP1.getNombre()); 
        assertEquals(164, TP1.getTamanio()); 

        //archivo Calendario
        Calendario.setNombre("Calendario");
        Calendario.setTamanio(320);
        assertEquals("Calendario", Calendario.getNombre()); 
        assertEquals(320, Calendario.getTamanio()); 

        int total= 64 + 64 + 164 + 320; // suma
        assertEquals(total, ucp.calcularTamanioTotal());
    }

}
