/**
 * @author Thayana Mamoré
 */
public class Cliente {

    private String nome;
    private String rg;
    private String cpf;

    public Cliente( String nome, String rg, String cpf ) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }
    
    public Cliente() {        
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
