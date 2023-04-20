/**
 * Classe responsavel por armazenar resumos de temas.
 */
public class RegistroResumos {
    private int numeroDeResumos;
    private int contadorDeResumos;
    private String[] temas;
    private String[] resumos;

    /**
     * Construtor da classe.
     * 
     * @param numeroDeResumos a quantidade maxima de resumos que podem ser armazenados.
     */
    public RegistroResumos(int numeroDeResumos) {
        this.numeroDeResumos = numeroDeResumos;
        this.contadorDeResumos = 0;
        this.temas = new String[numeroDeResumos];
        this.resumos = new String[numeroDeResumos];
    }

    /**
     * Adiciona um resumo.
     * 
     * @param tema o tema do resumo a ser adicionado.
     * @param resumo o conteudo do resumo a ser adicionado.
     */
    public void adiciona(String tema, String resumo) {
        if (contadorDeResumos == numeroDeResumos) {
            temas[0] = tema;
            resumos[0] = resumo;
        } else {
            temas[contadorDeResumos] = tema;
            resumos[contadorDeResumos] = resumo;
            contadorDeResumos++;
        }
    }

    /**
     * Retorna um array com os resumos armazenados.
     * 
     * @return um array de strings com os resumos.
     */
    public String[] pegaResumos() {
        String[] resultado = new String[contadorDeResumos];
        for (int i = 0; i < contadorDeResumos; i++) {
            resultado[i] = temas[i] + ": " + resumos[i];
        }
        return resultado;
    }

    /**
     * Imprime os resumos cadastrados.
     * 
     * @return uma string com a lista de resumos cadastrados.
     */
    public String imprimeResumos() {
        StringBuilder sb = new StringBuilder();
        sb.append("- ");
        sb.append(contadorDeResumos);
        sb.append(" resumo(s) cadastrado(s)\n");
        for (int i = 0; i < contadorDeResumos; i++) {
            sb.append("- ");
            sb.append(temas[i]);
            if (i != contadorDeResumos - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    /**
     * Retorna o numero de resumos cadastrados.
     * 
     * @return o numero de resumos cadastrados.
     */
    public int conta() {
        return contadorDeResumos;
    }

    /**
     * Verifica se ha algum resumo cadastrado para um determinado tema.
     * 
     * @param tema o tema a ser verificado.
     * @return true se houver algum resumo cadastrado para o tema, false caso contrario.
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < contadorDeResumos; i++) {
            if (temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }   
}
