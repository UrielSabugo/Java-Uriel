import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import com.example.Main;
public class BuqueTest {
   @Test
    public void buqueSinEscudo(){
        Buque b1 = new Buque();

        assertTrue(b1.estaVivo());
        b1.recibirDisparo();
        assertTrue(b1.estaVivo());
        b1.recibirDisparo();
        assertTrue(b1.estaVivo());
        b1.recibirDisparo();
        assertFalse(b1.estaVivo());
        
        
    
    }
}
