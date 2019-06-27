import java.time.LocalDate;

public class LevantamentoLivro {
    Livro_Doado livro_doado;
    Doador d;
    LocalDate date;
    int creditosTransacao;

    public LevantamentoLivro(Livro_Doado livro_doado, Doador d, int creditosTransacao) {
        this.livro_doado = livro_doado;
        this.d = d;
        this.creditosTransacao = creditosTransacao;
    }

    public Livro_Doado getLivro_doado() {
        return livro_doado;
    }

    public void setLivro_doado(Livro_Doado livro_doado) {
        this.livro_doado = livro_doado;
    }

    public Doador getD() {
        return d;
    }

    public void setD(Doador d) {
        this.d = d;
    }

    public int getCreditosTransacao() {
        return creditosTransacao;
    }

    public void setCreditosTransacao(int creditosTransacao) {
        this.creditosTransacao = creditosTransacao;
    }
}
