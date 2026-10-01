package org.example;

public abstract class Veiculo {

    // Estas variáveis funcionam como a "ponte" para a implementação
    protected Direcao direcao;
    protected Pneu pneu;

    public Veiculo(FabricaAbstrata fabrica) {
        this.direcao = fabrica.produzirDirecao();
        this.pneu = fabrica.produzirPneu();
    }

    // Mantemos os teus métodos originais, mas agora são abstratos
    public abstract String produzirDirecao();
    public abstract String produzirPneu();
}