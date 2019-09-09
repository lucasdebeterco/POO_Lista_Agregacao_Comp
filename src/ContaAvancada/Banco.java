package ContaAvancada;

public class Banco {
    private int codigo;
    private String nome;
    private int numeroAgencias;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroAgencias() {
        return numeroAgencias;
    }

    public void setNumeroAgencias(int numeroAgencias) {
        this.numeroAgencias = numeroAgencias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banco{");
        sb.append("codigo=").append(codigo);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", numeroAgencias=").append(numeroAgencias);
        sb.append('}');
        return sb.toString();
    }
}
