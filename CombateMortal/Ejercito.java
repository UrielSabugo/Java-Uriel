package CombateMortal;
public class Ejercito {
    
    private int vida;
    private Escudo escudo;


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
        int daño=1;
        if (escudo != null) {
            daño *= (1 - escudo.getPorcentaje() / 100.0);
        }
        setVida(Math.max(0, getVida() - daño));
    }

    public boolean estaVivo(){
        return vida>0;
    }

    public void aplicarEscudo(Escudo escudo){
        this.escudo=escudo;

    }
    
    public Ejercito(){

    }
}