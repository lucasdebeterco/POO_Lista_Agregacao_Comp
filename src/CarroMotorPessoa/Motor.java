package CarroMotorPessoa;

public class Motor {
    private String marca;
    private float potencia;
    private int cilindros;
    private String combustivel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Motor{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", potencia=").append(potencia);
        sb.append(", cilindros=").append(cilindros);
        sb.append(", combustivel='").append(combustivel).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
