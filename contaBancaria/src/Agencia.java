/**
 * @author Thayana Mamoré
 */
public class Agencia {
    private int numero;
    private Banco banco;
    private Conta[] contas;

    public Agencia(int numero, Banco banco) {
        this.numero = numero;
        this.banco = banco;
    }

    public Agencia() {
        this.banco = new Banco();                                                                                                                                               
    }


    /**
     * @return int return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return Banco return the banco
     */
    public Banco getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    /**
     * @return Conta[] return the contas
     */
    public Conta[] getContas() {
        return contas;
    }

    /**
     * @param contas the contas to set
     */
    public void setContas(Conta[] contas) {
        this.contas = contas;
    }

}
