import java.time.LocalDate;

public class RequisicaoCompra {

    String estado;
    LocalDate data;
    String oficio;
    Livro livro;
    Utilizador utilizador;

    public RequisicaoCompra(String estado, LocalDate data, String oficio, Livro livro, Utilizador utilizador) {
        this.estado = estado;
        this.data = data;
        this.oficio = oficio;
        this.livro = livro;
        this.utilizador = utilizador;
    }

    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }

    public LocalDate getData() { return data; }

    public void setData(LocalDate data) { this.data = data; }

    public String getOficio() { return oficio; }

    public void setOficio(String oficio) { this.oficio = oficio; }
}
