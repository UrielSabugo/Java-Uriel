import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TanqueTest {
    @Test
    public void TanqueConEscudo(){

        Tanque t1= new Tanque();
        Escudo e1= new Escudo(50);
        //assertTrue(t1.estaVivo());
        //daño al 50%
        t1.aplicarEscudo(e1);

        //recibe +2 disparos y muere
        assertTrue(t1.estaVivo());
        t1.recibirDisparo();
        t1.recibirDisparo();
        t1.recibirDisparo();
        assertFalse(t1.estaVivo());
    }

}
