package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotoTest {

    @Test
    void deveRetornarMontagemMotoPneu() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance().obterFabrica("Pneu");
        Veiculo veiculo = fabrica.produzirMoto();
        assertEquals("Moto pronta com: Pneus instalados", veiculo.montar());
    }

    @Test
    void deveRetornarMontagemMotoMotor() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance().obterFabrica("Motor");
        Veiculo veiculo = fabrica.produzirMoto();
        assertEquals("Moto pronta com: Motor V8 instalado", veiculo.montar());
    }

    @Test
    void deveRetornarMontagemMotoDirecao() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance().obterFabrica("Direcao");
        Veiculo veiculo = fabrica.produzirMoto();
        assertEquals("Moto pronta com: Direção instalada", veiculo.montar());
    }
}