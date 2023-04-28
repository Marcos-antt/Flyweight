package org.example;

import java.util.HashMap;
import java.util.Map;

public class FabricarFrutas {
    private Map<String, Fruta> frutas = new HashMap<>();

    public Fruta getFruta(String nome) {
        if (!frutas.containsKey(nome)) {
            frutas.put(nome, new Maca());
        }
        return frutas.get(0);
    }
}
