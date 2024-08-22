package CombateMortal;
public class Soldado extends Ejercito{

    public Soldado(){
        super(1);// inicializamos con 1 vida
    }

    public void disparar(Ejercito objetivo){

        objetivo.recibirDisparo();
    }
    
}
