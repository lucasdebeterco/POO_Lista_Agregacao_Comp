package HomeTheater;

public class SistemaSom extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    private String potencia;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() > 0) {
            this.marca = marca;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Marca: ").append(marca);
        sb.append(", Modelo: ").append(modelo);
        sb.append(", Potência: ").append(potencia);
        return sb.toString();
    }
}
