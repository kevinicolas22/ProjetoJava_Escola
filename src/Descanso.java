/**
 * A classe Descanso representa o estado de descanso de uma pessoa com base na quantidade de horas de descanso 
 * que ela teve durante um certo numero de semanas. 
 */
public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    /**
     * Cria uma nova instancia da classe Descanso com os valores padrao de 0 horas de descanso e 1 semana.
     */
    public Descanso() {
        horasDescanso = 0;
        numeroSemanas = 1;
    }

    /**
     * Define o numero de horas de descanso.
     * @param valor o numero de horas de descanso.
     */
    public void defineHorasDescanso(int valor) {
        horasDescanso = valor;
    }

    /**
     * Define o numero de semanas usadas para calcular a quantidade de horas de descanso por semana.
     * @param valor o numero de semanas.
     */
    public void defineNumeroSemanas(int valor) {
        if (valor != 0) {
            numeroSemanas = valor;
        }
    }

    /**
     * Retorna o estado geral de descanso da pessoa com base na quantidade de horas de descanso que ela teve por semana.
     * @return "descansado" se a quantidade de horas de descanso por semana for maior ou igual a 26, "cansado" caso contrario.
     */
    public String getStatusGeral() {
        int horasTotais = horasDescanso / numeroSemanas;
        
        if (horasTotais >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}
