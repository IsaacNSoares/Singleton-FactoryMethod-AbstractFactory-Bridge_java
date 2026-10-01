package org.example;

public class Onibus extends Veiculo {

    public Onibus(FabricaAbstrata fabrica) {
        super(fabrica);
    }

    @Override
    public String produzirDirecao() {
        return "Montagem do Ônibus: " + this.direcao.produzir();
    }

    @Override
    public String produzirPneu() {
        return "Montagem do Ônibus: " + this.pneu.produzir();
    }
}