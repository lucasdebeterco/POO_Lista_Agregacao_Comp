package Computador;

public class Hd {
    private String marca;
    private String modelo;
    private float capacidade;
    private int rpm;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hd{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", capacidade=").append(capacidade);
        sb.append(", rpm=").append(rpm);
        sb.append('}');
        return sb.toString();
    }
}
