import java.util.ArrayList;

public abstract class Repositorio {
    public Repositorio() { }
    ArrayList<Coima> ListaCoimas = new ArrayList<Coima>();
    ArrayList<Copia> ListaCopias = new ArrayList<Copia>();
    ArrayList<Devolucao> ListaDevolucoes = new ArrayList<Devolucao>();
    ArrayList<Emprestimo> ListaEmprestimos = new ArrayList<Emprestimo>();
    ArrayList<Livro> ListaLivros = new ArrayList<Livro>();
    ArrayList<Notificacao> ListaNotificacoes = new ArrayList<Notificacao>();
    ArrayList<Requisicao> ListaRequisicoes = new ArrayList<Requisicao>();
    ArrayList<TipoUtilizador> ListaTipos = new ArrayList<TipoUtilizador>();
    ArrayList<Utilizador> ListaUtilizadores = new ArrayList<Utilizador>();
    ArrayList<PropostaAquisicao> ListaPropostas = new ArrayList<PropostaAquisicao>();
    ArrayList<RequisicaoCompra> ListaRequesicoesCompra = new ArrayList<RequisicaoCompra>();
    ArrayList<Encomenda> ListaEncomendas = new ArrayList<Encomenda>();
    ArrayList<EntradaNovoLivro> ListaEntradasNovosLivros = new ArrayList<EntradaNovoLivro>();
}
