package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GerenciaDeTrafegoTest {

    GerenciaDeTrafego gerenciaDeTrafego;
    PistaDePouso pistaDePouso;

    @BeforeEach
    void setUp() {
        gerenciaDeTrafego = new GerenciaDeTrafego();
        pistaDePouso = new PistaDePouso(5, 100, "comercial");
    }

    @Test
    void abrePistaDePouso() {
        Tarefa aberturaPistaDePouso = new AbrePistaTarefa(pistaDePouso);
        gerenciaDeTrafego.executaTarefa(aberturaPistaDePouso);

        assertEquals("Pista de voo aberta", pistaDePouso.getEstado());
    }

    @Test
    void fechaPistaDePouso() {
        Tarefa fechamentoPistaDePouso = new InterditaPistaTarefa(pistaDePouso);
        gerenciaDeTrafego.executaTarefa(fechamentoPistaDePouso);

        assertEquals("Pista de Voo Interditada", pistaDePouso.getEstado());
    }

    @Test
    void cancelaFechamentoPistaDePouso() {
        Tarefa aberturaPistaDePouso = new AbrePistaTarefa(pistaDePouso);
        Tarefa fechamentoPistaDePouso = new InterditaPistaTarefa(pistaDePouso);

        gerenciaDeTrafego.executaTarefa(aberturaPistaDePouso);
        gerenciaDeTrafego.executaTarefa(fechamentoPistaDePouso);

        gerenciaDeTrafego.cancelaTarefa();

        assertEquals("Pista de voo aberta", pistaDePouso.getEstado());
    }

}
