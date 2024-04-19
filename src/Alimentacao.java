public class Alimentacao extends Despesa{
    private double nomeRestaurante;

    public double getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(double nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }


    @Override
    public void cadastraDespesa() {
        super.cadastraDespesa();
    }

    @Override
    public void calcularDespesa() {

    }

    @Override
    public void listarDespesa() {

    }
}
