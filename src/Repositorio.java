interface Repositorio {

    void adicionaPropostaRequisicao(PropostaAquisicao proposta);
    void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);
    void adicionaEncomenda(Encomenda encomenda);
    void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);
    void adicionaUtilizador(Utilizador utilizador);
    void adicionaTipoUtilizador(TipoUtilizador tipo);
    void adicionaRequisicao(Requisicao requisicao);
    void adicionaCopia(Copia copia);
    void adicionaLivro(Livro livro);
    void adicionaEmprestimo(Emprestimo emprestimo);
    void adicionaNotificacao(Notificacao notificacao);
    void adicionaDevolucao(Devolucao devolucao);
    void adicionaCoima(Coima coima);
    Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);
    void adicionaDoacao(Livro_Doado livro_doado,Doador doador, Avaliador avaliador);
    void adicionaLevantamentoLivro(String titulo , Doador doador, String Editora);
    boolean avalaiacao_Livro(Livro_Doado l , Avaliador a);
    void adicionaDoador(Doador doador);
    int atribuiAvaliacaobyestado();
    Doacao Efetuar_Doacao(Livro_Doado doado , Doador doador , Avaliador avaliador);

}