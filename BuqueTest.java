import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class BuqueTest {
   @Test
    public void buqueSinEscudo(){
        Buque b1 = new Buque();

        b1.recibirDisparo();
        b1.recibirDisparo();
        b1.recibirDisparo();
        assertFalse(b1.estaVivo());
    }
}
