package org.example;

public class Carro extends Veiculo {
    public Carro(IPeca peca) {
        super(peca);
    }

    public String montar() {
        return "Carro pronto com: " + this.peca.produzir();
    }
}