import java.time.LocalDate;

public class Notificacao_doad {

    Doador d;
    LocalDate data;
    Livro solic;
    Solicitacao s;

    public Notificacao_doad(Doador d, LocalDate data, Livro solic, Solicitacao s) {
        this.d = d;
        this.data = data;
        this.solic = solic;
        this.s = s;
    }

    public Doador getD() {
        return d;
    }

    public void setD(Doador d) {
        this.d = d;
    }

    public Notificacao_doad(LocalDate data, Livro solic, Solicitacao s) {
        this.data = data;
        this.solic = solic;
        this.s = s;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Livro getSolic() {
        return solic;
    }

    public void setSolic(Livro solic) {
        this.solic = solic;
    }

    public Solicitacao getS() {
        return s;
    }

    public void setS(Solicitacao s) {
        this.s = s;
    }
}
