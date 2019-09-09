package Computador;

public class Teclado {
    private String marca;
    private String tipo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
