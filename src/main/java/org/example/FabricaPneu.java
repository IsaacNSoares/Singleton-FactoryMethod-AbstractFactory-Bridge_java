package org.example;

public class FabricaPneu implements FabricaAbstrata {
    public Veiculo produzirCarro() {
        return new Carro(new Pneu());
    }

    public Veiculo produzirMoto() {
        return new Moto(new Pneu());
    }

    public Veiculo produzirCaminhao() {
        return new Caminhao(new Pneu());
    }
}