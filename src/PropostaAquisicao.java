import java.time.LocalDate;

public class PropostaAquisicao extends Object {

    LocalDate data;
    String infoLivro;
    Utilizador utilizador;

    public PropostaAquisicao(LocalDate data, Utilizador utilizador, String infoLivro) {
        this.data = data;
        this.utilizador = utilizador;
        this.infoLivro = infoLivro;
    }

    public String getInfoLivro() { return infoLivro; }

    public LocalDate getData() { return data; }

    public void setData(LocalDate data) { this.data = data; }

    public Utilizador getUtilizador() { return utilizador; }

    public void setUtilizador(Utilizador utilizador) { this.utilizador = utilizador; }
}
