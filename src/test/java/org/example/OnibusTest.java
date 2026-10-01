package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OnibusTest {

    @Test
    void deveProduzirDirecaoOnibus() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance();
        Veiculo onibus = new Onibus(fabrica);
        assertEquals("Montagem do Ônibus: Direção produzida", onibus.produzirDirecao());
    }

    @Test
    void deveProduzirPneuOnibus() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance();
        Veiculo onibus = new Onibus(fabrica);
        assertEquals("Montagem do Ônibus: Pneu produzido", onibus.produzirPneu());
    }

    @Test
    void deveLancarExcecaoAoTentarCriarOnibusComFabricaNula() {
        assertThrows(NullPointerException.class, () -> {
            new Onibus(null);
        });
    }
}