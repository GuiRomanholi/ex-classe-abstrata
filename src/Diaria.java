public class Diaria extends Despesa {
    private double qtdeDiaria;

    public double getQtdeDiaria() {
        return qtdeDiaria;
    }

    public void setQtdeDiaria(double qtdeDiaria) {
        this.qtdeDiaria = qtdeDiaria;
    }

    @Override
    public void calcularDespesa(int qtdeDiaria) {
        setQtdeDiaria(qtdeDiaria);
        getValorTotal() = qtdeDiaria * 50;
    }

    @Override
    public void listarDespesa(){
        setQtdeDiaria();
    }
}
