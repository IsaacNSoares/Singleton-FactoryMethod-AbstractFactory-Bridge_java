package org.example;

public abstract class Veiculo {
    protected IPeca peca;

    public Veiculo(IPeca peca) {
        this.peca = peca;
    }

    public abstract String montar();
}