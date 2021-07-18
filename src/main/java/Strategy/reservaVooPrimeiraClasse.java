
package Strategy;


public class reservaVooPrimeiraClasse implements Reserva{

    @Override
    public float calcular(float conta, float valor) {
        return conta + valor * 15;
    }
    
}
