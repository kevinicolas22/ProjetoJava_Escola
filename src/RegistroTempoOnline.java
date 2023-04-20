/**
 * Representa um registro de tempo online dedicado a uma disciplina.
 */
public class RegistroTempoOnline {
    private String nomeDisciplina; // nome da disciplina
    private int tempoOnlineEsperado; // tempo online esperado em minutos
    private int tempoOnlineUsado; // tempo online usado em minutos

    /**
     * Cria um novo registro com tempo online esperado de 120 minutos.
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina, 120);
    }

    /**
     * Cria um novo registro com tempo online esperado especificado.
     * @param nomeDisciplina o nome da disciplina
     * @param tempoOnlineEsperado o tempo online esperado em minutos
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnlineUsado = 0;
    }

    /**
     * Adiciona o tempo online usado em minutos.
     * @param tempo o tempo online usado em minutos
     */
    public void adicionaTempoOnline(int tempo) {
        tempoOnlineUsado += tempo;
    }

    /**
     * Verifica se a meta de tempo online foi atingida.
     * @return true se o tempo online usado for maior ou igual ao tempo online esperado, false caso contrario
     */
    public boolean atingiuMetaTempoOnline() {
        return tempoOnlineUsado >= tempoOnlineEsperado;
    }

    /**
     * Retorna uma string que representa o registro de tempo online.
     * @return a representacao em string do registro
     */
    public String toString() {
        return nomeDisciplina + " " + tempoOnlineUsado + "/" + tempoOnlineEsperado;
    }
}
