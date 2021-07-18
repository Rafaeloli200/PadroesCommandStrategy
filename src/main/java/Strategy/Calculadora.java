package Strategy;

public class Calculadora {

    private float conta;
    private float valor;

    public Calculadora(float conta, float valor) {
        this.conta = conta;
        this.valor = valor;
    }

    public float calcular(Reserva reserva) {
        return reserva.calcular(conta, valor);
    }
}
