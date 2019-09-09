package CarroMotorPessoa;

public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;
    protected Pessoa dono;
    protected Motor motor;

    public Carro(){
        dono = new Pessoa();
        motor = new Motor();
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("fabricante='").append(fabricante).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", cor='").append(cor).append('\'');
        sb.append(", ano=").append(ano);
        sb.append(", dono=").append(dono);
        sb.append(", motor=").append(motor);
        sb.append('}');
        return sb.toString();
    }
}
