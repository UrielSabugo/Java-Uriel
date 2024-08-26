import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChuckNorrisTest {

    @Test
    public void ChuckNorrisInvencible(){

        ChuckNorris ch1 = new ChuckNorris();
        
        assertTrue(ch1.estaVivo());
        ch1.recibirDisparo();
        assertTrue(ch1.estaVivo()); 
    }
    
}
