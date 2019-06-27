public class Livro_Doado {

    Livro l;
    int Creditos;
    int avaliacao;


    public Livro_Doado(Livro l, int creditos, int avaliacao) {
        this.l = l;
        Creditos = creditos;
        this.avaliacao = avaliacao;
    }

    public Livro getL() {
        return l;
    }

    public void setL(Livro l) {
        this.l = l;
    }

    public int getCreditos() {
        return Creditos;
    }

    public void setCreditos(int creditos) {
        Creditos = creditos;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}
