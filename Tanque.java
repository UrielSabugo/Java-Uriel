

public class Tanque extends Ejercito{

    public Tanque(){

        super(2);
    }

    public void disparar(Ejercito objetivo){
        objetivo.recibirDisparo();
    }
    
}
