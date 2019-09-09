package Computador;

public class Monitor {
    private String marca;
    private String tipo;
    private String resolucao;

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

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monitor{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", resolucao='").append(resolucao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
