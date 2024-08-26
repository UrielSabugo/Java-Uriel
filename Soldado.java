

public class Soldado extends Ejercito{

    public Soldado(){
        super(1);// inicializamos con 1 vida
        Soldado.aplicarEscudo(escudo);
    }

    public void disparar(Ejercito objetivo){

        objetivo.recibirDisparo();
    }
    
}
