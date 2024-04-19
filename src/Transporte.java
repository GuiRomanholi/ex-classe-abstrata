public class Transporte extends Despesa {
    private double kmPercorrido;
    private double valorPedagio;

    public double getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(double kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }

    public double getValorPedagio() {
        return valorPedagio;
    }

    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }

    @Override
    public void calcularDespesa() {

    }

    @Override
    public void listarDespesa() {

    }
}
