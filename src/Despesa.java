public abstract class Despesa {
    private String descricao;
    private double valorTotal;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void cadastraDespesa(){
        setDescricao(descricao);
        setValorTotal(0);
    }
    public abstract void calcularDespesa();
    public abstract void listarDespesa();
}
