import java.time.LocalDate;

public class Doacao {
    Livro_Doado l;
    Doador d;
    LocalDate date;
    int creditos_ganhos;

    public Doacao(Livro_Doado l, Doador d, LocalDate date, int creditos_ganhos) {
        this.l = l;
        this.d = d;
        this.date = date;
        this.creditos_ganhos = creditos_ganhos;
    }


    public Livro_Doado getL() {
        return l;
    }

    public void setL(Livro_Doado l) {
        this.l = l;
    }

    public Doador getD() {
        return d;
    }

    public void setD(Doador d) {
        this.d = d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getCreditos_ganhos() {
        return creditos_ganhos;
    }

    public void setCreditos_ganhos(int creditos_ganhos) {
        this.creditos_ganhos = creditos_ganhos;
    }
}

