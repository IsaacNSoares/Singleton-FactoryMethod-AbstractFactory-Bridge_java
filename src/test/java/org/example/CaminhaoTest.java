package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaminhaoTest {

    @Test
    void deveRetornarMontagemCaminhaoPneu() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance().obterFabrica("Pneu");
        Veiculo veiculo = fabrica.produzirCaminhao();
        assertEquals("Caminhão pronto com: Pneus instalados", veiculo.montar());
    }

    @Test
    void deveRetornarMontagemCaminhaoMotor() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance().obterFabrica("Motor");
        Veiculo veiculo = fabrica.produzirCaminhao();
        assertEquals("Caminhão pronto com: Motor V8 instalado", veiculo.montar());
    }

    @Test
    void deveRetornarMontagemCaminhaoDirecao() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance().obterFabrica("Direcao");
        Veiculo veiculo = fabrica.produzirCaminhao();
        assertEquals("Caminhão pronto com: Direção instalada", veiculo.montar());
    }
}