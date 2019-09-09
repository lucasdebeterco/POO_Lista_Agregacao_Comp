package HomeTheater;

public class SistemaVideo extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    private String tipo;
    private String resolucao;


    public void setTensao (float tensao) { super.setTensao(tensao); }
    public void setConsumo (float consumo) { super.setConsumo(consumo); }

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
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", Marca: ").append(marca);
        sb.append(", Modelo: ").append(modelo);
        sb.append(", Tipo: ").append(tipo);
        sb.append(", Resolucao: ").append(resolucao);
        return sb.toString();
    }
}
