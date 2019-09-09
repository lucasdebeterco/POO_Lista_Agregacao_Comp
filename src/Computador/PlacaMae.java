package Computador;

public class PlacaMae {
    private String marca;
    private String modelo;
    protected Processador processador;
    protected Hd hd;
    protected Memoria memoria;

    public PlacaMae (){
        processador = new Processador();
        hd = new Hd();
        memoria = new Memoria();
    }

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlacaMae{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", processador=").append(processador);
        sb.append(", hd=").append(hd);
        sb.append(", memoria=").append(memoria);
        sb.append('}');
        return sb.toString();
    }
}
