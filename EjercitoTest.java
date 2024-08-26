import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.*;



public class EjercitoTest {

     @Test
     public void soldadoSinEscudoTest(){

        Soldado s1= new Soldado();
        
        s1.recibirDisparo();
        assertFalse(s1.estaVivo());
    }

    @Test
    public void soldadoConEscudo(){
        Soldado s1 = new Soldado();

        s1.aplicarEscudo(50);
        s1.recibirDisparo();
        assertTrue(s1.estaVivo());
        s1.recibirDisparo();
        assertFalse(s1.estaVivo());

    }
    
}

