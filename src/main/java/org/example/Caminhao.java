package org.example;

public class Caminhao extends Veiculo {
    public Caminhao(IPeca peca) {
        super(peca);
    }

    public String montar() {
        return "Caminhão pronto com: " + this.peca.produzir();
    }
}