package lib;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
public class EmpleadoTests
{
    @Test
    void calcularSueldo_debe_devolver_sueldo_1_test() {
        Empleado empleado = new Empleado();
        empleado.setHorasTrabajadas(1);
        empleado.setHijos(0);
        empleado.setMontoPorHijo(1);
        empleado.setMontoPorHora(1);
        //assert empleado.montoPorHora() == 1;
        //assert empleado.cantidadDeHijos() == 0;
        assert empleado.calcularSueldo() == 1;
    }


    @Test
    void calcularSueldo_con_2_hijos_debe_devolver_sueldo_3_test() {
        Empleado empleado = new Empleado();
        empleado.setHorasTrabajadas(1);
        empleado.setHijos(2);
        empleado.setMontoPorHijo(1);
        empleado.setMontoPorHora(1);
        //assert empleado.montoPorHora() == 1;
        //assert empleado.cantidadDeHijos() == 2;
        assert empleado.calcularSueldo() == 3;
    }


    @Test
    void calcularSueldo_con_4_hijos_horas_10_debe_devolver_sueldo_24() {
        Empleado empleado = new Empleado();
        empleado.setHijos(4);
        empleado.setMontoPorHora(2);
        empleado.setMontoPorHijo(1);
        empleado.setHorasTrabajadas(10);
        //assert empleado.montoPorHora() == 2;
        //assert empleado.cantidadDeHijos() == 4;
        assert empleado.getHorasTrabajadas() == 10;
        assert empleado.calcularSueldo() == 24;
    }
}

