package Command;

public class PistaDePouso {

    private int hangar;
    private int comprimento;
    private String padrao;
    private String estado;

    public PistaDePouso(int hangar, int comprimento, String padrao) {
        this.hangar = hangar;
        this.comprimento = comprimento;
        this.padrao = padrao;
    }

    public String getEstado() {
        return estado;
    }

    public void abrePistaDeVoo() {
        this.estado = "Pista de voo aberta";
    }

    public void interditaPistaDeVoo() {
        this.estado = "Pista de Voo Interditada";
    }
}
