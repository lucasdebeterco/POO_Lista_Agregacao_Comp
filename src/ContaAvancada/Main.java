package ContaAvancada;

public class Main {
    public static void main(String[] args) {
        ContaSimples cs = new ContaSimples();
        cs.setSaldoPoupanca(10000);

        cs.setAgencia(5);
        cs.setNumeroDaConta(3424);
        cs.setSaldo(10000);

        cs.banco.setCodigo(2);
        cs.banco.setNome("Banco XX");
        cs.banco.setNumeroAgencias(10);

        cs.correntista.setNome("Correntista XX");
        cs.correntista.setEndereco("Rio do Sul");

        cs.depositoPoupanca(2550);
        cs.saquePoupanca(1000);

        cs.deposito(5000);
        cs.saque(1000);

        System.out.println(cs);

        // ----------------------------------------------

        ContaEspecial ce = new ContaEspecial();

        ce.setDiasSemJuros(10);
        ce.setLimite(1000);

        ce.setAgencia(6);
        ce.setNumeroDaConta(5346);
        ce.setSaldo(10000);

        ce.banco.setCodigo(2);
        ce.banco.setNome("Banco XX");
        ce.banco.setNumeroAgencias(10);

        ce.correntista.setNome("Correntista XX");
        ce.correntista.setEndereco("Rio do Sul");

        ce.cartaoDeCredito.setLimite(2000);
        ce.cartaoDeCredito.setNumero(362785479);
        ce.cartaoDeCredito.setOperadora("Master Card");
        ce.cartaoDeCredito.setTipoDeCartao("Crédito");

        ce.deposito(1000);
        ce.saqueLimite(100);

        System.out.println(ce);
    }

}
