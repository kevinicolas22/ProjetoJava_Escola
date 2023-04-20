import java.util.Arrays;

/**
 * Representa uma disciplina.
 */
public class Disciplina {

    /**
     * Nome da disciplina.
     */
    private String nomeDisciplina;

    /**
     * Notas obtidas pelo aluno.
     */
    private double[] notas = new double[4];

    /**
     * Horas de estudo realizadas pelo aluno.
     */
    private int horasEstudo;

    /**
     * Constroi um objeto Disciplina com o nome da disciplina.
     * Inicializa o array de notas com valores zero e a quantidade
     * de horas de estudo com zero.
     * @param nomeDisciplina Nome da disciplina.
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        Arrays.fill(notas, 0);
        horasEstudo = 0;
    }

    /**
     * Cadastra a nota de uma prova realizada pelo aluno.
     * @param numProva Numero da prova (entre 1 e 4).
     * @param nota Nota obtida pelo aluno.
     */
    public void cadastraNota(int numProva, double nota) {
        if (numProva >= 1 && numProva <= 4) {
            notas[numProva-1] = nota;
        }
    }

    /**
     * Cadastra a quantidade de horas de estudo realizadas pelo aluno.
     * @param horas Quantidade de horas de estudo.
     */
    public void cadastraHoras(int horas) {
        horasEstudo += horas;
    }

    /**
     * Calcula a media das notas obtidas pelo aluno.
     * @return A media das notas.
     */
    public double calculaMedia() {
        double soma = 0;
        int numNotas = 0;
        for (double nota : notas) {
            if (nota > 0) {
                soma += nota;
                numNotas++;
            }
        }
        return numNotas == 0 ? 0 : soma/numNotas;
    }

    /**
     * Verifica se o aluno foi aprovado na disciplina.
     * @return true se a media das notas for maior ou igual a 7, false caso contrario.
     */
    public boolean aprovado() {
        return calculaMedia() >= 7;
    }
    
    /**
     * Retorna uma representacao em String do objeto Disciplina.
     * @return Uma String contendo o nome da disciplina, a quantidade de horas
     * de estudo realizadas, a media das notas obtidas pelo aluno e as notas obtidas.
     */
    public String toString() {
        return "" + nomeDisciplina + 
        " " + horasEstudo + 
        " " + calculaMedia() + 
        " " + Arrays.toString(notas);
    }
}
