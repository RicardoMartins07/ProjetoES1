public class TipoUtilizador{

    String descricao;
    int prazoEmprestimo;

    public TipoUtilizador(String descricao, int prazoEmprestimo){
        this.descricao = descricao;
        this.prazoEmprestimo = prazoEmprestimo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getPrazoEmprestimo() {
        return this.prazoEmprestimo;
    }
}