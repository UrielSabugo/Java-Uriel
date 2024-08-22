package com.CombateMortal;

import com.CombateMortal.Escudo;

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
        int danio=1;
        if (escudo != null) {
            danio *= (1 - escudo.getPorcentaje() / 100.0);
        }
        setVida(Math.max(0, getVida() - danio));
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