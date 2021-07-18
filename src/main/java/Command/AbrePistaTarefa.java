package Command;

public class AbrePistaTarefa implements Tarefa {

    private PistaDePouso pistaDePouso;

    public AbrePistaTarefa(PistaDePouso pistaDePouso) {
        this.pistaDePouso = pistaDePouso;
    }

    @Override
    public void executa() {
        this.pistaDePouso.abrePistaDeVoo();
    }

    @Override
    public void cancela() {
        this.pistaDePouso.interditaPistaDeVoo();
    }

}
