package org.example;

public class Carro extends Veiculo {

    public Carro(FabricaAbstrata fabrica) {
        super(fabrica); // Passa a fábrica para a classe mãe montar as peças
    }

    @Override
    public String produzirDirecao() {
        return "Montagem do Carro: " + this.direcao.produzir();
    }

    @Override
    public String produzirPneu() {
        return "Montagem do Carro: " + this.pneu.produzir();
    }
}