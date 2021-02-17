/**
 * @author Thayana Mamoré
 */
class Conta {
    
    private long numero;
    private int agencia;
    private String banco;
    private Cliente titular;

    private double saldo;

    /**
     * [modificadores]  <NomeClasse> ([Parametros...]) {}
     */

     public Conta(long numero, String titular) {
         this(numero, 1400, "REAL", titular);
         System.out.println("Conta default!");
     }

     public Conta( long numero, int agencia, String banco, String titular ) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;

        // Cria instância Cliente e seta String titular
        this.titular = new Cliente();
        this.titular.setNome(titular);

        System.out.println("Qualquer Conta");
     }

     
    public Conta() {
        System.out.println("Conta vazia");
    }

    public void abrirConta ( long numero, int agencia, String banco, String titular ) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;

        this.titular = new Cliente();
        this.titular.setNome(titular);
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