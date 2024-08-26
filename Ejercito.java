
public class Ejercito {
    
    private int vida;
    protected int escudo;
    private boolean vivo;


    public Ejercito(int estaVivo){
        estaVivo = vida;
    }

    public int getVida(){
        return vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public void recibirDisparo() {
        vida--;
    }

    public boolean estaVivo(){
        return vida>0;
    }

    public static void aplicarEscudo(int escudo){
        this.escudo=escudo;

    }
    
    public Ejercito(){
    }

}