package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveProduzirDirecaoMoto() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance();
        Veiculo moto = new Moto(fabrica);
        assertEquals("Montagem da Moto: Direção produzida", moto.produzirDirecao());
    }

    @Test
    void deveProduzirPneuMoto() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance();
        Veiculo moto = new Moto(fabrica);
        assertEquals("Montagem da Moto: Pneu produzido", moto.produzirPneu());
    }

    @Test
    void deveLancarExcecaoAoTentarCriarMotoComFabricaNula() {
        assertThrows(NullPointerException.class, () -> {
            new Moto(null);
        });
    }
}