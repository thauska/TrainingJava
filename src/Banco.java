/**
 * @author Thayana Mamoré
 */
public class Banco {
    private String numero;
    private Agencia [] agencias;

    public Banco(String numero, Agencia[] agencias) {
        this.numero = numero;
        this.agencias = agencias;
    }

    public Banco() {}

    /**
     * @return String return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return Agencia[] return the agencias
     */
    public Agencia[] getAgencias() {
        return agencias;
    }

    /**
     * @param agencias the agencias to set
     */
    public void setAgencias(Agencia[] agencias) {
        this.agencias = agencias;
    }

}
