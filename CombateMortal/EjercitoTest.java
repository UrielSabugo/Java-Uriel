package CombateMortal;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EjercitoTest {

     @Test
     public void soldadoSinEscudoTest(){

        Soldado s1= new Soldado();
        
        assertTrue(s1.estaVivo());
        s1.recibirDisparo();
        assertFalse(s1.estaVivo());
    }

    
}

