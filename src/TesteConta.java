class TesteConta {

    public static void main(String[] args) {

        Conta salario = new Conta();

        salario.setAgencia(1234);
        salario.setBanco("X-023");
        salario.setNumero(2312124);
        salario.setTitular("Zé Fulano");

        boolean sacado = salario.sacar( 500 );

        if (sacado) {
            if ( salario.getSaldo() >= 2000 ) {
                System.out.println("Com esse saldo, já podes incluir um eguro de vida.");
            }
        }
        
        System.out.println("Saque realizado " + sacado);
        System.out.println("Saldo da Conta " + salario.getSaldo());

        System.out.println("-------------------- ");

        if (salario.depositar(-100)) {
            System.out.println("Depositado :D " + salario.getSaldo());
        } else {
            System.out.println("Não foi depositado.");
        }

        salario.depositar(2444);
        System.out.println("Depositado " + salario.getSaldo());

    }
    
}
