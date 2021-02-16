/**
 * @author Thayana Mamoré
 */
class Conta {
    
    private long numero;
    private int agencia;
    private String banco;
    private String titular;
    private double saldo;

    /**
     * sintaxe metodo
     * [modificadores] <tipo_retorno> <nome_metodo> ([parametro]...)
     */

     boolean sacar (double valor) {
         
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }

        return false;
     }

     boolean depositar (double valor) {

        if (valor <= 0) {
            return false;
        }

        saldo += valor;

        return true;
     }
     
     /**
      * Métodos Getters e Setters
      */
     public long getNumero() {
         return numero;
     }

     public void setNumero(long numero) {
         this.numero = numero;
     }

     public int getAgencia() {
         return agencia;
     }

     public void setAgencia(int agencia) {
         this.agencia = agencia;
     }

     public String getBanco() {
         return banco;
     }

     public void setBanco(String banco) {
         this.banco = banco;
     }

     public String getTitular() {
         return titular;
     }

     public void setTitular(String titular){
        this.titular = titular;
     }

     public double getSaldo() {
         return saldo;
     }

}