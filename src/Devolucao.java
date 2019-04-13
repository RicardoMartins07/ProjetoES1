import java.time.LocalDate;

public class Devolucao extends Object {

    java.time.LocalDate data;
    Emprestimo emprestimo;

    public Devolucao(LocalDate data, Emprestimo emprestimo) {
        this.data = data;
        this.emprestimo = emprestimo;
    }

    public LocalDate getData() { return data; }

    public Emprestimo getEmprestimo() { return emprestimo; }
}