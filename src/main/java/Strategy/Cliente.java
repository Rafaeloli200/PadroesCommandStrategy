package Strategy;

public class Cliente {

    private float conta = 0;

    public float getConta() {
        return conta;
    }

    public void reservaVooEconomico(float conta, float valor) {
        Calculadora calculadora = new Calculadora(conta, valor);
        this.conta = calculadora.calcular(new reservaVooEconomico());
    }
    public void reservaVooExecutivo(float conta, float valor) {
        Calculadora calculadora = new Calculadora(conta, valor);
        this.conta = calculadora.calcular(new reservaVooExecutivo());
    }
    public void reservaVooPrimeiraClasse(float conta, float valor) {
        Calculadora calculadora = new Calculadora(conta, valor);
        this.conta = calculadora.calcular(new reservaVooPrimeiraClasse());
    }
    public void reservaVooCriancaDeColo(float conta, float valor) {
        Calculadora calculadora = new Calculadora(conta, valor);
        this.conta = calculadora.calcular(new reservaVooCriancaDeColo());
    }

    

}
