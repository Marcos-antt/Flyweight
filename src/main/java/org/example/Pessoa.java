package org.example;

public class Pessoa {
    private FabricarFrutas fabricarFrutas;

    public Pessoa(FabricarFrutas fabricarFrutas){
        this.fabricarFrutas = fabricarFrutas;
    }
    public void comerFruta(String nomeFruta){
        Fruta fruta = fabricarFrutas.getFruta(nomeFruta);
        fruta.comer();
    }
}
