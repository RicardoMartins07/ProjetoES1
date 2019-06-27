public class Solicitacao {
    Doador d;
    Livro l;

    public Solicitacao(Doador d, Livro l) {
        this.d = d;
        this.l = l;
    }

    public Doador getD() {
        return d;
    }

    public void setD(Doador d) {
        this.d = d;
    }

    public Livro getL() {
        return l;
    }

    public void setL(Livro l) {
        this.l = l;
    }
}
