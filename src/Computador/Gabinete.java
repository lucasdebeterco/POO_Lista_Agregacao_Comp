package Computador;

public class Gabinete {
    private String modelo;
    private String tipo;
    private int baias;
    protected PlacaMae placamae;

    public Gabinete(){
        placamae = new PlacaMae();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBaias() {
        return baias;
    }

    public void setBaias(int baias) {
        this.baias = baias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gabinete{");
        sb.append("modelo='").append(modelo).append('\'');
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", baias=").append(baias);
        sb.append(", placamae=").append(placamae);
        sb.append('}');
        return sb.toString();
    }
}

