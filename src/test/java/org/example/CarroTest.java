package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    void deveRetornarMontagemCarroPneu() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance().obterFabrica("Pneu");
        Veiculo veiculo = fabrica.produzirCarro();
        assertEquals("Carro pronto com: Pneus instalados", veiculo.montar());
    }

    @Test
    void deveRetornarMontagemCarroMotor() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance().obterFabrica("Motor");
        Veiculo veiculo = fabrica.produzirCarro();
        assertEquals("Carro pronto com: Motor V8 instalado", veiculo.montar());
    }

    @Test
    void deveRetornarMontagemCarroDirecao() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance().obterFabrica("Direcao");
        Veiculo veiculo = fabrica.produzirCarro();
        assertEquals("Carro pronto com: Direção instalada", veiculo.montar());
    }
}