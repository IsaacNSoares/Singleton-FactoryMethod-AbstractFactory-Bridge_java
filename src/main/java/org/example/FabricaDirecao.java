package org.example;

public class FabricaDirecao implements FabricaAbstrata {
    public Veiculo produzirCarro() {
        return new Carro(new Direcao());
    }

    public Veiculo produzirMoto() {
        return new Moto(new Direcao());
    }

    public Veiculo produzirCaminhao() {
        return new Caminhao(new Direcao());
    }
}