package Strategy;

public class reservaVooExecutivo implements Reserva {

    @Override
    public float calcular(float conta, float valor) {
        
        return conta + valor * 3;
    }

}
