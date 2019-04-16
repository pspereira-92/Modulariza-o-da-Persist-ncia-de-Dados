public class TipoUtilizador {
    public TipoUtilizador(String descricao, int prazoEmprestimo) {
        this.descricao = descricao;
        this.prazoEmprestimo = prazoEmprestimo;
    }

    String descricao;
    int prazoEmprestimo;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrazoEmprestimo() {
        return prazoEmprestimo;
    }

    public void setPrazoEmprestimo(int prazoEmprestimo) {
        this.prazoEmprestimo = prazoEmprestimo;
    }
}
