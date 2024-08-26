

public class Buque extends Ejercito{

    public Buque(){
        super(3);// inicializamos con 1 vida
    }

    public boolean estaVivo(){
        return false;
    }

    public void disparar(Ejercito objetivo){
    
        objetivo.recibirDisparo();
    }
    

}