import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CombateMortal.Soldado;

public class EjercitoTest {

     @Test
     public void soldadoSinEscudoTest(){

        Soldado s1= new Soldado();
        
        s1.recibirDisparo();
        assertFalse(s1.estaVivo());
    }

    
}

