public class Utilizador{

    String nome, estado;
    TipoUtilizador tipoUtilizador;

    public Utilizador(String nome, String estado, TipoUtilizador tipo){
        this.nome = nome;
        this.estado = estado;
        this.tipoUtilizador = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
