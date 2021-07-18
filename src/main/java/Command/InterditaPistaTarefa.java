package Command;

public class InterditaPistaTarefa implements Tarefa {

    private PistaDePouso pistaDePouso;

    public InterditaPistaTarefa(PistaDePouso pistaDePouso) {
        this.pistaDePouso = pistaDePouso;
    }

    @Override
    public void executa() {
        this.pistaDePouso.interditaPistaDeVoo();
    }

    @Override
    public void cancela() {
        this.pistaDePouso.abrePistaDeVoo();
    }

}
