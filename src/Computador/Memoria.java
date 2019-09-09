package Computador;

public class Memoria {
    private String marca;
    private String modelo;
    private float capacidade;
    private float valocidade;

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

    public float getValocidade() {
        return valocidade;
    }

    public void setValocidade(float valocidade) {
        this.valocidade = valocidade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Memoria{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", capacidade=").append(capacidade);
        sb.append(", valocidade=").append(valocidade);
        sb.append('}');
        return sb.toString();
    }
}
