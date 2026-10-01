package org.example;

public class Caminhao extends Veiculo {

    public Caminhao(FabricaAbstrata fabrica) {
        super(fabrica);
    }

    @Override
    public String produzirDirecao() {
        return "Montagem do Caminhão: " + this.direcao.produzir();
    }

    @Override
    public String produzirPneu() {
        return "Montagem do Caminhão: " + this.pneu.produzir();
    }
}