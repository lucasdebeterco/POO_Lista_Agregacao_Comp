package ContaAvancada;

public class ContaSimples extends ContaBancaria {
    private double saldoPoupanca;

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }
    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public boolean depositoPoupanca(double valor){
        saldoPoupanca += valor;
        return true;
    }

     public boolean saquePoupanca(double valor){
        saldoPoupanca -= valor;
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContaSimples{");
        sb.append(super.toString());
        sb.append("saldoPoupanca=").append(saldoPoupanca).append(" ");
        sb.append('}');
        return sb.toString();
    }
}
