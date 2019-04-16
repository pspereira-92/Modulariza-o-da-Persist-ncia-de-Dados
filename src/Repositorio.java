import java.util.ArrayList;

public class Repositorio {

    ArrayList<Utilizador> ListaUtilizadores;
    ArrayList<TipoUtilizador> ListaTipoUtilizador;
    ArrayList<Requisicao> ListaRequisicao;
    ArrayList<Copia> ListaCopia;
    ArrayList<Livro> ListaLivro;
    ArrayList<Emprestimo> ListaEmprestimo;
    ArrayList<Notificacao> ListaNotificacao;
    ArrayList<Devolucao> ListaDevolucao;
    ArrayList<Coima> ListaCoima;

    ArrayList<Encomenda> ListaEncomenda;
    ArrayList<EntradaNovoLivro> ListaEntradaNovoLivro;
    ArrayList<PropostaAquisicao> ListaPropostaAquisicao ;
    ArrayList<RequisicaoCompra> ListaRequisicaoCompra;

    public Repositorio() {
        ListaUtilizadores = new ArrayList();
        ListaTipoUtilizador = new ArrayList();
        ListaRequisicao = new ArrayList();
        ListaCopia = new ArrayList();
        ListaLivro = new ArrayList();
        ListaEmprestimo = new ArrayList();
        ListaNotificacao = new ArrayList();
        ListaDevolucao = new ArrayList();
        ListaCoima = new ArrayList();
        ListaEncomenda=new ArrayList();
        ListaEntradaNovoLivro=new ArrayList();
        ListaPropostaAquisicao =new ArrayList();
        ListaRequisicaoCompra=new ArrayList();

    }

    public void adicionaUtilizador(Utilizador utilizador) {
        ListaUtilizadores.add(utilizador);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipo) {
        ListaTipoUtilizador.add(tipo);
    }

    public void adicionaRequisicao(Requisicao requisicao) {
        ListaRequisicao.add(requisicao);
    }

    public void adicionaCopia(Copia copia) {
        ListaCopia.add(copia);
    }

    public void adicionaLivro(Livro livro) {
        ListaLivro.add(livro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo) {
        ListaEmprestimo.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao) {
        ListaNotificacao.add(notificacao);
    }

    public void adicionaDevolucao(Devolucao devolucao) {
        ListaDevolucao.add(devolucao);
    }

    public void adicionaCoima(Coima coima) {
        ListaCoima.add(coima);
    }

    public void adicionaEncomenda(Encomenda encomenda) {
        ListaEncomenda.add(encomenda);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) {
        ListaEntradaNovoLivro.add(entradaNovoLivro);
    }


    public void adicionaPropostaRequisicao(PropostaAquisicao propostaAquisicao ){
        ListaPropostaAquisicao .add(propostaAquisicao );
    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) {
        ListaRequisicaoCompra.add(requisicaoCompra);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {
        for (Emprestimo e : ListaEmprestimo) {
            if (e.getRequisicao() == r)
                return e;
        }
        return null;
    }
}

