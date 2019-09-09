package ContaAvancada;

public class ContaBancaria {
    protected Banco banco;
    protected Pessoa correntista;
    private int agencia;
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria (){
        banco = new Banco();
        correntista = new Pessoa();
    }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public Banco getBanco() { return banco; }
    public void setBanco(Banco banco) { this.banco = banco; }

    public Pessoa getCorrentista() { return correntista; }
    public void setCorrentista(Pessoa correntista) { this.correntista = correntista; }

    public int getAgencia() { return agencia; }
    public void setAgencia(int agencia) { this.agencia = agencia; }

    public int getNumeroDaConta() { return numeroDaConta; }
    public void setNumeroDaConta(int numeroDaConta) { this.numeroDaConta = numeroDaConta; }

    public boolean deposito(double valor){
        saldo += valor;
        return true;
    }
    public boolean saque(double valor){
        saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaBancaria{");
        sb.append("banco=").append(banco);
        sb.append(", correntista=").append(correntista);
        sb.append(", agencia=").append(agencia);
        sb.append(", numeroDaConta=").append(numeroDaConta);
        sb.append(", saldo=").append(saldo);
        sb.append("}");
        return sb.toString();
    }
}
