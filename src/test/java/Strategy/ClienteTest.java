package Strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    Float valor = 300.00F; //supondo um preço medio ficticio de uma passagem

    @Test
    void adicionaVooEconomico() {
        Cliente cliente = new Cliente();
        cliente.reservaVooEconomico(0, valor);
        assertEquals(300.0f, cliente.getConta());
    }

    @Test
    void adicionaOutroVooEconomico() {
        Cliente cliente = new Cliente();
        cliente.reservaVooEconomico(300, valor);
        assertEquals(600.0f, cliente.getConta());
    }

    @Test
    void adicionaVooExecutivo() {
        Cliente cliente = new Cliente();
        cliente.reservaVooExecutivo(0, valor);
        assertEquals(900.0f, cliente.getConta());
    }

    @Test
    void adicionaVooPrimeiraClasse() {
        Cliente cliente = new Cliente();
        cliente.reservaVooPrimeiraClasse(0, valor);
        assertEquals(4500.0f, cliente.getConta());
    }

    @Test
    void adicionaVooCriancaDeColo() {
        Cliente cliente = new Cliente();
        cliente.reservaVooCriancaDeColo(0, valor);
        assertEquals(30.0f, cliente.getConta());
    }

}
