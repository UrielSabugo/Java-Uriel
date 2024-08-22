public class Buque extends Ejercito{

    public Buque(){
        super(3);// inicializamos con 1 vida
    }

    public void disparar(Ejercito objetivo){

        objetivo.recibirDisparo();
    }
    

}