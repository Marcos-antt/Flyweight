package org.example;

public class Test {

    private FabricarFrutas fabricaFrutas;

    public void testPessoa() {
        new FabricarFrutas();
        Pessoa pessoa = new Pessoa(fabricaFrutas);

        pessoa.comerFruta("maçã");
        pessoa.comerFruta("banana");
        pessoa.comerFruta("maçã");

        assertEquals(2, fabricaFrutas.getFruta("1"));
    }
}
