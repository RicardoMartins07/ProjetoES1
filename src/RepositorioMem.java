import java.time.LocalDate;
import java.util.Random;

public class RepositorioMem extends R implements Repositorio {

    public RepositorioMem() {
        super();
    }

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta) {
        ListaPropostas.add(proposta);
    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) {
        ListaRequesicoesCompra.add(requisicaoCompra);
    }

    public void adicionaEncomenda(Encomenda encomenda) {
        ListaEncomendas.add(encomenda);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) {
        ListaEntradasNovosLivros.add(entradaNovoLivro);
    }

    public void adicionaUtilizador(Utilizador utilizador) {
        ListaUtilizadores.add(utilizador);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipo) {
        ListaTipos.add(tipo);
    }

    public void adicionaRequisicao(Requisicao requisicao) {
        ListaRequisicoes.add(requisicao);
    }

    public void adicionaCopia(Copia copia) {
        ListaCopias.add(copia);
    }

    public void adicionaLivro(Livro livro) {
        ListaLivros.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo) {
        ListaEmprestimos.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao) {
        ListaNotificacoes.add(notificacao);
    }

    public void adicionaDevolucao(Devolucao devolucao) {
        ListaDevolucoes.add(devolucao);
    }

    public void adicionaCoima(Coima coima) {
        ListaCoimas.add(coima);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {
        for (Emprestimo e : ListaEmprestimos) {
            if (e.getRequisicao().equals(r)) {
                return e;
            }
        }
        return null;
    }


    /* Doaçao*/
    public Doacao Efetuar_Doacao(Livro_Doado doado, Doador doador, Avaliador avaliador) {
        Doacao d;

        if (ProcuraDoador(doador)) {
            if (avalaiacao_Livro(doado, avaliador)){
                if(pesquisaCopiaDoados(doado)){
                    adicionaCopia(doado);
                }
            }

        } else {
            /* Fazer registo*/
            adicionaDoador(doador);
            Efetuar_Doacao(doado,doador,avaliador);
        }

        d = new Doacao(doado, doador, LocalDate.now(), doado.getCreditos());

        return d;
    }

    @Override
    public void adicionaDoacao(Livro_Doado doado, Doador doador, Avaliador avaliador) {

        Doacao d = Efetuar_Doacao(doado, doador, avaliador);
        doador.setCreditos(d.creditos_ganhos); // Atribuir ao Doador os créditos da transação
        Doador doador1 = pesquisaExistenciaSolicitacao(doado);
        if (doador1 != null) {

            /*Notificar*/

            Solicitacao solicitacao = pesquisaSolicitacao(doador1);
            Notificar(solicitacao);

        }
        ListaDoacao.add(d); //Adiciona doação

    }

    @Override
    public boolean avalaiacao_Livro(Livro_Doado l, Avaliador a) {

        int avaliacao = atribuiAvaliacaobyestado();

        switch (avaliacao) {
            case 1:
                l.setAvaliacao(avaliacao);
                l.setCreditos(2);
                break;
            case 2:
                l.setAvaliacao(avaliacao);
                l.setCreditos(4);
                break;
            case 3:
                l.setAvaliacao(avaliacao);
                l.setCreditos(5);
                break;
            case 4:
                l.setAvaliacao(avaliacao);
                l.setCreditos(8);
                break;
            case 5:
                l.setAvaliacao(avaliacao);
                l.setCreditos(10);
                break;
            default:
                return false;

        }
        return true;
    }

    @Override
    public int atribuiAvaliacaobyestado() {
        Random random = new Random();
        //pode-se acrescentar estado / ano
        int rand = random.nextInt(5);
        return rand;
    }

    /*---------------------------------------------------------*/

    /*Uteis*/

    public int VerificarStock(Livro_Doado ld){
        int x=0;
        for (CopiaDoados cd : ListaCopiaDoados)
        {
            if (cd.doado.equals(ld)){
                x=cd.unidades;
            }
        }

        return x;
    }

    public void AtualizaStock(Livro_Doado ld){
        for (CopiaDoados cd : ListaCopiaDoados)
        {
            if (cd.doado.equals(ld)){
                cd.setUnidades(cd.getUnidades()-1);
            }
        }

    }

    public void RemoveLivro(Livro_Doado ld){
        for (Doacao d : ListaDoacao){
            if (d.getL().equals(ld)){
                if (VerificarStock(ld)== 0){

                    ListaDoacao.remove(d);
                }
                else {AtualizaStock(ld);}
            }
        }
    }

    public void adicionaCopia(Livro_Doado doado){

        for(CopiaDoados cd : ListaCopiaDoados){
            if (cd.doado.equals(doado))
                cd.setUnidades(cd.getUnidades()+1);
        }
    }

    public boolean ProcuraDoador(Doador doador) {
        for (Doador d : ListaDoadores) {
            if (d.equals(doador))
                return true;
        }
        return false;
    }

    public boolean pesquisaCopiaDoados(Livro_Doado livro_doado){

        for (Doacao d : ListaDoacao){
            if (d.l.equals(livro_doado))
                return true;
        }
        return false;

    }

    public boolean VerificaExistenciaLivro(String titulo) {
        for (Doacao d : ListaDoacao) {
            if (d.l.getL().titulo == titulo) return true;
        }
        return false;
    }


    public int VerificaCreditosDoador(Doador d) {

        int x = 0;
        for (Doador doador : ListaDoadores) {
            if (doador.equals(d)) {
                x = doador.getCreditos();
            }
        }
        return x;
    }

    public Livro_Doado getLivroDoado(String titulo) {
        Livro_Doado livro_doado;
        for (Doacao d : ListaDoacao) {
            if (d.l.l.titulo == titulo) {
                return d.l;
            }
        }
        return null;
    }

    /*----------------------------------------------------------*/

    /*Registar Doador*/
    @Override
    public void adicionaDoador(Doador doador) {
        if (ProcuraDoador(doador)) {
            System.out.println("Ja existe este Utilizador");
        } else {
            ListaDoadores.add(doador);
        }
    }

    /*---------------------------------------------------------------------------*/


    /*Efetuar Levantamento */

    public LevantamentoLivro Efetuar_Levantamento(String titulo, Doador doador, String Editora) {

        if (ProcuraDoador(doador)) {
            if (VerificaExistenciaLivro(titulo)) {
                Livro_Doado ld = getLivroDoado(titulo);

                if (VerificaCreditosDoador(doador) > ld.getCreditos()) {
                    int y = ld.getCreditos();
                    int res = y - doador.getCreditos();
                    LevantamentoLivro livro = new LevantamentoLivro(ld, doador, res);
                    return livro;
                } else {
                    System.out.println("Saldo insufeciente");
                }
            } else {
                // Fazer solicitação

                Solicitacao d = new Solicitacao(doador, new Livro(titulo, Editora));
                ListaSolicitacao.add(d);
            }

        }

        return null;
    }


    @Override
    public void adicionaLevantamentoLivro(String titulo, Doador doador, String Editora) {
        LevantamentoLivro l;
        l = Efetuar_Levantamento(titulo, doador, Editora);
        if (l != null){
            RemoveLivro(l.livro_doado);
            ListaLevantamentoLivro.add(l);
        }



        else
            System.out.println("ERRO");
    }

    /*-----------------------------------------------------------------------------------------*/


    /*Efetuar Notificacao*/

    public void Notificar(Solicitacao solicitacao) {

        for (Solicitacao s : ListaSolicitacao) {
            if (s.equals(solicitacao)) {
                ListaSolicitacao.remove(s);
                adicionaNotificacao(new Notificacao_doad(s.getD(), LocalDate.now(), s.getL(), s));
            }
        }
    }

    public void adicionaNotificacao(Notificacao_doad notificacao_doad) {
        ListaNotificacaoDoad.add(notificacao_doad);
    }


    public Doador pesquisaExistenciaSolicitacao(Livro_Doado doado) {

        for (Solicitacao s2 : ListaSolicitacao) {
            if (s2.l.equals(doado)) {

                return s2.getD();
            }
        }
        return null;
    }

    public Solicitacao pesquisaSolicitacao(Doador doador) {

        for (Solicitacao s2 : ListaSolicitacao) {
            if (s2.d.equals(doador)) {

                return s2;
            }
        }
        return null;
    }

    /*-------------------------------------------------------------------------------------*/

}


