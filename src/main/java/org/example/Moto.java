package org.example;

public class Moto extends Veiculo {
    public Moto(IPeca peca) {
        super(peca);
    }

    public String montar() {
        return "Moto pronta com: " + this.peca.produzir();
    }
}