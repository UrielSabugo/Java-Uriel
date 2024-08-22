public class Buque extends Ejercito{

    public Buque(){
        super(3);
    }

    public void disparar(Ejercito objetivo){

        objetivo.recibirDisparo();
    }
    

}