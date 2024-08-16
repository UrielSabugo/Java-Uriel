package lib;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class HijoEmpleadoTests{
    @Test
    void calcularNacimiento() {
        HijoEmpleado hEmpleado = new HijoEmpleado();
        hEmpleado.setNacimiento(1999);
        assert hEmpleado.getEdad()==25;
    }

    @Test
    void hijosLista(){
        HijoEmpleado e1= new HijoEmpleado(4510, "Uriel", 2004);
        Empleado h1= new Empleado();
        h1.agregarHijos(e1);
    
    }


    
}
