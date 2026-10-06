package org.example;

public class FabricaMotor implements FabricaAbstrata {
    public Veiculo produzirCarro() {
        return new Carro(new Motor());
    }

    public Veiculo produzirMoto() {
        return new Moto(new Motor());
    }

    public Veiculo produzirCaminhao() {
        return new Caminhao(new Motor());
    }
}