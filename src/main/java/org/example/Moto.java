package org.example;

public class Moto extends Veiculo {

    public Moto(FabricaAbstrata fabrica) {
        super(fabrica);
    }

    @Override
    public String produzirDirecao() {
        return "Montagem da Moto: " + this.direcao.produzir();
    }

    @Override
    public String produzirPneu() {
        return "Montagem da Moto: " + this.pneu.produzir();
    }
}