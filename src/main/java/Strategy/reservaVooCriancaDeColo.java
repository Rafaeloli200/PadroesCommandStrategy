
package Strategy;


public class reservaVooCriancaDeColo implements Reserva{

    @Override
    public float calcular(float conta, float valor) {
        return conta + valor/10 ;
    }
    
}
