
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTests
{
    @Test
    void test1() {
        CajaDeAhorro caja = new CajaDeAhorro();
        assert caja.saldo() == 0;
    }
    @Test
    void test2() {
        CajaDeAhorro caja = new CajaDeAhorro();
        caja.depositar(100);
        assert caja.saldo() == 100;
    }
    @Test
    void extraer_cuando_deposito_100_extraigo_10_debe_quedar_90() {
        CajaDeAhorro caja = new CajaDeAhorro();
        caja.depositar(100);
        caja.extraer(10);
        assert caja.saldo() == 90;
    }
    @Test
    void extraer_cuando_deposito_100_extraigo_110_debe_arrojar_un_error() {
        CajaDeAhorro caja = new CajaDeAhorro();
        caja.depositar(100);
       
        assertThrows(RuntimeException.class, () -> {
            caja.extraer(110);
        }, "Saldo insuficiente");
    }
 
}