class TesteConta {

    public static void main(String[] args) {

        Conta salario = new Conta(121212, "Maria José");
        Conta corrente = new Conta(232323, "Maria Alice");

        salario.abrirConta(2312124, 1234, "X-023", "Zé Fulano");

        corrente.abrirConta(23432343, "João Maria");

        boolean sacado = salario.sacar( 500 );

        if (sacado) {
            if ( salario.getSaldo() >= 2000 ) {
                System.out.println("Com esse saldo, já podes incluir um seguro de vida.");
            }
        }
        
        System.out.println("Saque realizado " + sacado);
        System.out.println("Saldo da Conta " + salario.getSaldo());

        System.out.println("-------------------- ");

        if (salario.depositar(100)) {
            System.out.println("Depositado :D " + salario.getSaldo());
        } else {
            System.out.println("Não foi depositado.");
        }

        salario.depositar(2444);
        System.out.println("Depositado " + salario.getSaldo());

    }
    
}
