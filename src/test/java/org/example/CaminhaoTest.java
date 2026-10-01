package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CaminhaoTest {

    @Test
    void deveProduzirDirecaoCaminhao() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance();
        Veiculo caminhao = new Caminhao(fabrica);
        assertEquals("Montagem do Caminhão: Direção produzida", caminhao.produzirDirecao());
    }

    @Test
    void deveProduzirPneuCaminhao() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance();
        Veiculo caminhao = new Caminhao(fabrica);
        assertEquals("Montagem do Caminhão: Pneu produzido", caminhao.produzirPneu());
    }

    @Test
    void deveLancarExcecaoAoTentarCriarCaminhaoComFabricaNula() {
        assertThrows(NullPointerException.class, () -> {
            new Caminhao(null);
        });
    }
}