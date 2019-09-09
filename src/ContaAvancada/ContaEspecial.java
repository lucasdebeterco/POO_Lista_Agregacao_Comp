package ContaAvancada;

public class ContaEspecial extends ContaBancaria {
    protected Cartao cartaoDeCredito;
    private int diasSemJuros;
    private double limite;

    public ContaEspecial(){
        cartaoDeCredito = new Cartao();
    }

    public int getDiasSemJuros() {
        return diasSemJuros;
    }

    public void setDiasSemJuros(int diasSemJuros) {
        this.diasSemJuros = diasSemJuros;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
     public boolean saqueLimite(double valor){
        if (valor>(getSaldo()+limite)) {
            return false;
        } else {
            setSaldo(getSaldo()-valor);
            return true;
        }
     }

     public boolean deposito (double valor){
        setSaldo(getSaldo()+valor);
        return true;
     }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaEspecial{");
        sb.append(super.toString());
        sb.append("cartaoDeCredito=").append(cartaoDeCredito);
        sb.append(", diasSemJuros=").append(diasSemJuros);
        sb.append(", limite=").append(limite);
        sb.append('}');
        return sb.toString();
    }
}
