
package Strategy;


public class reservaVooEconomico implements Reserva{

    @Override
    public float calcular(float conta, float valor) {
        return conta + valor;
    }
    
}
