import java.util.ArrayList;

abstract class Repositorio{
    private Repositorio() { }
    ArrayList<Coima> ListaCoimas = new ArrayList<>();
    ArrayList<Copia> ListaCopias = new ArrayList<>();
    ArrayList<Devolucao> ListaDevolucoes = new ArrayList<>();
    ArrayList<Emprestimo> ListaEmprestimos = new ArrayList<>();
    ArrayList<Livro> ListaLivros = new ArrayList<>();
    ArrayList<Notificacao> ListaNotificacoes = new ArrayList<>();
    ArrayList<Requisicao> ListaRequisicoes = new ArrayList<>();
    ArrayList<TipoUtilizador> ListaTipos = new ArrayList<>();
    ArrayList<Utilizador> ListaUtilizadores = new ArrayList<>();
    ArrayList<PropostaAquisicao> ListaPropostas = new ArrayList<>();
    ArrayList<RequisicaoCompra> ListaRequesicoesCompra = new ArrayList<>();
    ArrayList<Encomenda> ListaEncomendas = new ArrayList<>();
    ArrayList<EntradaNovoLivro> ListaEntradasNovosLivros = new ArrayList<>();
}
