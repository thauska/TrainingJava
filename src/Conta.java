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
     * [modificadores]  <NomeClasse> ([Parametros...]) {}
     */

     public Conta() {
         System.out.println("Conta criada!");
     }

    public void abrirConta ( long numero, int agencia, String banco, String titular ) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.titular = titular;
    }

    public void abrirConta ( long numero, String titular ) {
        abrirConta(numero, 1400, "REAL", titular);
    }

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

     public double getSaldo() {
         return saldo;
     }

}