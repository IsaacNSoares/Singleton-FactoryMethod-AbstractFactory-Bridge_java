package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveProduzirDirecaoCarro() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance();
        Veiculo carro = new Carro(fabrica);
        assertEquals("Montagem do Carro: Direção produzida", carro.produzirDirecao());
    }

    @Test
    void deveProduzirPneuCarro() {
        FabricaAbstrata fabrica = FabricaPeca.getInstance();
        Veiculo carro = new Carro(fabrica);
        assertEquals("Montagem do Carro: Pneu produzido", carro.produzirPneu());
    }

    @Test
    void deveLancarExcecaoAoTentarCriarCarroComFabricaNula() {
        assertThrows(NullPointerException.class, () -> {
            new Carro(null);
        });
    }
}