package Computador;

public class Computador extends EquipamentoEletronico{
    private String marca;
    private String modelo;
    protected Gabinete gabinete;
    protected Monitor monitor;
    protected Teclado teclado;
    protected Mouse mouse;

    public Computador(){
        gabinete = new Gabinete();
        monitor = new Monitor();
        teclado = new Teclado();
        mouse = new Mouse();
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
        final StringBuilder sb = new StringBuilder("Computador{");
        sb.append(super.toString());
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", gabinete=").append(gabinete);
        sb.append(", monitor=").append(monitor);
        sb.append(", teclado=").append(teclado);
        sb.append(", mouse=").append(mouse);
        sb.append('}');
        return sb.toString();
    }
}
